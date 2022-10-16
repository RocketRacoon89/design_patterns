package main.behavioral.memento.article;

import java.util.Date;

public class Article {
    private String version;
    private Date date;
    private String text;

    public void setVersionAndDate(String version) {
        this.version=version;
        this.date=new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text=text;
    }

    public ArticleSave save() {
        return new ArticleSave(version, text);
    }

    public void load(ArticleSave save) {
        version= save.getVersion();
        date=save.getDate();
        text= save.getText();
    }

    @Override
    public String toString() {
        return "Article{" +
                "version='" + version + '\'' +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
