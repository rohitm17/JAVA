# PROBLEM : [ https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1# ]
# Solution :
             
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    // } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    if(n==0){
	        return 0;
	    }
	    
	    int t[][] = new int[n+1][sum+1];
	    
	    for(int i=0;i<sum+1;i++){
	        t[0][i] = 0;
	    }
	    for(int i=0;i<n+1;i++){
	        t[i][0] = 1;
	    }
	    
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<sum+1;j++){
	            if(arr[i-1]<=j){
	                t[i][j] = (t[i-1][j] + t[i-1][j-arr[i-1]])%1000000007;
	                
	            }else{
	                t[i][j] = t[i-1][j]%1000000007;
	            }
	        }
	    }
	    
	    return t[n][sum]%1000000007;
	} 
}
             
             
# Explaination : [ https://www.geeksforgeeks.org/count-of-subsets-with-sum-equal-to-x/ ]             
             
             
