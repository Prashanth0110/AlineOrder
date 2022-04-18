import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numOfWareHouses = sc.nextInt();
		int numOfGoods = sc.nextInt();
		int a[]= new int [numOfWareHouses +1];
		int k;
		int j;
		int i ;
		for( i=1;i<= numOfWareHouses;i++) {
			a[i]= numOfGoods%i;
			
		}
			 k= a[1];
			 for(j=1;j<=numOfWareHouses;j++) {
				 if(a[j]>a[j-1]) {
					 k = a[j];
				 }
			 }
			 System.out.println(k);
			 
	}

}
