// Last updated: 26/9/2025, 1:30:17 pm
class Solution {
    public int dayOfYear(String date) {
    int [] year={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String [] st=date.split("-");
    int y=Integer.parseInt(st[1]);
    int sum=0;
    int year1=Integer.parseInt(st[0]);
    if(isleap(year1)){
        year[2]=29;
    }
    for(int j=0;j<year.length;j++){

        if(j<y){
            sum+=year[j];
        }
    }
     int y2=Integer.parseInt(st[2]);
      sum+=y2;
      return sum;
    }
    public static boolean isleap(int year){
        if((year%4==0 && year%100!=0 ) || year%400==0){
            return true;
        }
        return false;
    }
}