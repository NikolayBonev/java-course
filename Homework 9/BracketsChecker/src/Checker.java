import java.util.Stack;

public class Checker {
	public static boolean Balanced(String input)
    {
        Stack<Character> stack = new Stack<Character>();

        for(char ch : input.toCharArray())
        {
            switch(ch) {
                case '(':{
                    stack.push(ch);
                    break;
                }

                case ')':{
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                }

            }
        }
        return stack.isEmpty();
    }
    
}
