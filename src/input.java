import java.util.Scanner;
public class input {
//init scanner class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = scan.nextInt();
		//declare array using user defined size of the array
		int[] arr = new int[n];
		
		//populate array using for loop
		System.out.println("enter elements of array");
		for (int i = 0; i< n; i++) {
			arr[i] = scan.nextInt();
		}
		
		//take input from user which element user want to find
		System.out.println("Enter element that you want to find in array");
//		boolean isThere;
		int e = scan.nextInt();
		
//			
			
			System.out.println(arr[e]);
	}			
				
		
}

//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class input {
//
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//        
//       
//        if (N%2==0 && (N<=5 && N>=2)) {
//        	System.out.println("Not weird");
//
//        }
//        else if (N%2==0 && (N<=20 && N>=6)) {
//        	System.out.println("Wierd");
//			
//
//        }
//        else if (N%2==0 && N>20) {
//        	System.out.println("Not Weird");
//        }
//        else if (N%2!=0) {
//        	System.out.println("Weird");
//        }
//        else {
//        	System.out.println("Not Weird");
//        }
//        
//    }
//}