class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;
    public MyQueue() {
        temp = new Stack();
        stack = new Stack();
    }
    
    public void push(int x) {
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        stack.push(x);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }    }
    
    public int pop() {
        return (int)stack.pop();
    }
    
    public int peek() {
        return (int)stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
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
