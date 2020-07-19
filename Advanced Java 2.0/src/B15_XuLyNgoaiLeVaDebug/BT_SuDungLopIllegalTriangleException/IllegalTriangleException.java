package B15_XuLyNgoaiLeVaDebug.BT_SuDungLopIllegalTriangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Invalid input");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
