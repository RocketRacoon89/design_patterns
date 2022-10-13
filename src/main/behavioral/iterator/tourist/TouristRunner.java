package main.behavioral.iterator.tourist;

public class TouristRunner {
    public static void main(String[] args) {
        String [] vp = {"Berlin", "Paris", "London", "Riga", "Milan"};

        Toursit toursit = new Toursit("Ivan", vp);

        Iterator iterator = toursit.getIterator();

        System.out.println("Tourist: "+toursit.getName());
        System.out.print("Visited cities: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
