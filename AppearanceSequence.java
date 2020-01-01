public class AppearanceSequence {
    
    public static String say (String str) {
        String string = "";
        int c1 = 0,c2 = 0,c3 = 0;
        if (str.length() == 1) {
            return "11";
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                c1++;
            }
            else if (str.charAt(i) == '2') {
                c2++;
            }
            else if (str.charAt(i) == '3') {
                c3++;
            }
            if(i + 1 == str.length() || i + 1 < str.length() && str.charAt(i+1) != str.charAt(i)) {
                if(c1 != 0) {
                    string = string + Integer.toString(c1) + Integer.toString(1);
                    c1 = 0;
                }
                else if(c2 != 0) {
                    string = string + Integer.toString(c2) + Integer.toString(2);
                    c2 = 0;
                }
                else if(c3 != 0) {
                    string = string + Integer.toString(c3) + Integer.toString(3);
                    c3 = 0;
                }
            }
        }
        return string;
    }
    public static String countAndSay(int n) {
        if(n == 0) {
            return null;
        }
        if(n == 1) {
            return "1";
        }
        String saystr = "1";
        for (int i = 1; i < n; i++) {
            saystr = say(saystr);
        }
        return saystr;
    }
    
    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }
}