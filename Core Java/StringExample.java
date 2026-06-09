public class StringExample {
    public static void main(String[]args){
        // String is a class in Java.
        // Strings are immutable, so their original value does not change.
        String name = new String("Dhruv");
        System.out.println(name);
        System.out.println("hello " + name );// String concatenation.
        System.out.println(name.hashCode());// Hash code.
        System.out.println(name.charAt(1));// Character at the given index.
        System.out.println(name.concat("yadav"));// Concatenate two strings.
        System.out.println(name.length());// Length of the string.

        // This is the most common way to create a String.
        String fname = "dhruv";
        System.out.println(fname);



        // Use StringBuffer or StringBuilder when the value needs to change.
        // They are mutable.
        // Length and capacity are different.
        StringBuffer s1 = new StringBuffer("dhruv");
        System.out.println(s1);
        System.out.println(s1.capacity());
        s1.append("yadav");
        System.out.println(s1);
        // Delete and insert characters.
        s1.deleteCharAt(1);
        s1.insert(6, "java");

        // Set the string length.
        s1.setLength(30);
        System.out.println(s1);

    }
}
