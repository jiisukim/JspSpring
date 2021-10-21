package kr.or.ddit.item.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.item.dao.ItemDao;
import kr.or.ddit.item.service.ItemService;
import kr.or.ddit.item.vo.Item;

//스프링에서 이 클래스는 서비스 클래스야 알려줌
@Service
public class ItemServiceImpl implements ItemService{
	//데이터베이스 접근을 위해 itemDao 인스턴스를 주입받음
	@Autowired
	ItemDao itemDao;
	
	//데이터 입력
	//메소드 재정의
	@Override
	public int create(Item item) {
		//insert 후의 itemId를 return해줌
		return this.itemDao.insert(item);
	}
	
	@Override
	public int createAtch(Map<String,Object>map) {
		return this.itemDao.insertAtch(map);
	}
	@Override
	public int create(Item item, String[][] pictureUrl) {
		//inert후의 itemId를 return해줌 -> Item 테이블로 insert
		int itemId= this.itemDao.insert(item);
		//ITEM_ATCH 테이블로 insert
		for(int i = 0; i<pictureUrl.length;i++) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("pictureUrl", pictureUrl[i][0]);
			map.put("pictureSize", pictureUrl[i][1]);
			map.put("itemId", itemId);
			this.itemDao.insertAtch(map);
		}
		//insert된 이미지의 개수
		return pictureUrl.length;
	}
	
	
}
