
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
public class Binaire {
    public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    System.out.println("entrer un chiffre");
    int n=scan.nextInt();
    long bin=0;
    int r ,i=0;
    System.out.print("La valeur de "+n);
    while(n>0){
        r=n%2;
        bin+=r*(int)Math.pow(10, i);
        n=(int)(n/2);
        i+=1;
                
    }
    System.out.println(" en binaire est "+bin);
    
    
    
    } 
}
