package ProblemSolve;

public class Main {
    
    public static void main(String[] args) {

        Company c = new Company();

        Producer p = new Producer(c);
        Consumer cc = new Consumer(c);

        Thread tr1 = new Thread(p);
        Thread tr2 = new Thread(cc);

        tr1.start();
        tr2.start();
    }
}
