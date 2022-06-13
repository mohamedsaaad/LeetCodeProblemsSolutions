class Solution {
      private int getArea(int y1,int y2,int x1,int x2){
          int y=Math.min(y1,y2);
        return y*(x1-x2);
    }
    public int maxArea(int[] height) {
        int area=0;
        int start=0;
        int end=height.length-1;
        while(start < end){
            area=Math.max(area,getArea(height[end],height[start],end,start));
            if(height[end]>height[start]) {
                start++;
            }else{
                end--;
            }
        }
        return area;
    }
}