// Last updated: 31/7/2025, 2:25:49 pm
class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> ll=new ArrayList<>();
     
        for(int r=1;r<=n;r++)
        {

        if(r%3==0 && r%5==0)
        {
            ll.add("FizzBuzz");
        }
        else if(r%3==0 )
        {
            ll.add("Fizz");
        }
        else if(r%5==0)
        {
            ll.add("Buzz");
        }
        else
        {
            String r1=Integer.toString(r);
            ll.add(r1);
        }

    }
return ll;
    }
}