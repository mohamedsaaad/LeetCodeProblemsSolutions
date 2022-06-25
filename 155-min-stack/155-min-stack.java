class MinStack {
       int min;
    List<Integer> stack;
    public MinStack() {
        min=Integer.MAX_VALUE;
        stack=new ArrayList<>();
    }

    public void push(int val) {
        if(val <min)
            min=val;
        stack.add(val);
    }

    public void pop() {
        int target=stack.get(stack.size()-1);
        if(target == min){
            stack.remove(stack.size()-1);
            min=searchForSmallest(stack);
        }else{
            stack.remove(stack.size()-1);
        }

    }
    public int searchForSmallest(List<Integer> temp){
        int min=Integer.MAX_VALUE;
        for (int i: temp) {
            if(i<min)
                min=i;
        }
        return min;
    }
    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */