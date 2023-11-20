import list.List;

public class MySet {
    private List list = new List();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(int number) {
        if (!list.contains(number)) {
            list.add(number);
        }
    }

    public void contain(int element) {
        list.contains(element);
    }

    public void remove(int element) {
        list.remove(list.indexOf(element));
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}
