package main.structural.proxy.project;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/123");

        project.run();
    }
}
