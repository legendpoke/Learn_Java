
// Grade system.

class StudentGrade{
    public int grades(int a){
        if (a >= 90){
            System.out.println("excellent");
        }
        else if( a >= 75 && a < 90){
            System.out.println("very good");
        }
        else if( a >= 60 && a < 75){
            System.out.println("good");
        }
        else if ( a >= 40 && a < 60){
            System.out.println("not bad try again");
        }
        else{
            System.out.println("fail ! now move on and do your best again learn from mistakes");
        }
        return a;
    }
}

public class GradeSystem {
    public static void main(String[]args){
        // Create a student grade helper and evaluate the score.
        StudentGrade score = new StudentGrade();
        int result = score.grades(78);
        System.out.println(result);
    }
}
