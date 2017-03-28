
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
public class Palindrome {
       public static void main(String []arg){
        String mot="";
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("entrer un mot");
        mot=scan.nextLine();
 
        int i=0;
        int n = mot.length();
        boolean trouve= true;
        
        while(i<n && trouve){
            if(mot.charAt(i) != mot.charAt(n-i-1)){
                
                trouve=false;
           }
            
            i+=1;
        }
         if(trouve) {System.out.println("Le mot "+mot+" est un palindrome");}
         else{System.out.println("Le mot "+mot+" n'est pas un palindrome");}
    }
    
}
