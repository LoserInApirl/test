package demo3多线程;

public class Test {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Thread2");
        r2.start();

        System.out.println("============================================================");
        ThreadDemo t1 = new ThreadDemo("Thread3");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread4");
        t2.start();
    }
}

