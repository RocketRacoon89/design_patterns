package main.creational.prototype.copyable;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Pr1","SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        Project clone = new ProjectFactory(master).cloneProject();

        System.out.println(clone);
    }
}