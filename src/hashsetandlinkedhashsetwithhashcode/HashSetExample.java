package hashsetandlinkedhashsetwithhashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        // khoi tao hashSet
        HashSet<Student> hashSet = new HashSet<Student>();
        // Tao cac doi tuong Student
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");
        Student student5 = new Student("Hanh", 19, "Danang");
        // them cac doi tuong Student vao hashSet
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student1);
        hashSet.add(student5);
        // Hien thi hashSet
        System.out.println("hashSet: ");
        for (Student student : hashSet) {
            System.out.println(student.toString());
        }
        System.out.println("___________________________________________");
        System.out.println("hashSet1: ");
        HashSet<Student> hashSet1 = new HashSet<Student>();
        hashSet1.addAll(hashSet);
        hashSet1.remove(student1);
        System.out.println("hashSet = hashSet1 ? " + hashSet1.equals(hashSet));
        System.out.println("hashSet1's size " + hashSet1.size());

        //convert hashset to list
        System.out.println("___________________________________________");
        System.out.println("List Student: ");
        List<Student> convertToList = new ArrayList<>();
        convertToList.addAll(hashSet);
        convertToList.add(student3); //one more duplicate : student3
        Iterator<Student> itr = convertToList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() );
        }

        System.out.println("___________________________________________");
        System.out.println("hashSet2: ");

        HashSet<Student> hashSet2 = new HashSet<>(convertToList);
        for (Student student : hashSet2) {
            System.out.println(student.toString());
        }

        System.out.println();
        //convert hashset to Array
        System.out.println("___________________________________________");
        System.out.println("array containing students: ");
        //cách 1
        Object[] arrStudent = hashSet.toArray();
        for (Object s: arrStudent
             ) {
            System.out.println(s);
        }
        //cách 2
//        Student[] arrStudent1 = new Student[hashSet.size()];
//        hashSet.toArray(arrStudent1);
//        for (Student s : arrStudent1) {
//            System.out.println(s);
//        }

    }
}
//    HashSet chỉ chứa các phần tử duy nhất.
//        HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).

