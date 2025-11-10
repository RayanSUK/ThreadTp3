import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

// BAL.java
public class Bal {
    private BlockingQueue<String> queue =  new ArrayBlockingQueue<>(1) ;

    public boolean deposer(String lettre) throws InterruptedException {
        return queue.offer(lettre,200,TimeUnit.MILLISECONDS);
    }

    public String retirer() throws InterruptedException {
        return queue.poll(200,TimeUnit.MILLISECONDS);
    }
}
