
package collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Party {
    private String[] his,hers,Zacks;
    ArrayList<String> hisFriends,herFriends,Zacksfriends;

    public Party() {
       String[] his={"Zack","Arvid","Wilhem","Anna","Adam","Albert","August","Doris"};
       String[] hers={"Stefan","Sara","Sune","Hugo","Lotta","Anna","Adam","Albert","Annton"};
       String[] Zacks={"Hugo","Albert","Arvid","Anna"};
       
       
       hisFriends=new ArrayList<>(Arrays.asList(his));
       herFriends=new ArrayList<>(Arrays.asList(hers));
       Zacksfriends=new ArrayList<>(Arrays.asList(Zacks));
    }

    public String[] getHis() {
        return his;
    }

    public void setHis(String[] his) {
        this.his = his;
    }

    public String[] getHers() {
        return hers;
    }

    public void setHers(String[] hers) {
        this.hers = hers;
    }

    public String[] getZacks() {
        return Zacks;
    }

    public void setZacks(String[] Zacks) {
        this.Zacks = Zacks;
    }

    public ArrayList<String> getHisFriends() {
        return hisFriends;
    }

    public void setHisFriends(ArrayList<String> hisFriends) {
        this.hisFriends = hisFriends;
    }

    public ArrayList<String> getHerFriends() {
        return herFriends;
    }

    public void setHerFriends(ArrayList<String> herFriends) {
        this.herFriends = herFriends;
    }

    public ArrayList<String> getZacksfriends() {
        return Zacksfriends;
    }

    public void setZacksfriends(ArrayList<String> Zacksfriends) {
        this.Zacksfriends = Zacksfriends;
    }
    public ArrayList<String> getAllFriends()
    {
        Set<String> allFriends = new HashSet(hisFriends);
        allFriends.addAll(herFriends);
        ArrayList<String> na=new ArrayList<String>(allFriends);
        return na;
    }

    
       
}

