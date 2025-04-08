package main.kotlin.com.spruhs;

class JavaUser {
    private String name;

    public JavaUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class NullHandlingExample {
    public static String getUserName(JavaUser user) {
        return (user != null && user.getName() != null) ?
                user.getName() : "Unbekannter Benutzer";
    }

    public static void main(String[] args) {
        JavaUser user1 = new JavaUser("Fabian");
        JavaUser user2 = null;

        System.out.println(getUserName(user1)); // Ausgabe: Fabian
        System.out.println(getUserName(user2)); // Ausgabe: Unbekannter Benutzer
    }
}
