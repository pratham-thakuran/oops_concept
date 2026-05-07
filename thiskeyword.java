import java.util.*;

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this.rno = 13;
        this.name = "Pratham";
        this.marks = 89.9f;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void greeting() {
        System.out.println("hello my name is " + this.name);
    }
}

public class thiskeyword {
    public static void main(String args[]) {
        Student Pratham = new Student();
        Student Kunal = new Student(14, "Kunal",48.5f);
        Pratham.greeting();
        Kunal.greeting();
    }
}