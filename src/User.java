import java.util.Scanner;

/**
 * Created by strejolopez on 12/1/16.
 */
public class User {
    private String name;
    private Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
