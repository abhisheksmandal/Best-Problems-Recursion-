public class Recursion {
    public static void reversePrint(String str, int idx){
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        reversePrint(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "ABCD";
        reversePrint(str, str.length()-1);
    }
}
