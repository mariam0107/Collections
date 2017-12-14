
package collections1;

import static collections1.Collections1.sc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PopStarObjectsMain {
    public static void main(String[] args) {
        PopStar p1=new PopStar("Maya",21);
        PopStar p2=new PopStar("Abba",22);
        PopStar p3=new PopStar("baba",18);
        PopStar p4=new PopStar("mango",30);
        PopStar p5=new PopStar("otta",45);
        
        List<PopStar> ps=new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);
//        if(p1.equals(p2))
//            System.out.println("THEY are equal");
//        else
//            System.out.println("THEY are not equal");
System.out.println("ENTER THE NAME");
String s=sc.nextLine();
        System.out.println("ENTER AGE");
        int age=sc.nextInt();
        PopStar p6=new PopStar(s,age);
        if(ps.contains(p6))
            System.out.println("IT'S HERE");
        else
            System.out.println("IT'S NOT HERE");
        Collections.sort(ps);
        Iterator i1=ps.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
        
    }
 
}
