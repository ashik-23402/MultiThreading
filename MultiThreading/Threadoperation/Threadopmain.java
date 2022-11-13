package Threadoperation;

public class Threadopmain {
    public static void main(String[] args) {
        System.out.println("programm started .... ");

        int x = 5+5;

       Thread t =Thread.currentThread();//get object of current thread
        //String tname = t.getName();  get name = main

        t.setName("My main");

        System.out.println(t.getName());


        //for current thread sleep
        // try{Thread.sleep(5000);}
        // catch (Exception e){
        //     System.out.println("error");
        // }

        System.out.println(t.getId()); // print id

        //going to start userthread

        UserThread us = new UserThread();

        Thread td = new Thread(us);
        td.start();


       


        System.out.println("programm ended .... ");
    }
}


class UserThread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub

        System.out.println("This is userdefine thread");
        
    }
    
}
