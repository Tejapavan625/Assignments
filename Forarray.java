package com.training.assigment;

import java.util.Scanner;

public class Forarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] oddnumber= new int [5];
		int [] evennumber= new int [5];
		
		int even=0;
		int odd=0;
		Scanner sc= new Scanner (System.in);
		int a=sc.nextInt();
		int [] arr= new int [a];
		for(int i=0;i<a;i++) 
		{
			arr[i]= sc.nextInt();
		}
		for(int i: arr){
			if(i%2==0) 
			{
				evennumber[even]= i;
				even++;
			}
			else{	
			oddnumber[odd]=i;
			 odd++;
			}
		}
		for(int i: evennumber) {
			System.out.println("evennumber"+i);
		}
		for(int i:oddnumber) {
			System.out.println("oddnumber"+i);
		}

				
				
	

	}

}
