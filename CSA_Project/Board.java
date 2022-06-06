public class Board
{
    private boolean win;
    private char[][] mp;
    private boolean[][] record;
    private int row, col;
    public Board(int rows, int cols, String line){
        row=rows;
        col=cols;
        mp=new char[row][col];
        int ct=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mp[i][j]=line.charAt(ct);
                ct++;
            }
        }
        record=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                record[i][j]=true;
            }
        }
    }	
    //getStart returns a String storing the r and c of S in form "r c"
    public String getStart(){
        String ans=new String("");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mp[i][j]=='S'){
                    ans=ans+i+" "+j;
                    return ans;
                }
            }
        }
        return null;
    }
    //getEnd returns a String storing the r and c of E in form "r c"
    public String getEnd(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mp[i][j]=='E'){
                    return i+" "+j;
                }
            }
        } 
        return null;
    }
    
    private boolean check(int r, int c ){
        if(0<=r&&r<row&&0<=c&&c<col&&record[r][c]==true&&mp[r][c]!='W'){
            if(mp[r][c]=='E'){
                win=true;
                return win;
            }
            else{
                record[r][c]=false;
                this.check(r+1,c);
                this.check(r-1,c);
                this.check(r,c+1);
                this.check(r,c-1);
            }
        }
        return win;
    }
    public boolean win(){
        int initR,initC;
        String temp=this.getStart();
        initR=temp.charAt(0)-'0';
        initC=temp.charAt(2)-'0';
        //System.out.println(getStart());
        //System.out.println(initR+" "+initC);
        
        return check(initR,initC);
    }	           
}
