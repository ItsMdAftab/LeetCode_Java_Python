class Solution {
    public int evalRPN(String[] tokens) {
        // Stack to store operands
        Stack<Integer> stack = new Stack<>(); 
        
        for (String k : tokens) {
            // Check if the current token is an operator
            if (isOperator(k)) {
                // Pop two operands from the stack
                int n1 = stack.pop();
                int n2 = stack.pop();
                int n3 = 0;

                // Perform operation based on the operator
                switch (k) {
                    case "+":
                        n3 = n2 + n1; // Addition
                        break;
                    case "-":
                        n3 = n2 - n1; // Subtraction
                        break;
                    case "*":
                        n3 = n2 * n1; // Multiplication
                        break;
                    case "/":
                        n3 = n2 / n1; // Division
                        break;
                }
                // Push the result back to the stack
                stack.push(n3);
            } else {
                // If not an operator, parse it as an integer and push to the stack
                stack.push(Integer.parseInt(k));
            }
        }
        // Return the final result in the stack
        return stack.pop(); 
    }

    // Helper method to check if a token is an operator
    public boolean isOperator(String k) {
        return "+-*/".contains(k);
    }
}
