// Name: SNEH PATEL
// PRN: 2207126113
// Batch: AIML B2 


// fibonaaci.java 

import java.io.*;
import java.util.* ; 
public class Fibonaaci{
	public static void main(String args[]){
		// command line arguments 
		/*
		Scanner sc=new Scanner(System.in);
		int number =  sc.nextInt();
		*/
		/*int number = Integer.parseInt(args[0]);
		*/
		// buffered reader is primarily used for file handling 
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try{

			int number = Integer.parseInt(reader.readLine());

			int i ;
			for(i=0 ; i<number ; i++){
				System.out.println(Fibonaccialgo(i)+ " ");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}	
	}
    // fibonacci series 
	public static int Fibonaccialgo(int number){
    
		if(number<=1){
			return number ; 

		}
		else{
			return Fibonaccialgo(number-1) + Fibonaccialgo(number-2);
		}
	}
}