package threadswala;

// public class thread1 extends Thread {
//     @Override
//     public void run(){
//         for(int i =1; i <=5;i++){
//             System.out.println("hello");
//         }
//     }
    
//     public static void main(String[] args){
//         thread1 a = new thread1();
//         a.start();

//         for(int i =1;i<=5;i++){
//             System.out.println("world");
//         }
//     }

// }


public class thread1 implements Runnable {
    @Override
    public void run(){
        for(int i =1; i <=5;i++){
            System.out.println("hello");
        }
    }
    
    public static void main(String[] args){
        thread1 a = new thread1();
        Thread t1 = new Thread(a);
        t1.start();
        
        for(int i =1;i<=5;i++){
            System.out.println("world");
        }
    }

}
