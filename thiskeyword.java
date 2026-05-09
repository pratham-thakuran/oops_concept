// package a;
class Student {
    int rno;
    String name;
    float marks;
    static long population;

    Student() {
        this(13,"null",100.0f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        Student.population+=1;
    }

    void greeting() {
        System.out.println("hello my name is " + this.name);
    }

    Student(Student other){
        this.name=other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}

public class thiskeyword {
    public static void main(String args[]) {
        Student Pratham = new Student(18,"Pratham", 78.9f);
        Student Kunal = new Student(14, "Kunal",48.5f);
        Student random = new Student(Pratham);
        Student random2 = new Student();
        Student Ansh = new Student();
        Student Raju = Ansh;
        random2.greeting();
        random.greeting();
        Pratham.greeting();
        Kunal.greeting();
        System.out.println(Pratham.rno);
        System.out.println(Ansh.rno);
        System.out.println(Ansh.rno);
        System.out.println(Raju.name);
        System.out.println(Raju.marks);
        System.out.println(Student.population);

    }
}