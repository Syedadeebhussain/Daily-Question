// Last updated: 31/7/2025, 2:24:14 pm
class Solution {
    public String interpret(String command) {
        String s="";
      for(int i=0;i<command.length();i++){
        if(command.charAt(i)=='G'){
            s+="G";
        }
        if(command.charAt(i)=='('){
            if(command.charAt(i+1)==')'){
              s+="o";
              i++;
            }
            else
            {
              s+="al";
              i+=3;  
            }
        }
      }  
      return s;
    }
}