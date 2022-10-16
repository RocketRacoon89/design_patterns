package main.behavioral.memento.article;

import java.util.Date;

public class ArticleSave {
    private final String version;
    private final Date date;
    private final String text;

    public ArticleSave(String version, String text) {
        this.version = version;
        this.date = new Date();
        this.text = text;
    }

    public String getVersion() {return version;}

    public String getText() {
        return text;
    }

    public Date getDate() {return date;}


}
