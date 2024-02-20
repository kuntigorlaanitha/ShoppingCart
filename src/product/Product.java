package product;

public class Product {
	private String productId;
	private String productName;
	private Double productUnitPrice;
	private Integer productQuantity;
	private String productCategoty;
	private String productDescription;

	public Double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(Double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductCategoty() {
		return productCategoty;
	}

	public void setProductCategoty(String productCategoty) {
		this.productCategoty = productCategoty;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, Double productUnitPrice, Integer productQuantity,
			String productCategoty, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.productQuantity = productQuantity;
		this.productCategoty = productCategoty;
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", productQuantity=" + productQuantity + ", productCategoty=" + productCategoty
				+ ", productDescription=" + productDescription + "]";
	}

}
