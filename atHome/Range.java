public class Range implements NumberGroup{
    private int low,high;
    public Range(int a, int b){
        low=a;
        high=b;
    }
    public boolean contains(int x){
        return (x>=low&&x<=high);
    }
}