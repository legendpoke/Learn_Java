class alien{
    private String planet = "earth 203";
    private int living_from = 11000;
    
    public String getplanet(){
        return planet;
    }

    public int getliving_from(){
        return living_from;
    }


    //private String planet;
    //private int living_from;
    // this represents the current object.
    // The current object is the object that is calling the method.
    public void setplanet(String planet){
        this.planet = planet;
    }

    public void setliving_from(int living_from){
        this.living_from = living_from;
    }

}


public class ThisKeyword {
    public static void main(String[] args){
        alien obj = new alien();
        obj.setliving_from(1000);
        obj.setplanet("earth 103");

        System.out.println(obj.getplanet() + " : " + obj.getliving_from());
    }
}
