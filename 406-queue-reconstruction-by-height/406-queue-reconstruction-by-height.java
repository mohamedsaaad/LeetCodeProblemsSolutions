class Solution {
    public int[][] reconstructQueue(int[][] people) {
         //sort by hight and rank
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        int [][] res=new int[people.length][];
        for (var person: people) {
            int count=person[1];
            int newPos=0;
            while (count > 0 || res[newPos]!=null){
                if(res[newPos]==null || person[0] <= res[newPos][0]){
                    count--;
                }
                newPos++;
            }
            res[newPos]=person;
        }

        return res; 
    }
}