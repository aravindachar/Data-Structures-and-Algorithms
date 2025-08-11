package StachAndQueues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomeStack stack = new DynamicStack(23);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.peek();
    }
}
