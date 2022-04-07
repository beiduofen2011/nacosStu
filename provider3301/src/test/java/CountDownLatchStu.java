import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchStu {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(()->{
            try {
                Thread.sleep(3000);
                System.out.println("------a------");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                Thread.sleep(4000);
                System.out.println("------b------");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        countDownLatch.await(5, TimeUnit.SECONDS);

        System.out.println("------main------");
    }
}
