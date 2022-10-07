package main.creational.prototype.article;

import java.util.Date;

public class ArticleRunner {


    public static void main(String[] args) throws InterruptedException {
        Article main = new Article("Wheather", new Date(), "tomorrow: sunny");
        System.out.println(main);
        Thread.sleep(4000);
        Article clone = new ArticleFactory(main).cloneArticle();
        System.out.println(clone);
    }
}
