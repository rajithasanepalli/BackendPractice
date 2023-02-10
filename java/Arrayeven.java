package Arrayeven;

public class Arrayeven {

	public static void main(String[] args) {
		// creating array and inserting elements into array
		int arr[] = { 2, 3, 5, 6, 8 };
		// print  even numbers in array using loop
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even elements are at index" +i + "=" + arr[i]);
			}
		}
	}
}
