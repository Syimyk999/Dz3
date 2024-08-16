public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }
    public void registerUser(String username, String password) {
        if (username == null || username.isEmpty() || username.contains(" ")) {
            throw new IllegalArgumentException("Неверное имя пользователя : \"" + username + " \"");
        }
        if (password == null || password.length() < 8 ) {
            throw new IllegalArgumentException(" Слабый пароль : \"" + password + "\"");
        }
        this.username = username;
        this.password = password;

        System.out.println("Регистрация прошла успешно ");
    }
}
