package threadswala;

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("Running");
        try{
           Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
