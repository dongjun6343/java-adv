package thread.start;

/**
 * 실무에서는 Runnable 인터페이스 구현해서 사용하는 것을 주로 쓴다.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : run() ");
    }
}
