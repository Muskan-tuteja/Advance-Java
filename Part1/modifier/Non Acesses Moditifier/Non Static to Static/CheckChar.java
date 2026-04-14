class CheckChar {

    // static method
    static void checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase letter");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase letter");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit");

        } else {
            System.out.println(ch + " is Special character");
        }
    }
  // non-static method
    void CharResult() {
        // non-static → static (direct call)
        checkChar('A');
 checkChar('a');
 checkChar('1');
 checkChar('&');
    }


 public static void main(String[] args) {

        // object needed to call non-static method
        CheckChar obj = new CheckChar();

        // non-static method call
        obj.CharResult();
    }
}

class CheckChar{
static void charCheck (Char ch){

if (ch > ='A' && ch<='Z'){
Syestem.out.println(ch + "Uppercase Letter");
}else if(ch >='a && ch<='z'){
System.out.println(ch + "Lowecase letter");
}else if(ch >='0' && ch<='9'){
System.out.println(ch + "is digit");
}else{
System.out.println(ch + "is specia; 
