public class testTT{
    public static void dosome(int[] s){
        for(int i=0;i<s.length;i++){
            s[i]++;
        }
        
    }
    public static void main(String[] args){
        int[] a=new int[10];
        dosome(a);
        String s="aaaa";
        System.out.println(s.get(0));
        
    }
}