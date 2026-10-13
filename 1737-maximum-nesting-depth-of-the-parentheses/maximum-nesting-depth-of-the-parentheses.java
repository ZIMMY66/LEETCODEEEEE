class Solution {
    public int maxDepth(String s) {
        int count =0;
       int  maxlength=0;

       for (int i=0;i<s.length();i++){
       char ch =s.charAt(i);
       if (ch=='('){
        count ++;
        maxlength=Math.max(count,maxlength);

       }
       else if(ch==')')
       {
        count--;
       }
       }
return maxlength;
    }
}