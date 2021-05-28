import java.util.*;
public class twodarray {
	public static void main(String[] args) {
		int n, flag=0, loc=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the element you want to delete");
		int x = s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i] == x) {
				flag=1;
				loc=i;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			for(int i=loc+1;i<n;i++) {
				a[i-1]=a[i];
			}
			System.out.println("New array after removal: ");
			for(int i=0;i<n-1;i++) {
				System.out.println(a[i]+", ");
			}
		}
		else {
			System.out.println("Element not found");
		}
	}
}
