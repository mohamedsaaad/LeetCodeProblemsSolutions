class Solution {
    public boolean isPalindrome(String s) {
                if(s.isEmpty()) return true;
        int head=0;
        int tail=s.length()-1;
        while(head <= tail){
            char charHead=s.charAt(head);
            char charTail=s.charAt(tail);
            if(!Character.isLetterOrDigit(charHead)){
                head++;
            }
            else if(!Character.isLetterOrDigit(charTail)){
                tail--;
            }else {
                if (Character.toLowerCase(charHead) != 
                    Character.toLowerCase(charTail))                 {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}