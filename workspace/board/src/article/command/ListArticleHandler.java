package article.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.ListArticleService;
import article.vo.Article;
import mvc.command.CommandHandler;

public class ListArticleHandler implements CommandHandler{
	private ListArticleService listService = new ListArticleService();
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<Article> articlePage = listService.getArticlePage();
		req.setAttribute("articlePage", articlePage);
		
		return "/WEB-INF/view/listArticle.jsp";
	}

}
