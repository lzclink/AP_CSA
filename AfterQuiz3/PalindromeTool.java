public class PalindromeTool{
    public PalindromeTool(String s){ str=s; }
    private String str;
    public boolean isP(){
        str=str.toLowerCase();
        if(str.length()==0) return true;
        for(int i=0;i<=str.length()/2-1;i++) if(str.charAt(str.length()-i-1)!=str.charAt(i)) return false;
        return true;
    }
}