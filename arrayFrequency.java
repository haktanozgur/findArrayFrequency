package com.haktanozgur.findArrayFrequency;

public class arrayFrequency {
	
    public static void main(String[] args) {

        int[] numbers= {10 , 20 ,30,40,30,10,50,60,70,20,10,30,80,90,80};

        for(int i = 0;i < numbers.length;i++) {
            int count = 0;
            
            for(int j = 0;j < numbers.length;j++) {
                if(numbers[j] == numbers[i]) {
                    count += 1;
                }           
            }
            System.out.println(numbers[i]+" sayısı "+count + " tekrar etmiştir..." ); 
        }   
    }

}
