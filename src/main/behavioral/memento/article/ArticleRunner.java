package main.behavioral.memento.article;

public class ArticleRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Create text doc:");

        Article article1 = new Article();
        article1.setText("Hello World!");
        article1.setVersionAndDate("1.0");

        System.out.println("Create SaveTable:");
        SaveTable saveTable = new SaveTable();
        saveTable.setSave(article1.save());

        System.out.println(article1.toString());
        System.out.println(saveTable.getSave().getText());

        Thread.sleep(3000);
        article1.setText("Hello World!!! this is nice day!");
        article1.setVersionAndDate("1.1");

        System.out.println(article1.toString());
        System.out.println(saveTable.getSave().getText());

        Thread.sleep(4000);
        System.out.println("ROLLBACK:");
        article1.load(saveTable.getSave());
        System.out.println(article1.toString());
        System.out.println(saveTable.getSave().getText());

    }
}
