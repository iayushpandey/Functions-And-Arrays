import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n= scn.nextInt();
   int fibn= fibMemo(n, new int[n+1]);
   System.out.println(fibn);
   
 }
 
 public static int  fibMemo(int n, int[]qb){
     if(n==0||n==1){
         return n;
     }
     
     if(qb[n]!=0){
         return qb[n];
     }
     int fibm1= fibMemo(n-1,qb);
     int fibm2= fibMemo(n-2,qb);
     int fibT= fibm1+fibm2;
    qb[n]=fibT;
    return fibT;
 }

   }
