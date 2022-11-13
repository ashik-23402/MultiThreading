package ProblemSolve;

public class Consumer implements Runnable {

    Company c;

    Consumer(Company c){
        this.c = c;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<10;i++){
            try {
                this.c.ConsumeItem();
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
