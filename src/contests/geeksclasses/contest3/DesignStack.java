package contests.geeksclasses.contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class DesignStack {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int gn(BufferedReader br) throws IOException, NumberFormatException{
        return Integer.parseInt(br.readLine());
    }
	
	public static void main (String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    Queue<Integer> queue;
	    
	    for(int i=0;i<t;i++){
	    	queue = new LinkedBlockingQueue<>();
	    	
	        int numOfQueries = scan.nextInt();
	        for(int j=0;j<numOfQueries;j++){
	            
	            int type = scan.nextInt();
	            if(type == 1){
	                int num = scan.nextInt();
	                queue.add(num);
	            }
	            
	            if(type == 2){
	                if(!queue.isEmpty()){
	                   queue.remove();
	                }
	            }
	            
	            if(type == 3){
	                if(queue.isEmpty()){
	                   System.out.println("-1"); 
	                }else{
	                    System.out.println(queue.peek());
	                }
	            }
	            
	        }
	        
	    }
		
		/*Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		System.out.println(queue);
		System.out.println(queue.peek());*/
	}
	
}
