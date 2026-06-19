package Collections;

import java.util.*;

class Student {

    int mark;

    Student(int mark) {
        this.mark = mark;
    }

    public String toString() {
        return mark + "";
    }
}

class MyComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.mark - s2.mark;
    }
}

public class Student2 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(80));
        list.add(new Student(60));
        list.add(new Student(90));

        Collections.sort(list, new MyComparator());

        System.out.println(list);
    }
}