/**
 * leetcode 20
 * 解题思路：
 * 1、括号匹配，主要要考虑左括号和右括号匹配，对于匹配可以使用Map数据结构，键和值相匹配
 * 2、为了方便匹配我们主要使用栈来进行匹配
 * 3、根据括号匹配的特点可以判断传入的括号字符串是否为空，长度是否为偶数
 * 4、遍历字符串，匹配到左括号入栈，匹配到右括号，左括号出栈，判断是否匹配，匹配则继续
 * 5、如果最后栈中还有括号，则返回false，如果在匹配过程中，出现不匹配则返回false
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisMatching {
    
    public static boolean solution(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();

                if (top != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[](((){}({})))";
        System.out.println(solution(s));
    }
}