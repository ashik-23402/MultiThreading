package ProblemSolve;

public class Company {

    int n;
    boolean f = false;
    
    synchronized public void ProduceItem(int n) throws Exception {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("produce : " + this.n );
        f = true;
        notify();
    }

    synchronized public int ConsumeItem() throws Exception {
        if(!f){
            wait();
        }
        System.out.println("consume : "+ this.n);
        f = false;
        return this.n;
    }
}
