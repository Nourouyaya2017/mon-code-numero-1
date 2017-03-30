
import java.util.Scanner;


public class coordonnees {
    public static void main(String[] args) {
        Scanner cor=new Scanner(System.in);
        int s=cl.nextInt();
        int t=cl.nextInt();
        NewClass p=new NewClass();
        p.setX(s);
        p.setY(t);
        System.out.println(p.getX()+"  "+p.getY());
        Distance o= new Distance();
        o.calcul(p);
    }
    
}




public class Distance {
    public void calcul(NewClass p){
        int s=p.getX();
        int t=p.getY();
        float d;
        d= (float) Math.sqrt(s*s+t*t);
        System.out.println("La distance est: "+ d);
    }
    
}
