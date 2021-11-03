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
        return first.equalsIgnoreCase(o.getFirst())&&middle.equalsIgnoreCase(o.getMiddle())&&last.equalsIgnoreCase(o.getLast());
    }
    public String initials(){
        return first.substring(0,1).toUpperCase()+middle.substring(0,1).toUpperCase()+last.substring(0,1).toUpperCase();
    }
    public int length(){
        return first.length()+middle.length()+last.length();
    }
}