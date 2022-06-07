class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int j=0;
        HashSet<Character>found=new HashSet<>();
        for(int i=0; i<s.length();i++) {
            if(!found.contains(s.charAt(i)) ){
                found.add(s.charAt(i));
                max=Math.max(max,found.size());
            }else{
                i--;
                found.remove(s.charAt(j++));
            }
        }
        return max;
    }
}