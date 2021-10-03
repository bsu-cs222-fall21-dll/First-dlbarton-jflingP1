package edu.bsu.Model;

public class WikiRevision {
    String author;
    String timestamp;

    public WikiRevision(String author, String timestamp){
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
