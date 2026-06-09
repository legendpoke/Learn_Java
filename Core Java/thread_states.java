// Program Purpose:
// This program is a placeholder for explaining Thread States in Java.
// It does not execute any threading logic, only contains conceptual notes.

public class thread_states {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // =====================================================
        // THREAD STATES IN JAVA (Conceptual Overview)
        // =====================================================

        // 1. NEW
        // Thread is created but not started yet.
        // Example: Thread t = new Thread();

        // 2. RUNNABLE
        // Thread is ready to run or running on CPU.
        // After calling: t.start()

        // 3. RUNNING
        // Thread is actively executing its task.
        // JVM scheduler selects thread for execution.

        // 4. BLOCKED
        // Thread is waiting to acquire a lock.
        // Happens in synchronized blocks.

        // 5. WAITING
        // Thread waits indefinitely for another thread.
        // Example: obj.wait();

        // 6. TIMED_WAITING
        // Thread waits for a fixed time.
        // Example: Thread.sleep(1000);

        // 7. TERMINATED
        // Thread execution is completed.

        // =====================================================
        // NOTE:
        // Thread state transitions depend on JVM scheduler,
        // locks, and thread methods like start(), sleep(), wait().
        // =====================================================
    }
}