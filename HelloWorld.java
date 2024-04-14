import java.awt.*;


public class HelloWorld extends Frame {

    public HelloWorld() {
        setTitle("Hello, World!");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}