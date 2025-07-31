// Last updated: 31/7/2025, 2:26:23 pm
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>(); 
    print(ll,ans,n,1,k)  ;
      return ans;
    }
    // public static void print(int n, List<List<Integer>> ans, List<Integer> ll,int idx,int k)
    // {
    //     if(k==0)
    //     {
    //          ans.add(new ArrayList<>(ll));
    //         return ;
    //     }
    // for(int i=idx;i<=n;i++)
    // {
    // ll.add(i);
    // print(n,ans,ll,i+1,k-1);
    // ll.remove(ll.size()-1);
    // }
    // }

// }
 public static void print(List<Integer> ll,List<List<Integer>> ans,int amount,int idx,int k)
    {
        if(amount==0 && k==0)
        {
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=idx;i<=9;i++){
           if(amount>=i )
            {
            ll.add(i);
            print(ll,ans,amount-i,i+1,k-1);
            ll.remove(ll.size()-1);
            }
            
            
        }
    }
    }
