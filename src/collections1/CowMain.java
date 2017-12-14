
package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CowMain {
    public static void main(String[] args) {
        List<Cow> c=new ArrayList<>();
        Cow c1=new Cow("Jamanthi",22);
        Cow c2=new Cow("laya",24);
        Cow c3=new Cow("Soya",32);
        Cow c4=new Cow("Joya",31);
        
        
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
       
        Collections.sort(c,new Cow());
        for (Cow cow : c) {
            System.out.println(cow);
        }
    }
}
