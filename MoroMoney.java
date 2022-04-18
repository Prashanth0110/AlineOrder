import java.util.Scanner;
import java.lang.Math;
public class MoroMoney {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("value of n : ");
		int n = sc.nextInt();
		if(1 <= n && n<= Math.pow(10, 5)) 
		{
			int[] array = new int[n];
			System.out.println("Enter the elements of the array: "); 
			int k = 0; 
			for(int i=0; i<n; i++)  
			{  
				array[i]=sc.nextInt(); 
				k=array[i] + k;
				
			} 
		System.out.println(k);
			
		} else System.out.println("Error at value of n ");
	}

}
