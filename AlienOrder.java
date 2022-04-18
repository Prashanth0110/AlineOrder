import java.util.Scanner;
public class AlienOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String words[]= new String[10];
		char line[] = new char[n] ;
		char secondChar;
		for(int i=0;i<n;i++) {
			words[i]= sc.next();
		}
		for(int j=0;j<n;j++) {
			line[j]= words[j].charAt(0);
		}
		char c;
		int k=0;
		System.out.print(line);
	   process: for(c = 'a'; c <= 'z'; ++c) {
	    	if(k<26) {
	    		for(char x : line) {
	    			if(c == x) {
	    				continue process;
	    				}
	    		}
	    	}
	    	char orders[] = new char[30];
	    	orders[k]= c;
	    	k++;
	    	
	    	System.out.print(orders);
	    }

		
	}

}
