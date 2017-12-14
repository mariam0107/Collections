package collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collections1 {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Party p = new Party();
        System.out.println("1.INVITE ALL");
        System.out.println("2.LIST WITHOUT ZACK AND HIS FRIENDS");
        System.out.println("3.DO YOU WANT TO INVITE BOTH WILHEM AND DORRIS,IF YES REMOVE WILHEM");
        System.out.println("4.DO YOU WANT TO INVITE LOTTA FOR THE PARTY,THEN ALL FRIENDS WITH A WILL BE DELETED");
        System.out.println("5.RANDOM PLACEMENT LIST");
        System.out.println("ENTER CHOICE");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:inviteAll(p);
            break;
            case 2:NoZackandFriends(p);
            break;
            case 3:removeWilhem(p);
            break;
            case 4:removeAllA(p);
            break;
            case 5:randomPlacementList(p);
            break;
            default:System.out.println("WRONG CHOICE");
        }
        
    }
public static void inviteAll(Party p)
{
        System.out.println("LIST OF ALL");
        System.out.println("**************");
        ArrayList<String> a=p.getAllFriends();
      System.out.println("ALL INVITED ARE:");
        Iterator<String> i1 = a.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        
}
public static void NoZackandFriends(Party p)
{
    ArrayList<String> a=p.getAllFriends();
   a.removeAll(p.getZacksfriends());
   a.remove("Zack");
        Iterator<String> i1 =a.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        } 
public static void removeWilhem(Party p)
{
    ArrayList<String> a=p.getAllFriends();
    a.remove("Wilhem");
    System.out.println("WILHEM REMOVED");
    Iterator<String> i1 = a.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
}
public static void removeAllA(Party p)
{
    ArrayList<String> a=p.getAllFriends();
   Iterator<String> i3=a.iterator();
        String s;
        while(i3.hasNext())
        {
            s=i3.next();
            if(s.charAt(0)=='A')
            {
              
                i3.remove();
        }
}
  for (String string : a) {
            System.out.println(string);
        }      
}
public static void randomPlacementList(Party p)
{ 
        ArrayList<String> a=p.getAllFriends();
        Collections.shuffle(a);
        for (String string : a) {
            System.out.println(string);
        }
    }
}
