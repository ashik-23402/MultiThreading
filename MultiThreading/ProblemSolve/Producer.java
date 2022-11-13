package ProblemSolve;

public class Producer implements Runnable {

    Company c;

    Producer(Company c){
        this.c = c;
    }

    @Override
    public void run() {
       for(int i=0;i<10;i++){
        try {
            this.c.ProduceItem(i);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("lol");
        }
       }
        
    }
    
    
}
