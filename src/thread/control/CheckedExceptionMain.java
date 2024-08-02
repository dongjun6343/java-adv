package thread.control;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    // 부모에 아무것도 정의가 안되어있어서 자식은 예외를 던질 수 없다.
    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /*throws Exception*/ { // 주석 풀면 예외 발생
            //throw new Exception(); // 주석 풀면 예외 발생

            sleep(1000); // 유틸리티 생성 후 처리
        }
    }
}
