// Last updated: 31/7/2025, 2:25:57 pm
class Solution {
    public void reverseString(char[] s) {
      reverse(s);
    }
  public static void reverse(char[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }

    }

   }
