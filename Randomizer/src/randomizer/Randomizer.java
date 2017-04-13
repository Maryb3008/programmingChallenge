package randomizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Randomizer 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the maximum range number to generate random no's");
        Scanner scan = new Scanner(System.in);
        int range =scan.nextInt();
        Randomizer(range);
    }
    
    public static void Randomizer(int range)
    {
        Queue<Integer> lstRandomNo= new LinkedList<>();
        System.out.println("The ten Random No's in the range are:");    
        for (int i=0; i<=10 ;i++)
        {
           int random = (int)(Math.random()*range+1);
           lstRandomNo.add(random);        
           System.out.println(random);    
        } 
        System.out.println();
        System.out.println("The list of Prime no's and Non Prime no's in the above Random no's are: '");
        HashMap result =RandomizerPrime(lstRandomNo);
        Set set = result.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) 
        {
           Map.Entry e = (Map.Entry)i.next();
           System.out.println(e.getKey() + ": "+e.getValue());
        }
    }
    
    public static HashMap RandomizerPrime(Queue<Integer> lstRandNo)
    {
        HashMap hashmapResult = new HashMap();
        for(int rand :lstRandNo)
	{  
           int cnt=0,n;
           for(n=2; n<rand; n++)
           {
              if(rand%n == 0)
              {
                cnt++;
                break;
              }
           }
          if(cnt == 0)
          {
            hashmapResult.put(rand,"is a Prime Number");
          }
          else
          {
            hashmapResult.put(rand,"is not a Prime Number");
          }
       }
          return hashmapResult;
    }

}
