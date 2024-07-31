package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //  main start.
        HelloThread helloThread = new HelloThread();

        helloThread.run(); // main 스레드가 run() 메서드를 호출함.

        System.out.println(Thread.currentThread().getName());
    }
}
