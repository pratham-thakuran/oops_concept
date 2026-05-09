
// public class statickeyword {
//     public static void main(String[] args){
//         greeting();
//     }
//     void a(){
//         System.out.println(Hello);
//     }
//     static void greeting(){
//         System.out.println("hello world");
//     }
// }


public class statickeyword {
    public static void main(String[] args){ 
        a();
    }
    static void a(){
        System.out.println("Hello Pratham");
        statickeyword b = new statickeyword();
        b.greeting();
    }
    void greeting(){
        System.out.println("Have a good day");
    }
}

