// Threads are unpredictable because the scheduler can switch between them at any time.
// If two threads update the same variable together, one update can be lost.
// Example: both threads may read count = 3, increment it, and write back 4.
// synchronized allows only one thread at a time to execute the method.

class counter{
    int count;
    public  synchronized void increment(){
        count++;
    }
}

public class threads_safe {
    public static void main(String[]args){

        counter c = new counter();


        Runnable obj7 = () -> {
            for(int i = 0 ; i< 1000; i++){
                // System.out.println("seventh");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }  
                c.increment();
            }
        };
        Thread t3 = new Thread(obj7);
        t3.start();
        Runnable obj8 = () -> {
            for(int i = 0 ; i< 1000; i++){
                // System.out.println("eight");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }  
                c.increment();
            }
        };
        Thread t4 = new Thread(obj8);
        t4.start();

        // join() makes the main thread wait until this thread finishes.
        
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.count);

    }
}
