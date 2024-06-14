package String;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sCounter = new int[26];
        int[] tCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            sCounter[cs - 'a']++;
            tCounter[ct - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCounter[i] != tCounter[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "rat";
        String t1 = "car";
        System.out.println(validAnagram(s, t));
        System.out.println(validAnagram(s1, t1));
    }

}
