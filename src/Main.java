// MainI1.java
public class Main {
    public static void main(String[] args) {
        Bal bal = new Bal();
        Thread p = new Thread(new Producer(bal, 10));
        Thread c = new Thread(new Consumer(bal));
        p.start();
        c.start();
    }
}
