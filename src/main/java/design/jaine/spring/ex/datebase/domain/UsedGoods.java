package design.jaine.spring.ex.datebase.domain;

import java.time.LocalDateTime;

// usedGoods의 한행의 정보를 모두 저장할 수 있는 객체를 위한 클래스
// 테이블의 컬럼이름과 정확히 일치하는 이름의 멤버 변수 정의
// Domain, Entity
public class UsedGoods {
	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String description;
	private String produceImage;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getProduceImage() {
		return produceImage;
	}
	public void setProduceImage(String produceImage) {
		this.produceImage = produceImage;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
		
}
