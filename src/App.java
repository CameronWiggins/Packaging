import mypkg.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(5);
        System.out.println(s1.pop());
    }
}
