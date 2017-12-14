
package collections1;

import java.util.Objects;

public class PopStar implements Comparable<PopStar> {
    String name;
    int age;

    public PopStar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    

    public int getAge() {
        return age;
    }
public String toString()
{
    return "Name :"+getName()+"Age :"+getAge();
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PopStar)
        {
            PopStar p=(PopStar)obj;
            return (p.name.equals( this.name));
            } else {
                return false;
            }
        }

    @Override
    public int compareTo(PopStar o) {
        return o.getName().compareTo(this.getName());
    }
    
    
    
}

