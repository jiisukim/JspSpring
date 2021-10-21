package article.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import article.dao.ArticleContentDao;
import article.dao.ArticleDao;
import article.vo.Article;
import article.vo.ArticleContent;
import article.vo.WriteRequest;
import article.vo.Writer;
import jdbc.ConnectionProvider;
import util.JdbcUtil;

public class WriteArticleService {
   // 작성자, 제목, 작성일, 수정일
   private ArticleDao articleDao = new ArticleDao();
   // 글 내용
   private ArticleContentDao contentDao = new ArticleContentDao();
   
   // 글을 입력함
   // WriteRequest : ew Writer(req.getParameter("writerId"), req.getParameter("writerName"))
    // , req.getParameter("title")
    // , req.getParameter("content")
   public int write(WriteRequest req) {
      Connection conn = null;
      
      try {
         conn = ConnectionProvider.getConnection();
         // insert이므로.. 트랜잭션 처리(수동으로 commit)
         conn.setAutoCommit(false);
         //---------------------- Article 테이블 insert 시작 ----------------------
         Date now = new Date();
         // 요청파라미터 담고있는 그릇인 req -> DB에 넣기 전용 그릇이 Article로 대응처리
         // int articleNo, Writer writer, String title, Date regdate, Date moddate, int readCnt
         Article article =
               new Article(0, req.getWriter(), req.getTitle(),
                     now, now, 0);
         // ARTICLE 테이블로 insert
         Article savedArticle = articleDao.insert(conn, article);
         if(savedArticle == null) {
            throw new RuntimeException("fail to insert article");
         }
         //---------------------- Article 테이블 insert 끝 ----------------------
         //---------------------- Article_content 테이블 insert 시작 ----------------------
         // int articleNo, String content
         // savedArticle 객체 articleDao.insert후에 return받은 Article 객체 이므로
         ArticleContent content = new ArticleContent(savedArticle.getArticleNo(),req.getContent());
         // article_content 테이블로 insert
         ArticleContent savedContent = contentDao.insert(conn, content);
         if(savedContent == null) {   // article_content 테이블에 insert가 실패하면..
            throw new RuntimeException("fail to insert article_content");
         }
         //---------------------- Article_content 테이블 insert 시작 ----------------------
         conn.commit();
         // article/article_content 테이블에 입력된 article_no를 리턴
         return savedArticle.getArticleNo();
      }catch (RuntimeException e) {
         JdbcUtil.rollback(conn);
         // 핸들러 throw
         throw e;
      }catch (SQLException e) {
         JdbcUtil.rollback(conn);
         // 핸들러 throw
         throw new RuntimeException();
      }finally {
         JdbcUtil.close(conn);
      }
      
   }
}