import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class teodie {

    public static void main(String[] args) {

        String name = "Quejad Teodie";
        int length = 15, width = 8;

        System.out.println("Hello, " + name + "! Welcome to my class.");
        System.out.println("Rectangle Area: " + (length * width));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Today's Date and Time: " + now.format(formatter));
    }
}
