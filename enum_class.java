enum laptop{
    macbook(2000),dell,asus(1500),thinkpad(1700);

    private int price;// Instance variable.

    private laptop(){// Constructor used when no price is passed.
        // It sets the default price for laptops without a given price.
        price = 2900;
    }

    private laptop(int price){// Constructor used when a price is passed.
        // It runs for enum constants that provide a price.
        this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }

}

public class enum_class {
    public static void main(String[]args){
        laptop lap = laptop.asus;
        System.out.println(lap + " : " + lap.getprice());

        laptop[] lap1 = laptop.values();
        for(int i = 0 ; i < lap1.length; i++){
            System.out.println(lap1[i] + " : " + lap1[i].getprice());
        }
    }
}
