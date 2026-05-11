package abstracclass;

public abstract class parent {
    String name;
    int age;

    parent(int age){
        this.age = age;
    }
    
    abstract void career(String name);
    abstract void partner(String name, int age);
}
