package notes;

import java.util.ArrayList;
import java.util.List;
import notes.utils.StringUtils;
import notes.utils.TagValidator;
import notes.utils.TextUtils;

public class Main {
    public static void main(String[] args) {
        String rawTitle = " my java note ";
        String normalizedTitle = StringUtils.normalizeTitle(rawTitle);
        boolean isTitleValid = StringUtils.isValidTitle(normalizedTitle);

        System.out.println("Title Normalization:");
        System.out.println("Raw: " + rawTitle);
        System.out.println("Normalized: " + normalizedTitle);
        System.out.println("Valid: " + isTitleValid);

        System.out.println("Tag Processing:");

        String rawTagsString = "java, OOP, PRACTICE";
        String[] rawTagsArray = rawTagsString.split(","); //разъединение
        List<String> tagsList = new ArrayList<>();
        for (String tag : rawTagsArray){
            String trimmed = tag.trim();
            String lower = tag.toLowerCase();
            tagsList.add(tag);
        }
        String joinedTags = String.join(",", tagsList);

        System.out.println("Raw tags string: " + rawTagsString);
        System.out.println("Parsed: " + tagsList);
        System.out.println("Joined back: " + joinedTags);

        System.out.println("Tag Validation:");
        System.out.println("\"java\" is valid: " + TagValidator.isValidTag("java"));
        System.out.println("\"j\" is valid: " + TagValidator.isValidTag("j"));
        System.out.println("\"Java@123\" is valid: " + TagValidator.isValidTag("Java@123"));

        System.out.println("Content Preview:");
        String fignya = "This is a long note about Java programming and OOP concepts";
        String preview = TextUtils.truncateContent(fignya, 20);
        int wordsCount = TextUtils.countWords(fignya);

        System.out.println("Original: " + fignya);
        System.out.println("Preview: " + preview);
        System.out.println("Word count: " + wordsCount);
        System.out.println("Search for 'Java': " + ((TextUtils.searchInText(fignya, "Java")) ? "found" : "not found"));
        System.out.println("Search for 'Python': " + ((TextUtils.searchInText(fignya, "Python")) ? "found" : "not found"));

        System.out.println("Text Validation:");
        System.out.println("\"Hello\" is valid: " + TextUtils.isValidContent("Hello"));
        System.out.println("\"\" is valid: " + TextUtils.isValidContent(""));
        String a = "a";
        System.out.println("Length 5001 is valid: " + TextUtils.isValidContent(a.repeat(5001)));

    }
}
