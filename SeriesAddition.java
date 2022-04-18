import java.util.Scanner;
public class SeriesAddition {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int total = sc.nextInt();
	        int cost1 = sc.nextInt();
	        int cost2 = sc.nextInt();
	        int n;
	        if(cost1<=cost2){
                 n = total/cost1;}
	        else{
                 n = total/cost2;}
	        
	        int k = total;
	        int ways = 1;
	        for(int i=0;i<n;i++){
                if(cost1<=cost2){
                total = total - (i*cost1); 
	        	ways += 1 + total/cost2 ;
                }
                
                else {		
                total = total - (i*cost2); 
        	    ways += 1 + total/cost1 ;
                }
                total = k; 
	        }
	        System.out.println(ways);;
	        
	    }
   
   
}
