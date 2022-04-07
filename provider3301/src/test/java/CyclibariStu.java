import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclibariStu {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        new Thread(()->{
            try {
                Thread.sleep(3000);
                System.out.println("------a------");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                Thread.sleep(4000);
                System.out.println("------b------");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        },"B").start();

        System.out.println("------main------");
    }
}
