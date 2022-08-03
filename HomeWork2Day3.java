package HW2D3;

import javax.swing.*;
import java.util.Locale;

public class HomeWork2Day3 {
    public static void main(String[] args) {
       int e = 100;
       PrimeNumber(e);
       CalculateTax(290);
       Palindrome("nor");
    }
    public static void PrimeNumber(int a ){
      //  if(a>1&&a%1==0&&a%a==0)
        for (int i = 2; i <=a ; i++) {
            if( a%i==0 && a>1)
            {
                System.out.println(a+"It is not prime number");
            }else {
                System.out.println(a+"it is  prime number");
            }
            break;
        }

    }
   public static void CalculateTax(double p){
        if (p>=100&&p<=500){
           double t;
            t=p*(15./100);
            System.out.println(t);
        }
   }
   public static void Palindrome(String p){

       p=p.toLowerCase();
       String rev="";
           for (int j = p.length()-1; j >=0 ; j--) {
               rev += p.charAt(j);

           }System.out.println("the revers of "+p+" is "+rev);
       for (int i = 0; i < p.length(); i++) {
           if (p.charAt(i)!=rev.charAt(i)){
               System.out.println(p+" is not palindrome");
           break;}
           else {
               System.out.println(p+" is palindrome");
               break;
           }
       }
   }
}
