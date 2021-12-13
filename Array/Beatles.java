import java.util.ArrayList;
public class Beatles {
    public static void main (String args[]){
        ArrayList<String> band = new ArrayList<String>(); // creating an array list
        band.add("Paul"); // add an element to the array list
        band.add("Pete");
        band.add("John");
        band.add("Goerge");
        System.out.println(band);
        int location = band.indexOf("Pete");
        band.remove(location);
        System.out.println(band);
        System.out.println("At index 1: "+ band.get(1)); 
        band.add(2, "Ringo");
        System.out.println("size of the band is " + band.size());
        int index = 0;
        while (index < band.size()){
            System.out.println(band.get(index));
            index++;
        }
    }
}