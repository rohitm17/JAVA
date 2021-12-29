   /* 
   Problem Statement : https://leetcode.com/problems/first-unique-character-in-a-string/
   Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
   Data Structures used : HashMap(Properties : unique elements, unordered) , Array
   */

class Solution {
    public int firstUniqChar(String s) {
        
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int L=arr.length;
        for(int i=0;i<L;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);                         }
        for(int i=0;i<L;i++){
           if( map.get(arr[i])==1 ){               
               return i;              
           }
        }
        
        return -1;
        
    }
}

