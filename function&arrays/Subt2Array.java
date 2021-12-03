
import java.util.*;

public class Subt2Array {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            arr[i]=scn.nextInt();
        }

    }

    public static int [] arraySUB(int [] arr1,int [] arr2){
        int borrow = 0;
        int [] arr3 = new int[arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr3.length-1;
        
        while(j>=0){
            int digit = 0;
            digit = arr2[j] + borrow;
            if(i >= 0){
                digit -= arr1[i];
            }
            
            if(digit < 0){
                digit += 10;
                borrow = -1;
            }
            else{
                borrow = 0;
            }
            
            int val = digit % 10;
            
            arr3[k] = val;
            i--;
            j--;
            k--;
            
        }
        return (arr3);
        
        

    }



    public static void main(String[] args) {
        
        int n2=scn.nextInt(),n1=scn.nextInt();

        int [] arr2=new int[n2];
        int [] arr1 =new int[n1];
        takeInput(arr2);
        takeInput(arr1);
        int [] ans=arraySUB(arr1, arr2);
        scn.close();


        
    // 1. first non zero index -- fnzi
    int fnzi = -1;
    for(int i = 0; i<ans.length; i++){
        if(ans[i] != 0){
            fnzi = i;
            break;
        }
    }
    //546-546 = 000
    if(fnzi == -1){
        System.out.println("0");
        return;
    }
    
    for(int i = fnzi; i<ans.length; i++){
        System.out.print(ans[i]);
    }
    

    }
    
}
