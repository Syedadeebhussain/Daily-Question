// Last updated: 16/10/2025, 9:55:07 pm
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int [] arr=new int[A.length];
    for(int i=0;i<A.length;i++){
       arr[i]=find(A,B,i);
    }
    return arr;
    }
    public int find(int [] A,int [] B,int si){
        int [] freqA=new int [A.length+1];
         int [] freqB=new int [A.length+1];
        for(int i=0;i<=si;i++){
            freqA[A[i]]++;
            freqB[B[i]]++;
        }
        int c=0;
        for(int i=1;i<=A.length;i++){
            if(freqA[i]>0 && freqB[i]>0){
                c++;
            }
        }
        return c;
    }
}