package hashsetandlinkedhashsetwithhashcode;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // init set
        LinkedHashSet<Student> set = new LinkedHashSet<Student>();
        // create students object
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");
        Student student5 = new Student("Hanh", 19, "Danang");
        // add students object to set
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student1);
        set.add(student5);
        // show set
        Iterator<Student> iterator = set.iterator();
        Student student;
        while (iterator.hasNext()) {
            student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
