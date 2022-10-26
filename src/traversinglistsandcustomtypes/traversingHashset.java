package traversinglistsandcustomtypes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class traversingHashset {
    public static void main(String[] args) {
        // Creating hashset
        Set<String> set = new HashSet<String>();
        // Add objects to hashset
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");
//        // Show set through Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            itr.next();

            itr.remove();

        }
        System.out.println(itr.hasNext());
//        // Show set through for-each
//        System.out.println();
//        for (String obj : set) {
//            System.out.print(obj + ", ");
//            set.remove(obj);
//
//        }

//        for (int i = 0; i < 4 ; i++) {
//            System.out.println( set.get);
//        }
    }
}
