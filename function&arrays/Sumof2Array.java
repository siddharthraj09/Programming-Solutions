import java.util.Scanner;

public class Sumof2Array {

    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            arr[i]=scn.nextInt();
        }

    }


    
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }   


    public static void arrayADD(int [] arr1,int [] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int size =(n1>n2)?n1:n2;
        int carry=0;
        int i=n1-1,j=n2-1;

        int [] arr3=new int[size];
        int k=arr3.length-1;

        while(k>=0){
            int sum=0;
            sum=carry;
            if(i>=0){

            sum=sum+arr1[i];
            }

            if(j>=0){

                sum=sum+arr2[j];
                }
            int val=sum%10;
            carry=sum/10;

            arr3[k]=val;
                k--;
                j--;
                i--;
                
            }
            System.out.println();
            if(carry!=0){
                System.out.print(carry);
            }
            for (int ele : arr3) {
                System.out.print(ele);
                
            }



    }


    public static void main(String[] args) {
        
        int n1=scn.nextInt(),n2=scn.nextInt();

        int [] arr1=new int[n1];
        int [] arr2 =new int[n2];
        takeInput(arr1);
        takeInput(arr2);
        arrayADD(arr1, arr2);
        scn.close();

    }
    
}
