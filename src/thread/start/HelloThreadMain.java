package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //  main start.
        HelloThread helloThread = new HelloThread();
        helloThread.start(); // 스레드 시작 , main 스레드를 기다리지 않는다.
        System.out.println(Thread.currentThread().getName());
    }
}
