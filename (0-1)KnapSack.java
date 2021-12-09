#Problem : https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1#
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends



class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int t[][] = new int[n+1][W+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<W+1;j++){
                 if(i==0||j==0){
                     t[i][j]=0;
                 }
             }
         }
         
         for(int i=1;i<n+1;i++){
             for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                  t[i][j] = max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
             }
         }
        
         
         return t[n][W];
    } 
    static int max(int v1,int v2){
        if(v1>=v2){
            return v1;
        }
        return v2;
    }
}

#Using top- down approach
# Solution video : [link](https://www.youtube.com/watch?v=ntCGbPMeqgg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=5)
