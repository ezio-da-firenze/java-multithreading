class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING OUT");
        try {
            Thread.sleep(5000);
            System.out.println("RUNNING IN");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(4000);
        System.out.println(t1.getState()); // TIMED_WAITING

        t1.join();
        System.out.println(t1.getState()); // TERMINATED
    }

}