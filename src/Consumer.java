// Consumer.java
public class Consumer implements Runnable {
    private final Bal bal;

    public Consumer(Bal bal) { this.bal = bal; }

    @Override public void run() {
        try {
            while (true) {
                String msg = bal.retirer();
                System.out.println(">>> [Consumer] retiré: " + msg);
                if ("Q".equals(msg)) break; // arrêt
                Thread.sleep(50);
            }
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
