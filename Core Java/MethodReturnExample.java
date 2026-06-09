// Program Purpose:
// This program demonstrates:
// 1. Method with void return type
// 2. Method with return value
// 3. Conditional return logic
// 4. Object method calling

// Class representing a simple music player system
class MusicPlayer {

    // void method: does not return any value
    public void playmusic() {
        System.out.println("playing music..");
    }

    // Method returns a String based on input condition
    public String getmepen(int cost) {

        // If cost is 10 or more, return "pen"
        if (cost >= 10) {
            return "pen";
        }

        // Otherwise return "nothing"
        return "nothing";
    }
}

public class MethodReturnExample {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating object of MusicPlayer class
        MusicPlayer obj = new MusicPlayer();

        // Calling void method (no return value)
        obj.playmusic();

        // Calling method that returns a String
        String str = obj.getmepen(100);

        // Printing returned value
        System.out.println(str);
    }
}