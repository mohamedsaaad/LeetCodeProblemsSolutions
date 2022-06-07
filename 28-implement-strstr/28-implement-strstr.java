class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty() || needle.equals(haystack))
            return 0;
        int limit=haystack.length()- needle.length();
        int windo=needle.length();
        for (int i = 0; i <= limit ; i++) {
            String subString=haystack.substring(i,i+windo);
            if(needle.equals(subString))
                return i;
        }
        return -1;  
    }
}