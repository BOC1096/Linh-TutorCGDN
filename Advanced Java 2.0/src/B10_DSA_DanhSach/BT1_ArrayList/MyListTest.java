package B10_DSA_DanhSach.BT1_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();

        myList.add("first");
        myList.add("second");
        myList.add("fourth");
        myList.add("fifth");

        System.out.println("1. Output My List: ");
        showList(myList);

        myList.add(2, "third");
//        myList.remove(myList.size() - 1);

        System.out.println("2. Output My List: ");
        showList(myList);

        MyList<String> otherMyList = new MyList<String>();
        otherMyList = myList.clone();
        System.out.println("3. Output My List: ");
        showList(otherMyList);

        System.out.println("Contains: " + otherMyList.contains("third"));
        System.out.println("Index of: " + otherMyList.indexOf("third"));

        otherMyList.ensureCapacity(5);
        System.out.println("Capacity: " + otherMyList.size());

        otherMyList.clear();
        System.out.println("3. Output My List: ");
        showList(otherMyList);
    }

    public static void showList(MyList<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
