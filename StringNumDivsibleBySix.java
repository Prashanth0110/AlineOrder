import java.util.Scanner;

public class StringNumDivsibleBySix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of String : ");
		int n = sc.nextInt();
		System.out.println("Value of String : ");
		String s = sc.next();
		String temp;
		int a = 0;
		int b = (n)*(n+1);
		String arr[] =  new String[(b/2)];
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <= n; j++) {
				temp = s.substring(i,j);
				arr[a++]=temp;
			}

		}
			for (int l = 0; l < n; l++) {
	        int array[] = (int) arr[l];
		}
	}
}
