package kr.or.ddit.item.service;

import java.util.Map;

import kr.or.ddit.item.vo.Item;

public interface ItemService {
	//메소드 시그니쳐
	int create(Item item);
	
	//ITEM_ATCH에 입력
	int createAtch(Map<String, Object> map);

	int create(Item item, String[][] pictureUrl);

}
