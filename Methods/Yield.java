
class Yield extends Thread {

    public Yield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Yield t1 = new Yield("Thread-0");
        Yield t2 = new Yield("Thread-1");
        t1.start();
        t2.start();
    }
}
