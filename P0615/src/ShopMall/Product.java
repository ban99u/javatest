package ShopMall;

public class Product {
	private String Pro_name;
	private int price;
	private int point;
	
	Product(){}
	Product(String Pro_name,int price,int point){
		this.Pro_name = Pro_name;
		this.price = price;
		this.point = point;
	}
	
	
	public String getPro_name() {
		return Pro_name;
	}
	public void setPro_name(String pro_name) {
		this.Pro_name = pro_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
