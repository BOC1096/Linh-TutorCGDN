package B23_BehavioralDesignPattern.BT_Strategy;

public class UserController {
    private UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public UserStorage getUserStorage() {
        return userStorage;
    }

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public static void main(String[] args) {
        UserController userControllerXml = new UserController(new XMLStorage());
        userControllerXml.userStorage.store(new User("Linh"));
        UserController userControllerMySql = new UserController(new MySQLStorage());
        userControllerMySql.userStorage.store(new User("Linh"));
    }
}
