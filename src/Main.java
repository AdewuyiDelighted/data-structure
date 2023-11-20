import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> lists = new ArrayList<>();
       // lists.remove();
        lists.add(6);
        lists.add(8);
        lists.add(11);
        lists.add(6);
        lists.add(8);
        System.out.println(lists.get(0));
        System.out.println(lists.indexOf(12));
        System.out.println(!lists.contains(13));

    }
}