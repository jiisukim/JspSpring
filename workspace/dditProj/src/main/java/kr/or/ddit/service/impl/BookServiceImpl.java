package kr.or.ddit.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.dao.BookDao;
import kr.or.ddit.service.BookService;

/*
 *  서비스 클래스(비즈니스 클래스, 기능구현)
 *  스프링 MVC구조에서 Controller와 DAO를  연결해주는 역할.
 *  서비스 레이어는 인터페이스(BookService)와 클래스(BookServiceImpl)를 함께 사용함
 *  스프링은 직접 클래스를 생성하는 것을 지양(싫어함).
 *  	인터페이스를 통해 접근하는 것을 권장하는 프레임 워크 
 */
//Service 어노테이션 : 스프링에게 나는 서비스 클래시야 라고 알려줌
@Service
public class BookServiceImpl implements BookService{
	//private BookDao bookDao = BookDao.getInstance();
	
	@Autowired
	BookDao bookDao;
	
	@Override
	public String create(Map<String, Object> map) {
		//insert 쿼리실행. 성공(1) 실패(0)
		int affectRowCount = this.bookDao.insert(map);
		if(affectRowCount ==1) {
			return "1";
		}
		return null;
	}
	//BookService를 implement한 메소드. 메소드 재정의 => BookService 시그니쳐 처리가 필요함.
	// map => {"bookId" : "4"}
	@Override
	public Map<String,Object>detail(Map<String,Object> map){
		//Controller로 부터 받은 파라미터를 전달
		return bookDao.selectDetail(map);
	}
	
	@Override
	public List<Map<String,Object>> list(Map<String, Object> map){
		//Controller로부터  받은 파라미터(map)를 전달
		return bookDao.selectList(map);
	}
	
	//글 수정
	@Override
	public int edit(Map<String,Object> map) {
		int affectRowCount =this.bookDao.update(map);
		
		return affectRowCount;
	}

	//책삭제
	@Override
	public int remove(Map<String, Object>map) {
		//return 0또는 1 이상
		return this.bookDao.delete(map);
	}
	
}
