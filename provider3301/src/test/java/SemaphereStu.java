import java.util.concurrent.Semaphore;

public class SemaphereStu {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);

        for(int i=0 ;i <10 ;i++){
            int finalI = i;
            new Thread(()->{
                try {
                    semaphore.acquire();
                    Thread.sleep(2000);
                    System.out.println("-----------------"+ finalI);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
