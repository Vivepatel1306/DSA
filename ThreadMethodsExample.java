// import java.lang.Thread;

// class Counter {
//     private int count = 0;

//     public   void increment() {
//         count++;
//     }

//     public  int getCount() {
//         return count;
//     }
// }

// public class SyncExample {
//     public static void main(String[] args) throws InterruptedException {
//         Counter counter = new Counter();

//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 1000; i++) {
//                 counter.increment();
//             }
//         });

//         t1.start();
//         t2.start();

//         t1.join(); // Main thread waits for t1
//         t2.join(); // Main thread waits for t2

//         System.out.println("Final count: " + counter.getCount());
//     }
// }


// class MyThread extends Thread {
//     public void run() {
//         System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
//     }
// }

// public class PriorityExample {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();
//         MyThread t3 = new MyThread();

//         t1.setPriority(Thread.MIN_PRIORITY);  // 1
//         t2.setPriority(Thread.NORM_PRIORITY); // 5
//         t3.setPriority(Thread.MAX_PRIORITY);  // 10

//         t1.setName("Low Priority Thread");
//         t2.setName("Normal Priority Thread");
//         t3.setName("High Priority Thread");

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }


class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Step " + i);
            try {
                Thread.sleep(5000); // Sleep for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            if (i == 2 && Thread.currentThread().getName().equals("Thread-1")) {
                Thread.yield(); // Voluntarily give up CPU
            }
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try {
            t1.join(); // Main waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread ends after t1 completes.");
    }
}
