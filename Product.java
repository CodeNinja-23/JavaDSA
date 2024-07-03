import java.util.*;
public class Product {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Mul(a,b);
        sc.close();

    }

    static void Mul(int x, int y)
    {
        
        int p = x*y;
        System.out.println(p);
    }}
    

