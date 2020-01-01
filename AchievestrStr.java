public class AchievestrStr {
    
    public static int strStr(String haystack, String needle) {
        // 如果源字符串为空，则返回-1
        if (haystack.length() == 0) {
            return -1;
        }
        // 如果查找目标字符串为空，则返回0
        if (needle.length() == 0) {
            return 0;
        }
        // 取查找目标字符串的首个字符
        char first = needle.charAt(0);
        // 最大的查找次数为源字符串和目标字符串的长度之差
        int max = haystack.length() - needle.length();
        // 最大步数内查找匹配的字符串
        for (int i = 0; i <= max; i++) {
            // 匹配到第一个相同字符
            if (haystack.charAt(i) != first) {
                while (++i <= max && haystack.charAt(i) != first);
                    
            }
            // 若还没到源字符串末尾，也即最大查找次数
            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;
                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); j++, k++);
                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "sssssddssshsddfdsads";
        System.out.println(s.indexOf("dtd"));
        System.out.println(strStr("", ""));

    }
}