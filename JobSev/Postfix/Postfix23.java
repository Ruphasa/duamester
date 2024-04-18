package JobSev.Postfix;

public class Postfix23 {
    int n;
    int top;
    char[] stack;

    Postfix23(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c) {
        top++;
        stack[top] = c;
    }

    char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    boolean isOperand(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    boolean isOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    String konversi(String Q){
        String P = "";
        for (int i = 0; i < Q.length(); i++) {
            char c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            } if (c == '(') {
                push(c);
            } if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            } if (isOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
