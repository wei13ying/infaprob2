package notes.utils;

public class TagValidator {
    public static boolean isValidTag(String tag) {
        if (tag.length() < 2 || tag.length() > 20) {
            return false;
        }
        for (int i = 0; i < tag.length(); i++) {
            char a = tag.charAt(i);
            if (!(a >= 'a' && a <= 'z' || a >= '0' && a <= '9' || a == '-')) {
                return false;
            }
        }
        return true;
    }   
}
