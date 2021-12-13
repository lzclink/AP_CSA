import java.util.*;
public class Pitch{
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        int[][] pitchArray={
        {45,105,67},
        {81,100,93,25,128,88},
        {45,53},
        {79,107,53,79},
        {11,9,3,63,20,18,3}
        };
        // initialization "JUST IN CASE"
        int pitchBest[]=new int[pitchArray.length];
        for(int i=0;i<pitchBest.length;i++)
            pitchBest[i]=0;
        
        int pitchWorst[]=new int[pitchArray.length];
        for(int i=0;i<pitchWorst.length;i++)
            pitchWorst[i]=1000000;

        int pitchSum[]=new int[pitchArray.length];
        for(int i=0;i<pitchSum.length;i++)
            pitchSum[i]=0;
        
        int pitchAV[]=new int[pitchArray.length];
        for(int i=0;i<pitchAV.length;i++)
            pitchAV[i]=0;
        
        int count[]=new int[pitchArray.length];
        for(int i=0;i<pitchAV.length;i++)
            count[i]=0;
        
        int tt[]=new int[pitchArray.length];
        for(int i=0;i<tt.length;i++)
            tt[i]=0;
        
        for(int i=0;i<pitchArray.length;i++){
            for(int j=0;j<pitchArray[i].length;j++){
                if(pitchArray[i][j]>pitchBest[i]) 
                    pitchBest[i]=pitchArray[i][j];
                if(pitchArray[i][j]<pitchWorst[i]) 
                    pitchWorst[i]=pitchArray[i][j];
                pitchSum[i]+=pitchArray[i][j];
                count[i]++;
                tt[i]+=pitchArray[i][j];    
            }
            pitchAV[i]=pitchSum[i]/count[i];
        }
        
        for(int i=0;i<pitchArray.length;i++){
            System.out.println("Pitcher#"+(i+1)+" pitched "+count[i]+" games. Highest: "+pitchBest[i]+" Lowest: "+pitchWorst[i]+" total was: "+tt[i]+" average was: "+pitchAV[i]);
        }

        while(true){
            System.out.println("Which guy's stats do you want to see? If you want to quit enter\"0\".");
            while(true){
                int n;
                n=scan.nextInt();
                if(n==0){
                    System.exit(0);
                }
                if(n<0||n>pitchArray.length){
                    System.out.println("Invalid Input.");
                }
                else{
                    System.out.println("Pitcher#"+n+" pitched "+count[n-1]+" games. Highest: "+pitchBest[n-1]+" Lowest: "+pitchWorst[n-1]+" total was: "+tt[n-1]+" average was: "+pitchAV[n-1]);
                    break;
                }
            }
        }
    }
}