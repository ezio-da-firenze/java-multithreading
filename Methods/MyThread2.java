
class MyThread2 extends Thread {

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread is starting....");
            Thread.sleep(2000);
            System.out.println("Thread is running....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted..." + e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2("Thread-psd");
        t1.start();
        t1.interrupt();
    }
}
