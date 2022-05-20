class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common=strs[0];
        for (int i = 1; i < strs.length; i++) {
            String result="";
            int size=(common.length()< strs[i].length())?                                                    common.length():strs[i].length();
            for (int j = 0; j < size ; j++) {
                if (common.charAt(j)==strs[i].charAt(j))
                    result+=common.charAt(j);
                else
                    break;
            }
            common=result;
        }
        return common;
    }
}