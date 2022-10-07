package main.creational.prototype.article;

import java.util.Date;

public class Article implements Copyable {
    private String name;
    private Date date;
    private String text;

    public Article(String name, Date date, String text) {
        this.name = name;
        this.date = date;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Object copy() {
        Article copy = new Article(name, date, text);
        return copy;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
