// Producer.java
public class Producer implements Runnable {
    private final Bal bal;
    private final int count;

    public Producer(Bal bal, int count) { this.bal = bal; this.count = count; }

    @Override public void run() {
        try {
            for (int i=1;i<=count;i++) {
                String msg = "Lettre #" + i;
                bal.deposer(msg);
                System.out.println("[Producer] déposé: " + msg);
                Thread.sleep(80);
            }
            bal.deposer("Q"); // marqueur d'arrêt
        } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
