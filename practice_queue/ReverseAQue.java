import java.util.*;

public class ReverseAQue {

    static void reverseUsingStack(Queue<Integer> mainQue) {
        Stack<Integer> auxStack = new Stack<Integer>();
        while (!mainQue.isEmpty()) {
            auxStack.push(mainQue.remove());
        }
        while (!auxStack.isEmpty())
            mainQue.add(auxStack.pop());

    }

//    static void reverseUsingRecursion(Queue<Integer> mainQue) {
//         if (!mainQue.isEmpty())
//             return;
//         int x = mainQue.remove();

//         reverseUsingRecursion(mainQue);

//         mainQue.add(x);
//         display(mainQue);

//     }

    static void display(Queue<Integer> mainQue) {
        for (Integer item : mainQue)
            System.out.println(item);
    }

    public static void main(String[] args) {
        Queue<Integer> mainQue = new LinkedList<Integer>();

        mainQue.add(10);
        mainQue.add(20);
        mainQue.add(30);
        reverseUsingStack(mainQue);
        // reverseUsingRecursion(mainQue);
        // display(mainQue);
    }

}
