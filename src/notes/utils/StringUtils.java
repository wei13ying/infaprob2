package notes.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    
    public String trimAndNormalize(String text) {
        String[] words = text.trim().split("\\+s");
        return String.join(" ", words);
    }

    public static String normalizeTitle(String title) {
        String trimmedTitle = title.trim();
        if (trimmedTitle.length() < 3) {
            throw new IllegalArgumentException("Title must be bigger");
        }
        String normalizeTitle = trimmedTitle.substring(0, 1).toUpperCase() + trimmedTitle.substring(1).toLowerCase();
        return normalizeTitle;
    }

    public static boolean isValidTitle(String title) {
        if (title.length() < 3 || title.length() >100) {
            return false;
        }
        for (int i = 0; i < title.length(); i++) {
            char a = title.charAt(i);
            if (!(a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z' || a >= '0' && a <= '9' || a == ' ' || a == '-' || a == '.')) {
                return false;
            }
        }
        return true;
    }

    public List<String> parseTags(String tagsString) {
        List<String> tags = new ArrayList<>();
        String[] parts = tagsString.split(",");
        for (String part : parts) {
            String tag = part.trim().toLowerCase();
            if (!tag.isEmpty()) {
                tags.add(tag);
            }
        }

        return tags;
    }

    public String joinTags(List<String> tags) {
        return String.join(",", tags);
    }
    
}
