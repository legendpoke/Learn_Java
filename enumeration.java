enum status{// Enum type.
    running, failed ,pending,success;// These are enum constants.
    // Enum constants are named fixed values.
    // An enum is a special class and cannot extend another class.
}


public class enumeration {
    public static void main(String[]args){
        status s = status.running;
        System.out.println(s);
        status s1 = status.failed;
        System.out.println(s1.ordinal());
        status[] s3 = status.values();
        
        for( int i = 0; i < s3.length; i ++){
            System.out.println(s3[i]);// Print all statuses.
        }


        // Conditional statements and switch cases.
        status s4 = status.success;

        if(s4 == status.running){
            System.out.println("all good");
        }
        else if( s4 == status.pending){
            System.out.println("wait few minutes");
        }
        else if( s4 == status.failed){
            System.out.println("try again");
        }
        else{
            System.out.println("all done");
        }

        // Switch case.
        status s5 = status.pending;
        switch(s5){
            case running:
                System.out.println("all good");
                break;

            case failed:
                System.out.println("try again");
                break;

            case pending:
                System.out.println("waiting...");
                break;

            case success:
                System.out.println("done");
                break;
        }

        System.out.println(s.getClass().getSuperclass());
    }
    
}

