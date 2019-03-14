package com.castgroup.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateMaxDifference {
	public static void main(String[] args) {
		System.out.println("Digite o tamanho da sua lista de inteiros:");
        Scanner scan = new Scanner(System.in);
        int totalOfNumbers = scan.nextInt();
    	while(totalOfNumbers > 210 || totalOfNumbers < 1)
    	{
    		System.out.println("O numero de elementos deve ser maior que 0 e menor que 210.");
    		totalOfNumbers = scan.nextInt();
    	}
        
        System.out.println("Digite os numeros:\n");
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        
        for (int i=0; i<totalOfNumbers; i++)
        {
        	int value = scan.nextInt();
        	while(value > 106 || value < -106)
        	{
        		System.out.println("O numero deve esta entre -106 e 106.");
        		value = scan.nextInt();
        	}
        	listOfNumbers.add(value);
        }
        System.out.println("A maior diferença é: " + maxDifference(listOfNumbers));
    }
	
	private static int maxDifference(List<Integer> listOfNumbers) {
		int maxDifference = listOfNumbers.get(0);
		for (int i=1; i<listOfNumbers.size(); i++)
        {
			for (int j=0; j<i; j++) {
				if((listOfNumbers.get(i) > listOfNumbers.get(j))) {
					int difference = listOfNumbers.get(i) - listOfNumbers.get(j);
					if(difference > maxDifference)
					{
						maxDifference = difference;
					}
				}
			}
        }
		
		return maxDifference;
	}

}
