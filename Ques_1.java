
    // count the number of occurance of a particular element in Array
    // occurance of x in array arr[i]

import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println(" Enter the Length of Array ");
        int n = s.nextInt();
        int []Array1 = new int[n];
        
       
    
        Arr I = new Arr();
       I.ArrInput(Array1);
       I.ArrPrint(Array1); 
       
       
       int count = 0;
       System.out.println();
       System.out.println(" enter the number you want Check the number of Occurance in an Array");
       int num = s.nextInt();
       for (int i = 0; i <Array1.length; i++) {
           if (Array1[i]==num) {
               count++;
           }
           
       }
       System.out.println(num+" occurs "+count+" Times");
    }
}
