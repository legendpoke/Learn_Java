class students{
    int roll_no;
    String name;
    int marks;
}


public class array_obj {
    public static void main (String[]args){
        students s1 = new students();
        s1.name = "dhruv";
        s1.marks = 99;
        s1.roll_no = 1;


        students s2 = new students();
        s2.name = "liladhar";
        s2.marks = 100;
        s2.roll_no = 2;


        students s3 = new students();
        s3.name = "abhinav";
        s3.marks = 100;
        s3.roll_no = 3;

        students s[] = new students[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for ( int i = 0 ; i < 3 ; i ++){
            System.out.println(s[i].name + " : " + s[i].marks);
        }
    }
}
