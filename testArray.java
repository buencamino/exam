public class testArray {
    public static int[] match1 = {1, 2, 3, 4, 5, 6};
    public static int[] match2 = {5, 6};
    public static boolean found = false;
    public static int j = 0, m = 0, result = 0;

    public static void main (String[] args) {
        System.out.println(arrayMatch(match1, match2));
    }

    public static int arrayMatch(int[] match1, int[] match2) {
        for (int x = 0; x < match1.length; x++) {
                if (match1[x] == match2[j]) {                   
                    if (found == false) {
                        m = x;
                    }
                    found = true;
                    
                    if (j == match2.length - 1) {
                        result = m;
                        break;
                    }
                    j++;                  
                } else {
                    j = 0;
                    found = false;
                }
        }

        return result;
    }
}
