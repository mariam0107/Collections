
package collections1;

import java.util.Comparator;

public class Cow implements Comparator<Cow> {
  private String id;
  private   int weight;

    public Cow(String id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    Cow() {
        
    }

    public String getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compare(Cow o1, Cow o2) {
        return o1.id.length()-o2.id.length();
    }
    public String toString()
    {
        return "ID   "+getId()+"   WEIGHT"+getWeight();
    }
  
}
