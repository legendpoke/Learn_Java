// Threads allow a program to handle multiple tasks at the same time.
// For example, in a game, the players, ball, crowd, and timer can all update together.
// To create a thread by extending Thread, put the task inside the run() method.
// When multiple threads share data, immutable data is safer because it cannot be changed.

// These two classes extend Thread, but show() runs like a normal method call.
class hi extends Thread{
    public void show(){
        // Prints "hi" more than once in a normal method.
        for(int i = 0 ; i <= 5; i++){
            System.out.println("hi");
            if(i == 1){
                break;
            }
        }
    }
}
class hello extends Thread{
    public void show(){
        // Prints "heloo" more than once in a normal method.
        for(int i = 0 ; i <= 5; i++){
            System.out.println("heloo");
            if(i == 1){
                break;
            }
        }
    }
}
// Thread.sleep() pauses a thread for a given number of milliseconds.
// Runnable is another way to define a task for a thread.

// These classes are real threads because their logic is inside run().
class yup extends Thread{
    public void run(){
        for(int i = 0 ; i<= 10; i++){
            System.out.println("yup");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// sleep() gives the scheduler a chance to switch between threads.
class not extends Thread{
    public void run(){
        for(int i = 0 ; i<= 10; i++){
            System.out.println("not");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


// These classes implement Runnable and provide their task in run().
// A Runnable object must be passed to a Thread before it can be started.
class first implements Runnable{
    public void run(){
        for(int i = 0 ; i<= 10; i++){
            System.out.println("first");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class second implements Runnable{
    public void run(){
        for(int i = 0 ; i<= 10; i++){
            System.out.println("second");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class threads {
    public static void main(String[]args){
        hi obj = new hi();
        obj.show();
        
        hello obj1 = new hello();
        obj1.show();
        // start() creates a new thread and then calls run() on that thread.
        yup obj3 = new yup();
        obj3.start();
        // The scheduler decides the exact order, so output may not alternate perfectly.
        not obj4 = new not();
        obj4.start();

        // Get the priority.
        //System.out.println(obj3.getPriority());// 5 is the default priority.
        // 10 is the maximum priority.
        // 1 is the minimum priority.

        // Set the priority.
        //obj4.setPriority(Thread.MAX_PRIORITY);

        // Create an object of the first Runnable class.
        Runnable obj5 = new first();
        // Wrap the Runnable in a Thread.
        Thread t1 = new Thread(obj5);
        // Start the thread.
        t1.start();

        // Create an object of the second Runnable class.
        Runnable obj6 = new second();
        // Wrap it in another Thread.
        Thread t2 = new Thread(obj6);
        // Start the second thread.
        t2.start();

        // Runnable is a functional interface, so a lambda expression can define run().
        Runnable obj7 = () -> {
            for(int i = 0 ; i<= 10; i++){
                System.out.println("seventh");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }  
            }
        };
        Thread t3 = new Thread(obj7);
        t3.start();
    }
}
