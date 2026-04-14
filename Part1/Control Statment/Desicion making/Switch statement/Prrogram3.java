class Prrogram3 {

    public static void main(String[] args) {

        char ch = '@';

        switch (ch) {

            case '!': case '@': case '#': case '$': case '%':
            case '^': case '&': case '*': case '(': case ')':
            case '-': case '_': case '+': case '=':
            case '{': case '}': case '[': case ']':
            case ':': case ';': case '"': case '\'':
            case '<': case '>': case '?': case '/':
            case '|': case '\\': case '.': case ',':
                System.out.println("Special character");
                break;

            default:
                System.out.println("Not a special character");
        }
    }
}
