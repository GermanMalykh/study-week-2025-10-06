package java_practice;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

/**
 * Example 1:
 * //
 * //Input: haystack = "sadbutsad", needle = "sad"
 * //Output: 0
 * //Explanation: "sad" occurs at index 0 and 6.
 * //The first occurrence is at index 0, so we return 0.
 * //Example 2:
 * //
 * //Input: haystack = "leetcode", needle = "leeto"
 * //Output: -1
 * //Explanation: "leeto" did not occur in "leetcode", so we return -1
 */
public class LeetCode28 {
    public static void main(String[] args) {
//        System.out.println("Should be 0, but = " + strStr("sadbutsad", "sad")); //0
//        System.out.println("Should be -1, but = " + strStr("leetcode", "leeto")); //-1
        System.out.println("Should be 2, but = " + strStr("hello", "ll")); //2
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            // Проверяем посимвольно совпадение окна
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // расхождение — выходим из внутреннего цикла
                }
            }
            if (j == needle.length()) {
                return i; // все m символов совпали — нашли первое вхождение
            }
        }
        return -1;
    }

    public static int strStrIndexOf(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}

