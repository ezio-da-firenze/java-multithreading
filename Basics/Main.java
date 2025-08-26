// public class Main {
//     public static void main(String[] args) {
//         World world = new World();
//         world.start();
//         for (;;) {
//             // System.out.println("Hello");
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }


public class Main {
    public static void main(String[] args) {
        World world = new World();
        Thread t0 = new Thread(world);
        t0.start();
        for (;;) {
            // System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
