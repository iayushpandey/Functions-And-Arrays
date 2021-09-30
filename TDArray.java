import java.util.Scanner;

public class TDArray{

public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    System.out.println("Enter the number of Rows\r");
    int n =scn.nextInt();
    System.out.println("Enter the number of Columns\r");
    int m=scn.nextInt();
    int[] [] arr= new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    System.out.println("2D matrix entered is : ");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

  
}