class house{
    public int house_number(int n1){
        return n1;
    }
}

class village extends house{// Method overriding executes the child class method.
    public int house_number(int n1){
        return n1+3;
    }
    // house_number() overrides the method from house.
}

public class MethodOverriding {
    public static void main(String[]args){
        village obj = new village();
        int r1 = obj.house_number(123);
        System.out.println(r1);
    }
}
