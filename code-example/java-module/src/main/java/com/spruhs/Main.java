import main.java.com.spruhs.ClassGreeter;
import main.java.com.spruhs.SingletonGreeter;
import main.java.com.spruhs.StaticGreeter;

public static void main(String[] args) {
    ClassGreeter classGreeter = new ClassGreeter();
    classGreeter.greet();

    StaticGreeter.greet();

    SingletonGreeter.INSTANCE.greet();
}