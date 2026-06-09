// Program Purpose:
// This program checks whether a person is eligible to vote based on their age.

class VotingEligibility {

    // The main() method is the starting point of the program.
    public static void main(String[] args) {

        // Stores the person's age.
        int num1 = 25;

        // Checks if the age is greater than 18.
        // If the condition is true, the code inside this block executes.
        if (num1 >= 18) {

            // Displays that the person can vote.
            System.out.println("voteable");
        }
        else {

            // Executes when the condition is false.
            // Displays that the person cannot vote.
            System.out.println("not vote");
        }
    }
}