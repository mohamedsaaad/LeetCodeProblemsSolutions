class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i <t.length() ; i++) {
            char cur=t.charAt(i);
            if(map.containsKey(cur) && map.get(cur)>0){
                map.put(cur,map.get(cur)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}