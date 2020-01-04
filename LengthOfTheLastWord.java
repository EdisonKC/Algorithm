public class LengthOfTheLastWord {
    
    public static int lengthOfLastWord(String s) {
        if(s == null || s == " ") {
            return 0;
        }
        int length = 0;
        for(int j = s.length()-1; j >= 0; j--) {
            if(s.charAt(j) != ' ') {
                length++;
            }
            if(s.charAt(j) == ' ' && length > 0) {
                break;
            }
        }
        return length;
    }
    
    
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world   "));
        System.out.println(lengthOfLastWord("a"));
    }
}