package abstracclass;

public class son extends parent{
    
    public son (String name, int age){
        super(age);
        this.name = name;
   
    }
    
    
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
