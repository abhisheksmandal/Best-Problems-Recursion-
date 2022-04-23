public class Recursion {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element){
        if (idx == str.length()) {
            System.out.print(first + " " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            }
            
            last = idx;
        }
        
        findOccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abcdabc";
        findOccurence(str, 0, 'c');
    }
}
