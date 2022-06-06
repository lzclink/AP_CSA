import java.util.*;
public class MultipleGroups{
    private List<NumberGroup> groupList;
    public boolean contains(int num){
        for(NumberGroup i:groupList){
            if(i.contains(num)){
                return true;
            }
        }
        return false;
    }
}