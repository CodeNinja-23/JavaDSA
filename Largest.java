import java.util.*;
public class Largest {
    
public static void main(String args[])
{
 System.out.println("PROGRAM INITIATED TO FIND LARGEST OF ALL");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if(a>b)
 {
    if(a>c)
    {
        System.out.println("a is Largest");
    }
 }

 if(b>a)
 {
    if(b>c)
    {
        System.out.println("b is Largest");
    }
        
 }
  
  if(c>a)
  {
    if(c>b)
    {
        System.out.println("c is largest");
    }
  }
 

 
 
 sc.close();
}
}
