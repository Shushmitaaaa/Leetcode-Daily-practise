class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0;
        return check(s,i);
        
        
    }
    private static boolean check(String s,int i){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return check(s,i+1);
    }
}
