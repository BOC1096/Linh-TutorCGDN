package B23_BehavioralDesignPattern.BT_Strategy;

public class XMLStorage implements UserStorage{

    @Override
    public void store(User user) {
        System.out.println("Luu du lieu vào XMLStore vói User là : " + user.getName());
    }
}
