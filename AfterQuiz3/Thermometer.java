public class Thermometer{
    double temp;
    public Thermometer(){
        temp=37;
    }
    public void increase(){
        temp+=0.1;
    }
    public double getTemperature(){
        return temp;
    }
    public void reset(){
        temp=37;
    }
}