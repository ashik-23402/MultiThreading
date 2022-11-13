package Thread;

public class CreatThread implements Runnable {

    public static void main(String[] args) {
        
        //thread obj

        CreatThread t1 = new CreatThread();
        AnotheThread t2 = new AnotheThread();

        Thread trd = new Thread(t1);
        Thread trd2 = new Thread(t2);

        trd.start();
        trd2.start();
    }

    @Override
    public void run() {
        //task
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    
    
}

class AnotheThread implements Runnable{

    @Override
    public void run() {
        
        for(int i=10;i>=0;i--)
            System.out.println("another :" + i);
        
    }

}
