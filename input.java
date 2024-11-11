//  How To Take Input In Array

import java.util.*;

class Arr {
    Scanner sc = new Scanner(System.in);
     int Id [] = new int [5];
    public void ArrInput(){
        System.out.println("enter your ID ");
     for(int i=0;i<Id.length;i++){
        Id[i]= sc.nextInt();
     }
    }
    public void ArrPrint(){
        for(int i=0;i<Id.length;i++){
            System.out.println(" Id No "+ i+ " is "+Id[i]) ;
         }
    }
}
public class input {

    public static void main(String[] args) {
       Arr I = new Arr();
       I.ArrInput();
       I.ArrPrint();
        
    }
}