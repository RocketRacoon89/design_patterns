package main.behavioral.iterator.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibirnate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Mike", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
