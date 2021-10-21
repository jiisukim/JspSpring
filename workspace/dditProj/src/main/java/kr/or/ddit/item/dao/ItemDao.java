package kr.or.ddit.item.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.item.vo.Item;

//데이터에 접근하는 클래스임을 명시(스크링이 데이터를 관리하는 클래스라고 인지하여 자바빈으로 등록해서 관리함)
@Repository
public class ItemDao {
	//root-context.xml에서 미리 만들어 놓은 connection 관련 객체를 사용하자
	//new 키워드가 아닌 의존성 주입(DI)
	//sqlSessionTemplate 타입의 객체를 ItemDao 객체에 주입. (스프링에서 자동으로 해줌(IoC))
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//ITEM 테이블에저장
	public int insert(Item item) {
		int result = this.sqlSessionTemplate.insert("item.insert",item);
		int itemId= 0;
		if(result > 0) {//inert가 잘 되었다면..
			//xml에 selectKey를 통해 setItemId()된 최근 정보를 itemId변수에 저장
			itemId = item.getItemId();
			return itemId;
		}else {	//insert 실패 ...
			return itemId;
		}
	}
	
	//ITEM_ATCH 테이블에 저장
	public int insertAtch(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("item.insertAtch",map);
	}
	
	
	
	
	
	
}
