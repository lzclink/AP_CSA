import java.util.*;
public class Driven{
    public int[] slSort(int[] arr,boolean direc){
        //direc  true -> increasing     flase -> decreasing
        for(int i=0;i<arr.length;i++){
            int flag=i;
            for(int j=i+1;j<arr.length;j++){
                if(direc==true){
                    if(arr[j]<arr[flag]){
                        flag=j;
                    }
                }
                else{
                    if(arr[j]>arr[flag]){
                        flag=j;
                    } 
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[flag];
            arr[flag]=temp;
        }
        int[] r=arr;
        return r;
    }
    
    public int[] inSort(int[] arr,boolean direc){
        //direc  true -> increasing     flase -> decreasing
        for(int i=0;i<arr.length;i++){
            int std=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(direc==true){
                    if(arr[j]>std){
                        arr[j+1]=arr[j];
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(arr[j]<std){
                        arr[j+1]=arr[j];
                    }
                    else{
                        break;
                    } 
                }
            }
            arr[j+1]=std;
        }
        int[] ans=arr;
        return ans;
    }
    
    public int Linear(int[] arr, int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    // 0 1 2 3
    // 1 4 5 9
    public int Binary(int[] arr, int tar){
        int left=0,right=arr.length-1;
        while(left<=right){
            if(arr[(left+right)/2]==tar){
                return (left+right)/2;
            }
            else if(arr[(left+right)/2]<tar){
                left=(left+right)/2+1;
            }
            else{
                right=(left+right)/2-1;
            }
        }
        return -1;
    }
}