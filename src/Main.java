import java.util.Stack;
public class Main {
    public static void main(String[] args){
        // Create an object of Stack class.
        Stack<String> animals = new Stack<>();
        // Push elements to top of the stack.
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: "+ animals);
        // Pop element from top of the stack
        animals.pop();
        System.out.println("Stack after popping: "+animals);
    }
}
