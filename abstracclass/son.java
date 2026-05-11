package abstracclass;

public class son extends parent{
    String name;
    @Override
    void career(String name){
        this.name=name;
        System.out.println(name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("i love a girl.\n she is "+ age +"years old");
    }
}
