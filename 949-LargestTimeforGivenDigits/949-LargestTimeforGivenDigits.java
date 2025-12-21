// Last updated: 21/12/2025, 12:01:24 pm
1class Solution {
2    public String largestTimeFromDigits(int[] arr) {
3        String result="";
4           for(int i=0;i<=3;i++){
5            for(int j=0;j<=3;j++){
6                for(int k=0;k<=3;k++){
7                  if(i==j || j==k ||k==i) continue;
8                  String hr=arr[i]+""+arr[j];
9                  String mm=arr[k]+""+arr[6-i-j-k];
10                  String time=hr+":"+mm;
11                  if(hr.compareTo("24")<0 && mm.compareTo("60")<0 && result.compareTo(time)<0){
12                    result=time;
13                  }
14                }
15            }
16         }
17           return result;
18    }
19}