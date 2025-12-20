// Last updated: 20/12/2025, 10:10:09 pm
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int c=0;
4    for(int i=0;i<strs[0].length();i++){
5        c+=find(strs,i);
6    } 
7    return c;
8    }
9    public int find(String[] strs,int i){
10        for(int c=0;c<strs.length-1;c++){
11            if(strs[c].charAt(i)>strs[c+1].charAt(i)){
12                return 1;
13            }
14        }
15        return 0;
16    }
17}