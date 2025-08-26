
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            
            System.out
                    .println(Thread.currentThread().getName() + "- Priority: " + Thread.currentThread().getPriority()
                            + "- Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low");
        MyThread m = new MyThread("Med");
        MyThread h = new MyThread("Hi");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

        // t1.join();
    }
}
