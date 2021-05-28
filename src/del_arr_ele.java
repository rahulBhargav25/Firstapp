import java.util.Scanner;
public class del_arr_ele {
	public static void main(String args[]) {
		int n, x, flag=1, loc=0;
		Scanner s =new Scanner (System.in);
		System.out.print("Enter the no of elements you want in an array:");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter all items:");
		for (int i =0; i<n;i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the element you want to delete:");
		x=s.nextInt();
		for (int i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				loc=i;
				break;
			}
			else {
				flag=0;
			}
			
		}
		if(flag==1) {
			for (int i=loc+1;i<n;i++) {
				a[i-1] = a[1];
				
			}
			System.out.print("After deleting");
			for (int i=0;i<n-1;i++) {
				System.out.println(a[i]+",");
			}
		}
		else {
			System.out.println("Elements not found");
		}
	}
}
