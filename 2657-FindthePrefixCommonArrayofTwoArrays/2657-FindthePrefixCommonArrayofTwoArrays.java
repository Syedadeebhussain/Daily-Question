// Last updated: 21/5/2026, 1:00:44 am
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3    int [] arr=new int[A.length];
4    for(int i=0;i<A.length;i++){
5       arr[i]=find(A,B,i);
6    }
7    return arr;
8    }
9    public int find(int [] A,int [] B,int si){
10        int [] freqA=new int [A.length+1];
11         int [] freqB=new int [A.length+1];
12        for(int i=0;i<=si;i++){
13            freqA[A[i]]++;
14            freqB[B[i]]++;
15        }
16        int c=0;
17        for(int i=1;i<=A.length;i++){
18            if(freqA[i]>0 && freqB[i]>0){
19                c++;
20            }
21        }
22        return c;
23    }
24}