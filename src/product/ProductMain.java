package product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperationsLogic ol = new OperationsLogic();
		Product p = new Product();
		System.out.println("*********************************");
		System.out.println("SHOPPING CART---MASSILTEAM.COM");
		System.out.println("*********************************");
		System.out.print("Enter the Admin UserName:");
		String name = sc.next();
		System.out.print("Enter the password:");
		String pwd = sc.next();
		boolean flag = true;
		try {
			if (name.equals("massil") && pwd.equals("massil")) {
		
			while (flag) {
				System.out.print("Enter Your Choice:" + "\n 1.Adding Products--Enter add"
						+ "\n*********************************" + "\n 2.Searching for Product--Enter search"
						+ "\n*********************************"
						+ "\n 3.Searching By its catagory---Enter searchCategory"
						+ "\n*********************************" + "\n 4.Removing by product Id---Enter removeById"
						+ "\n*********************************" + "\n 5.Updating the product--Enter updateQtyPrc"
						+ "\n*********************************" + "\n 6.Display All Products---Enter display"
						+ "\n*********************************" + "\n 7.exit------Enter exit"
						+ "\n***********************************\n\n");

				String choice = sc.next();
				switch (choice) {
				case "add":
					System.out.println("Addition case");
					System.out.print("Enter Product Id:");
					String proId = sc.next();

					System.out.print("Enter Product NAme:");
					String proName = sc.next();
					System.out.print("Enter Product Unit Price:");
					double proUnitPrice = sc.nextDouble();
					System.out.print("Enter Product Quantity:");
					Integer quantity = sc.nextInt();
					System.out.print("Enter Product Catagory");
					String proCategory = sc.next();
					System.out.print("Enter Product Description:");
					String proDescription = sc.next();
					ol.addProduct(proId, proName, proUnitPrice, quantity, proCategory, proDescription);
					break;

				case "search":// OperationsLogic.searchProduct();
					System.out.println("search case");
					System.out.println("Enter your product Id:");
					String productId = sc.next();

					ol.searchProduct(productId);
					break;

				case "searchCategory":
					System.out.println("search Category case");
					System.out.println("Enter your product Category:");
					String productCategory = sc.next();

					ol.searchCategory(productCategory);
					break;
				case "removeById":
					System.out.println("removeById case");
					System.out.println("Enter your product Id:");
					String productId1 = sc.next();

					ol.removeProduct(productId1);
					break;
				case "updateQtyPrc":
					System.out.println("Update case---Qty and Price ");
					System.out.println("Enter your Product Id:");
					String proId2 = sc.next();
					System.out.println("Enter Quantity ");
					Integer qty = sc.nextInt();
					System.out.println("Enter Price");
					Double prc = sc.nextDouble();

					ol.updateProduct(proId2, qty, prc);
					break;

				case "display":
					System.out.println("display");
					ol.getAll();
					break;

				case "exit":
					flag = false;
					System.out.println("exiting ");

					// default: System.out.println("Invalid Choice");
				}

			}

		} else {
			System.out.println("Invalid Authentication");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
