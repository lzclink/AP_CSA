import java.util.*;
public class Name{
    private String first,middle,last;
    public Name(String f, String m, String l){
        first=f;
        middle=m;
        last=l;
    }
    public String getFirst(){
        return first;
    }
    public int random100(){
        Random rand=new Random();
        return rand.nextInt(100)+1;
    }
    public String getMiddle(){
        return middle;
    }
    public String getLast(){
        return last;
    }
    public String firstMiddleLast(){
        return first+" "+middle+" "+last;
    }
    public String lastFirstMiddle(){
        return last+", "+first+" "+middle;
    }

    public boolean equals(Name o){
        return this.firstMiddleLast().equalsIgnoreCase(o.firstMiddleLast());
    }
    
    public static boolean eq(Name a, Name b){
        return a.firstMiddleLast()==b.firstMiddleLast();
    }
    public String initials(){
        return first.substring(0,1).toUpperCase()+middle.substring(0,1).toUpperCase()+last.substring(0,1).toUpperCase();
    }
    public int length(){
        return first.length()+middle.length()+last.length();
    }
}