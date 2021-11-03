public class BandBooster{
    String name;
    int boxesSold;
    public BandBooster(String n){
        name=n;
        boxesSold=0;
    }
    public String getName(){
        return name;
    }
    public void updateSales(int a){
        boxesSold+=a;
    }
    public String toString(){
        String r=name+":  "+boxesSold+" boxes";
        return r;
    }
}