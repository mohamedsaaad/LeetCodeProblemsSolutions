class MyQueue {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> reversedStack=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
         while (!reversedStack.isEmpty()) {
            stack.push(reversedStack.pop());
        }
        stack.push(x);

        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
    }
    
    public int pop() {
        return reversedStack.pop();
    }
    
    public int peek() {
        return reversedStack.peek();
    }
    
    public boolean empty() {
         return (reversedStack.isEmpty())?true:false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */