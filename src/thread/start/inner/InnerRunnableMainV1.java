package thread.start.inner;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

    // 특정 클래스에서만 사용 - 정적 중첩 클래스
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run()");
        }
    }

}
