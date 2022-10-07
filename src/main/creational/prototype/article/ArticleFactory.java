package main.creational.prototype.article;

public class ArticleFactory {
    Article article;

    public ArticleFactory(Article article) {
        this.article=article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    Article cloneArticle() {
        return (Article) article.copy();
    }
}
