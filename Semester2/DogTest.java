public class DogTest
{
    public static void main(String[] args)
    {
        Labrador lb1=new Labrador("Cookie","black");
        Yorkshire yk1=new Yorkshire("Yorky");
        System.out.println(lb1);
        System.out.println(yk1);
        System.out.println(lb1.avgBreedWeight());
        System.out.println(yk1.avgBreedWeight());
    }
}