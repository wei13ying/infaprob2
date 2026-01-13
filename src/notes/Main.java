package notes;

import java.util.Arrays;
import notes.model.Note;
import notes.model.Notebook;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "Java Learningl", "Notes about Java programming");
        Notebook notebook2 = new Notebook(2, "Web Development", "HTML, CSS, JavaScript notes");
        Note note1 = new Note(1, "OOP Principles", "content", "2025-01-15 10:30", Arrays.asList("java", "oop", "theory"));
        Note note2 = new Note(2, "Collections Framework", "content", "2025-01-16 14:20", Arrays.asList("java", "collections", "list"));

        System.out.println("Notebooks: ");
        System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println("Notes: ");
        System.out.println(note1);
        System.out.println(note2);

        System.out.println("Tag Operations:");
        System.out.println("Original tags: " + note1.getTags());
        note1.addTag("practice");
        System.out.println("After adding 'practice': " + note1.getTags());


        boolean removed = note1.removeTag("theory");
        System.out.println("After removing 'theory': " + note1.getTags());
        System.out.println("Has tag 'oop': " + note1.hasTag("oop"));
        System.out.println("Has tag 'database': " + note1.hasTag("database"));
    }
}
