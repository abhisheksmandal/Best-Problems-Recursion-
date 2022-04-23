public class Recursion
 {
    public static void moveX(String str, int idx, int count, String newStr){
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count += 1;
            moveX(str, idx+1, count, newStr);
        }
        else {
            newStr += currChar;
            moveX(str, idx+1, count, newStr);
        }        
    }
    public static void main(String[] args) {
        String str = "abcxdexfhxijxkl";
        moveX(str, 0, 0, "");
    }
}
