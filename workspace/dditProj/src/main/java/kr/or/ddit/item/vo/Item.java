package kr.or.ddit.item.vo;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

//Data 어노테이션 : loombook에서 제공해줌 . getter, setter 자동처리

public class Item {
	private int itemId;
	private String itemName;
	private int price;
	private String description;
	private String pictureUrl;
	private MultipartFile picture;	//이미지 업로드를 위한 필드
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public MultipartFile getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
	
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", description=" + description
				+ ", pictureUrl=" + pictureUrl + ", picture=" + picture + "]";
	}
	
	
	
	
	
}
