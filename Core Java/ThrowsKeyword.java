// Program Purpose:
// This program demonstrates:
// 1. Checked exceptions in Java
// 2. use of 'throws' keyword
// 3. Class loading using Class.forName()
// 4. Exception handling using try-catch

class ClassLoaderExample {

    // 'throws' declares that this method may throw a checked exception
    public void show() throws ClassNotFoundException {

        // Class.forName() tries to load a class dynamically at runtime
        // If the class is not found → ClassNotFoundException is thrown

        Class.forName("marvel");
    }
}

public class ThrowsKeyword {

    public static void main(String[] args) {

        ClassLoaderExample obj = new ClassLoaderExample();

        // Since show() declares 'throws', we must handle it here using try-catch
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            // Prints full stack trace of the exception
            e.printStackTrace();
        }
    }
}