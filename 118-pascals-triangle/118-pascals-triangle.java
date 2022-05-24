class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if (numRows <= 0)
            return pascalTriangle;

        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        pascalTriangle.add(pre);

        for (int i = 2; i <= numRows ; i++) {
            ArrayList<Integer> cur = new ArrayList<>();
            cur.add(1); //add first element
            for (int j = 0; j < pre.size()-1  ; j++) {
                cur.add(pre.get(j)+pre.get(j+1));
            }
            cur.add(1); //add last element
            pascalTriangle.add(cur);
            pre=cur;
        }
        return pascalTriangle;
        
    }
}