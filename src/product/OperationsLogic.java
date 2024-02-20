package product;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsLogic {
	Set<Product> set = new LinkedHashSet<Product>();

	public void addProduct(String proId, String proName, Double unitPrice, Integer quantity, String proCategory,
			String productDescription) {
		System.out.println("Adding...........");
		Product product = new Product(proId, proName, unitPrice, quantity, proCategory, productDescription);
		set =  Stream.concat(set.stream(), Stream.of(product)).collect(Collectors.toSet());
	}

	public void searchProduct(String productId) {
		System.out.println("Searching...........");

		boolean found = set.stream().filter(p -> p.getProductId().equals(productId))
				.peek(p -> System.out.println("Product found: " + p)).findFirst().isPresent();

		if (!found) {
			System.out.println("Product not found for ID: " + productId);
		}

//	    set.forEach(System.out::println); 
	}

	public void searchCategory(String productCategory) {
		System.out.println("Searching..Category.........");

		boolean found = set.stream().filter(p -> p.getProductCategoty().equals(productCategory))
				.peek(p -> System.out.println("Product found: " + p)).findFirst().isPresent();

		if (!found) {
			System.out.println("Product not found for Category: " + productCategory);
		}

//	    set.forEach(System.out::println); 
	}

	public void removeProduct(String productId1) {
		System.out.println("Removing Product...........");

		boolean found = set.stream().filter(p -> p.getProductId().equals(productId1)).findFirst().
			map(p -> {
			System.out.println("Product found: " + p);
			set.remove(p);
			return true;
		}).orElse(false);

		if (!found) {
			System.out.println("Product not found for ID: " + productId1);
		}

//	    set.forEach(System.out::println); 
	}

	public void updateProduct(String productId2, Integer qty, Double price) {
		System.out.println("Updating Product.........");

		boolean found = set.stream().filter(p -> p.getProductId().equals(productId2))
				.peek(p -> System.out.println("Product found: " + p)).findFirst().map(p -> {
					p.setProductQuantity(qty);
					p.setProductUnitPrice(price);
					return true;
				}).orElse(false);

		if (!found) {
			System.out.println("Product not found for ID: " + productId2);
		}

//	    set.forEach(System.out::println); 
	}

	public void getAll() {
		set.forEach(System.out::println);
	}

}