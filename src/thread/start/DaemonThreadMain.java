package thread.start;

public class DaemonThreadMain {

    /**
     * 데몬 스레드 - 보조 스레드.
     */

    public static void main(String[] args) {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + " start ");

        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true); // 데몬 스레드 여부

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + " end ");
    }


    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + " run() ");

            try {
                Thread.sleep(10000); // 10초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + " run() end ");
        }
    }
}
