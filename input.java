//  How To Take Input In Array
// how to Clone array 

import java.util.*;

class Arr {
    Scanner sc = new Scanner(System.in);
     
    public void ArrInput(int Id []){
        System.out.println("enter your Data");
     for(int i=0;i<Id.length;i++){
        Id[i]= sc.nextInt();
     }
    }
    public void ArrPrint(int Id []){
        for(int i=0;i<Id.length;i++){
            System.out.print(" "+Id[i]) ;
         }
    }
}
public class input {

    public static void main(String[] args) {
        int Id [] = new int [5];
       Arr I = new Arr();
       I.ArrInput(Id);
       I.ArrPrint(Id);
      int copy [] = Id.clone();                         // copy of array
      copy[1]=10;
      copy[2]=20;
      System.out.println();
      I.ArrPrint(copy);
       
        
    }
}