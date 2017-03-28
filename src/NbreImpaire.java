
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nourou
 */
public class NbreImpaire {
      public static void main(String []arg){
       
        Scanner scan=new Scanner(System.in);
        System.out.println("entrer un chiffre");
        int n=scan.nextInt();
         int r;
        System.out.println("Les nombres impaires inferieur a "+n+" sont:");
        while(n>0){
           n=n-1;
           r=n%2;
          
           if(r==1){
               System.out.println(n);
           }
        }
      }
    
}
