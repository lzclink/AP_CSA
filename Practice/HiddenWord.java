public class HiddenWord{
    String word;
    public HiddenWord(String w){
        word=w;
    }
    public String getHint(String str){
        String r="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==word.charAt(i)){
               r=r+str.charAt(i);
            }
            else{
                boolean flag=false;
                for(int j=0;j<str.length();j++){
                    if(i==j){
                        continue;
                    }
                    if(str.charAt(i)==word.charAt(j)){
                        flag=true;
                        break;
                    }
                }
                r+=flag?"+":"*";
            }
        }
        return r;
    }
}