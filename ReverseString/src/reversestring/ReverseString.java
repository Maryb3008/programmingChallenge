
package reversestring;

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the String to Reverse : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("The Reverse String is :");
        ReverseString.strReverse(str);
        System.out.println();
    }   
    public static void strReverse(String str)
    {
        int i;
        char ch[]=new char[str.length()];       
        for(i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
    }
}
