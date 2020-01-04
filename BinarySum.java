public class BinarySum {
    public static String addBinary(String a, String b) {
        String str = "";
        String flag = "0";
        for (int i = a.length() - 1,j = b.length()-1 ; i >= 0 && j >= 0 ; i--,j--) {
            if(a.charAt(i) == b.charAt(j)) {
                str = flag + str;
                if(a.charAt(i) == '1') {
                    flag = "1";
                }
                
            }else {
                
            } 
        }

        return a;
    }
    
    
    public static void main(String[] args) {
        
    }
}