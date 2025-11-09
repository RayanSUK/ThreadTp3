// BAL.java
public class Bal {
    private String buffer;          // la "lettre"
    private boolean available=false;

    public synchronized void deposer(String lettre) throws InterruptedException {
        while (available) wait();   // attendre que la BAL soit vide
        buffer = lettre;
        available = true;
        notifyAll();
    }

    public synchronized String retirer() throws InterruptedException {
        while (!available) wait();  // attendre qu'il y ait une lettre
        String out = buffer;
        buffer = null;
        available = false;
        notifyAll();
        return out;
    }
}
