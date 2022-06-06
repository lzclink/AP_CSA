public class HiddenWord{
    private String w;
    public HiddenWord(String word){
        w=word;
    }
    public String getHint(String in){
        String hint="";
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)==(w.charAt(i))){
                hint+=in.charAt(i);
            }
            else{
                if(w.indexOf(in.charAt(i))!=-1){
                    hint+="+";
                }
                else{
                    hint+="*";
                }
            }
        }
        return hint;
    }
}