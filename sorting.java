import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Use Comparator when you want custom sorting logic.
// Comparator is a functional interface, so it can be implemented with a lambda.

class teacher{
    String name;
    int age;
    // toString() method.
    public String toString() {
        return "teacher [name=" + name + ", age=" + age + "]";
    }
    // Constructor.
    public teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class sorting {
    public static void main(String[]args){
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i % 10 > j %10){
                    return 1;// Swap order.
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(29);
        nums.add(95);
        nums.add(83);
        nums.add(72);
        nums.add(102);
        
        Collections.sort(nums, com);
        System.out.println(nums);

        List<teacher> teach = new ArrayList<teacher>();
        teach.add(new teacher("sudesh", 42));
        teach.add(new teacher("rakesh", 55));
        teach.add(new teacher("akshay", 30));
        teach.add(new teacher("dinesh", 35));
        teach.add(new teacher("hemraj", 24));

        Comparator<teacher> com1 = new Comparator<teacher>() {
            public int compare(teacher i,teacher j){
                if(i.age>j.age){
                    if(i.name.length()>j.name.length()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(teach,com1);
        System.out.println(teach);
    }
}
