package Arrays;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int t=n;
        while(n!=0){
            c++;
            n/=10;
        }
        int arr[]=new int[c];
        int x=0;
        while (t!=0){
            arr[x++]=t%10;
            t=t/10;
        }
        int i=0,j=arr.length-1;

       // System.out.println(arr.toString());
        int ans=0;
        for(int k=0;k<c;k++){
            ans=ans*10+arr[k];
        }
        System.out.println(ans);
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
