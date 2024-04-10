package Dz3S_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group>{
    public List<Group> groups;
    public Stream(){
        groups = new ArrayList<>();
    }
    public void addGroup(Group group){
        groups.add(group);
    }
    public Iterator<Group> iterator(){
        return groups.iterator();
    }
}
