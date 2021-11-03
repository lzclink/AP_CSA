// in this class we are going to learn about different methods of the String class
public class StringManipulation {
    public static void main (String args[]){
        String strOriginal = "Computer Science is fun";
        int len = strOriginal.length(); // gives the total number of characters in the string
        System.out.println(len); // 23, always include the <spaces>
        String str1 = strOriginal.substring(0, 8);
        System.out.println(str1); // computer. starts from 0th to one less than 8 (7th)
        String str2 = strOriginal.concat(str1); // adds the two string together
        System.out.println(str2); // Computer Science is funComputer
        char ch = strOriginal.charAt(7);
        System.out.println(ch); // r
        String str3 = strOriginal.replace(' ', '$');
        System.out.println(str3); // Computer$Science$is$fun
        String str4 = strOriginal.toUpperCase();
        String str5 = strOriginal.toLowerCase();
        System.out.println(str4 + " " + str5);
    }
}