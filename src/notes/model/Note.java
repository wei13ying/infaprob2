package notes.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import notes.utils.DateUtils;
import notes.utils.StringUtils;

public class Note {
    private int id;
    private String title;
    private String content;
    private String createdAt;
    private List<String> tags;

    public Note(int id, String title, String content, String createdAt, List<String> tags) {
        this.id = id;
        this.title = StringUtils.normalizeTitle(title);
        this.content = content;
        if (DateUtils.isValidDateTime(createdAt)){
            this.createdAt = createdAt;
        } else {
            this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm"));
        }
        
        this.tags = new ArrayList<>(tags);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return new ArrayList<>(tags);
    }

    public void setTags(List<String> tags) {
        this.tags = new ArrayList<>(tags);
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", title=" + title + ", createdAt=" + createdAt + ", tags=" + tags + "]";
    }
    
    public void addTag(String tag) {
        String normalizedTag = tag.trim().toLowerCase();
        tags.add(normalizedTag);
        
    }

    public boolean removeTag(String tag) {
        return tags.remove(tag);
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }
}
