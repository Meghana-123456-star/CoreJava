import java.util.*;
public class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height:");
        int height=sc.nextInt();
        System.out.println("Enter width:");
        int width=sc.nextInt();
        int p=2*(height+width);
         System.out.println("Area:"+(height*width));
         System.out.println("parimeter:"+p);
    
    }
}