import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by seandunn92 on 9/4/18.
 */
public class RLDIterator implements Iterator {

    private Iterator<Character> itr;

    RLDIterator(){
        char[] nameArray = "1B1r1e2t1s".toCharArray();
        ArrayList<Character> nameArrayList= new ArrayList<Character>();
        for (char nameChar : nameArray){
            nameArrayList.add(nameChar);
        }
        itr = nameArrayList.listIterator();

    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public Character next() {
        itr.next();
        return itr.next();
    }
}