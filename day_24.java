import java.util.Stack;

public class day_24 {
    //678. Valid Parenthesis String
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open.push(i);
            } else if (ch == '*') {
                star.push(i);
            } else {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        //open bracket shld be before star
        while (!open.isEmpty() && !star.isEmpty()) {
            if (open.pop() > star.pop()) {
                return false;
            }
        }

        return open.isEmpty();
    }
}
