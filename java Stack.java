import java.util.*;
class Solution{
	
	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
    }
    
    public static boolean isBalanced(String s) {
        Map<Character, Character> braketsMap = new HashMap<>();
        braketsMap.put('{', '}');
        braketsMap.put('(', ')');
        braketsMap.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (braketsMap.containsKey(ch)) {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (ch != braketsMap.get(last)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
