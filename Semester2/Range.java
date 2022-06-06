import java.util.*;
public class Range implements NumberGroup{
    private ArrayList<Integer> arr=new ArrayList<>();
    public Range(int a,int b){
        for(int i=a;i<=b;i++){
            arr.add(i);
        }
    }
    public boolean contains(int t){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==t){
                return true;
            }
        }
        return false;
    }
}