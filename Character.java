
import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       char ch;
       ch=sc.next().charAt(0);    
       if(Character.isUpperCase(ch))
       {
           System.out.print("1");
       }
       else
if(Character.isLowerCase(ch))
       {
           System.out.print("0");
       }
       else
       {         
           System.out.print("-1");
       }
    }
}
