// Last updated: 31/7/2025, 2:26:09 pm
class Solution {
    public int addDigits(int num) {
    while(count(num)>=2)
    {
     num =find(num);  
    }
    return num;
    }
    
    public static int find(int num)
    {
    int sum=0;
    while(num!=0)
    {
        int r=num%10;
        sum+=r;
        num=num/10;
    } 
    return sum;
    }
    public static int count(int n)
    {
          int c=0;
    while(n!=0)
    {
        int r=n%10;
        c++;
        n=n/10;
    }
    return c;
    }
}