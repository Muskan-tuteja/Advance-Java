class Logout {

    // Logout with username only
    public static void logout(String username) {
        System.out.println(username);
    }

    // Logout with username and reason
    public static void logout(int password) {
        System.out.println(password);
    }

    // Logout with username, reason and time
    public static void logout(float time) {
        System.out.println(time);
    }

    public static void main(String[] args) {

        logout("muskan");
        logout(123456);
        logout(1030);
    }
}
