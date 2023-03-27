import java.io.FileWriter;

public class Homework2 {
    // 1.
    /*
    private static boolean isPolindrom(String targetStr){
        if (targetStr.length() == 1){
            return true;
        }
        for (int i = 0; i < targetStr.length()/2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        String [] arrStr = {"lol","qwqe","wow","o","Trort","eye","qwqsqwqa","9123k3219"};
        for (String s: arrStr)
            if (isPolindrom(s))
                System.out.printf("%s - Palindrome \n", s);
    }
*/
   // 2.
/*
   public static void StrRec() {
    StringBuilder sb = new StringBuilder();
    sb.append("TEST".repeat(100));
    try {
        try (FileWriter f1 = new FileWriter("Test.txt")) {
            f1.write(String.valueOf(sb));
            f1.flush();
        }
    } catch (Exception e) {
        System.out.println("FAIL");
    }
    }

    public static void main(String[] args) {
        StrRec();
    }
*/
}
