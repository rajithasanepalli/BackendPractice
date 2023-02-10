package CustomException;;

public class Products {
	

	private int productId;
	private String productName;
	private int productPrice;
	private String productCat;
	
	
	public  Products () {};
	
	public  Products(int productId,String productName, int productPrice,String productCat) {
		
		super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productCat = productCat;
	
	
	}
	
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCat() {
		return productCat;
	}
	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}
	
	  @Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productCat=" + productCat + "]";
	}

}
