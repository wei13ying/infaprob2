package notes.utils;

public class TextUtils {
    public static boolean isValidContent(String content) {
        if (content.length() < 1) {
            return false;
        }
        if (content.length() > 5000) {
            return false;
        }
        return true;
    }

    public static String truncateContent(String content, int maxLength) {
        if (content.length() <= maxLength) {
            return content;
        }
        return content.substring(0, maxLength) + "...";
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static boolean searchInText(String text, String keyword) {
        return text.toLowerCase().contains(keyword.toLowerCase());
    }
}
