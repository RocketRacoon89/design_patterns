package main.behavioral.iterator.tourist;

public class Toursit implements Collection{
    String name;
    String[] visitPoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getVisitPoints() {
        return visitPoints;
    }

    public void setVisitPoints(String[] visitPoints) {
        this.visitPoints = visitPoints;
    }

    public Toursit(String name, String[] visitPoints) {
        this.name = name;
        this.visitPoints = visitPoints;
    }

    @Override
    public Iterator getIterator() {
        return new VisitIterator();
    }

    private class VisitIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index<visitPoints.length) {
                return true;
            } else {
                return false;
            }

        }

        @Override
        public Object next() {
            return visitPoints[index++];
        }
    }

}
