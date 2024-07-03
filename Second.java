import java.util.*;
public class Second {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2!=0)
        {
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
        sc.close();
    }
}
