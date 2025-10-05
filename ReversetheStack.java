import java.util.Stack;

public class ReversetheStack {
    static void insertAtBottom(Stack<Integer> stack , int x){
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, x);
        stack.push(top);
    }
    static void reverse(Stack <Integer> stack ){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        for(int i=1; i<5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        reverse(stack);;
        System.out.println(stack);
    }
}
