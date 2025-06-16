package Arrays;

import java.util.Scanner;

public class Marks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[][]=new int[3][2];
        for(int i=0;i<3;i++){
            mark[i][1]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=mark[i][1];
        }
        int perc=sum/300*sum;
        if(perc>80){
            System.out.println("Leve-4, Above agency normalized Standards");
        }
        if(perc<80 && perc>=70){
            System.out.println("Level-3,At agency normalized Standards");
        }
        if(perc<70 && perc>=60){
            System.out.println("Level-2,Below agency normalized Standards");
        }
        if(perc<60 && perc>=50){
            System.out.println("Level-1,Well Below agency normalized Standards");
        }
        if(perc<50 && perc>=40){
            System.out.println("Level-0,Too Below agency normalized Standards");
        }
        else {
            System.out.println("Remedial Student");
        }
    }
}
