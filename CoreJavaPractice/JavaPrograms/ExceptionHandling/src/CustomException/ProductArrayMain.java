package CustomException;

import java.util.Scanner;

public class ProductArrayMain {

	public static void main(String[] args) throws ProductNotFoundException {
		Scanner sc = new Scanner(System.in);
		Products[] productArray = new Products[3];
		System.out.println("enter product details to add in an array");
		for(int i=0;i<productArray.length;i++) {
			Products pr = new Products();
			System.out.println("Enter the productId");
			pr.setProductId(sc.nextInt());
			System.out.println("Enter the productName");
			sc.nextLine();
			pr.setProductName(sc.nextLine());
			System.out.println("Enter the productPrice");
			pr.setProductPrice(sc.nextInt());
			System.out.println("Enter the productCategory");
			sc.nextLine();
			pr.setProductCat(sc.nextLine());
			productArray[i] = pr;
		}
		
		System.out.println("list of all Products........");
		System.out.println("================================================");
		for (Products product : productArray) {
			System.out.println(product);
		}
		
		
		System.out.println("Enter the Product id to search.....");
		int pid = sc.nextInt();
		try {
			for(int i=0;i<productArray.length;i++) {
				if(productArray[i].getProductId() == pid) {
					System.out.println("product found");
				}
				//else {
				//	throw new ProductNotFoundException ("Product does not exist with id = " + pid);
				//}
			}
		}finally {
			sc.close();
		}
		
	}


	}

}
