public class PlusOne {
    
    public static int[] plusOne(int[] digits) {
        int flag = 0;
        if(digits[digits.length - 1] + 1  == 10) {
            flag = 1;
            digits[digits.length - 1] = 0;
        } else {
            digits[digits.length - 1] += 1;
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            if(digits[i] + flag == 10) {
                flag = 1;
                digits[i] = 0;
            }else {
                digits[i] = digits[i] + flag;
                flag = 0;
            }
        }
        if(digits[0] == 0) {
            int[] digits1 = new int[digits.length+1];
            digits1[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                digits1[i+1] = digits[i];
            }
            return digits1;
        }

        return digits;
        
    }
    
    public static void main(String[] args) {
        int[] plusOne = {8,9,9,9};
        plusOne(plusOne);
    }
}