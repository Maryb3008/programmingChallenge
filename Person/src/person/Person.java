
package person;

import java.util.ArrayList;
import java.util.List;

public class Person 
{
    int id;
    String  name;
    String phoneNo;
    String address;       
       
    public static List<Person> createPerson()
    {
         List<Person> lstPerson = new ArrayList<>();
        
        Person p = new Person();       
        p.id=1011;
        p.name="David";
        p.phoneNo="832-769-2059";
        p.address="2000 Bay Area blvd ,Hoston ,Tx";
        lstPerson.add(p);
        
        Person p1 = new Person();
        p1.id=2112;
        p1.name="Mark";
        p1.phoneNo="532-769-4559";
        p1.address="300 Cyberonics ,Dallas ,Tx";
        lstPerson.add(p1);

        Person p2 = new Person();       
        p2.id=3113;
        p2.name="Steve";
        p2.phoneNo="872-469-9459";
        p2.address="811 North Main st ,Boston ,MA";
        lstPerson.add(p2);
        
        return lstPerson;
    }
    
    public static void main(String[] args)
    {        
        System.out.println("The list of Person's Details:");
        System.out.println();

        List<Person> lstPerson = createPerson();
        for(Person person : lstPerson)
        {
            System.out.println("Id:"+person.id);
            System.out.println("Name:"+person.name);
            System.out.println("Phone No:"+person.phoneNo);
            System.out.println("Address:"+person.address);
            
            System.out.println();
        }
    }
}
