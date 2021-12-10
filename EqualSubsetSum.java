#Problem Statement : https://leetcode.com/problems/partition-equal-subset-sum/
#Solution:

class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0,n=nums.length;
        for(int k=0;k<n;k++)
            sum += nums[k];
        if(sum%2!=0){
            return false;
        }
        
        return isSubsetSum(nums,sum/2,n);
    }
    public boolean isSubsetSum(int nums[],int sum,int n){
        boolean t[][] = new boolean[n+1][sum+1];
        for(int i=0;i<sum+1;i++){
            t[0][i]=false;
        }
        for(int i=0;i<n+1;i++){
            t[i][0]=true;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    t[i][j] = t[i-1][j] || t[i-1][j-nums[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}

#Same approach as of 0/1Knapsack and SubsetSum 
#Link to solution : https://leetcode.com/problems/partition-equal-subset-sum/discuss/1619718/Java-Solution-or-Partition-Equal-Sum-or-Using-Matrix-or-Top-Down-Approach
