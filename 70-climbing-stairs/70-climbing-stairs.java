class Solution {
    public int climbStairs(int n) {
        //0----=3dd el 7lol 0
        //1----=3dd el 7lol 1
        //2----=3dd el 7lol 2
        //3----=3dd el 7lol 3=2+1
        //4----=3dd el 7lol 5=3+2
        //5----=3dd el 7lol 8=5+3
        if (n==0) return 0;
        if (n==1) return 1;
        int mem[]=new int[n+1];
        mem[0]=0;
        mem[1]=1;
        mem[2]=2;
        for (int i = 3; i <= n ; i++) {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}