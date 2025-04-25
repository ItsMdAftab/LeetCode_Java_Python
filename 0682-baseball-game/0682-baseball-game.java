import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "+":
                    int top1 = stack.pop();
                    int top2 = stack.pop();
                    int newTop = top1 + top2;
                    stack.push(top2); // Restore second popped value
                    stack.push(top1); // Restore first popped value
                    stack.push(newTop); // Add the sum
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }

        int result = 0;
        for (int score : stack) {
            result += score;
        }
        return result;
    }
}
