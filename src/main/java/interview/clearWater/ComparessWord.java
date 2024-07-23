package interview.clearWater;

/*
A Student decide to perform some operations on big words to compress them so they become easy to remember. An operation consists of choosing a group of k consecurive equal character and removing them. The student keeps perform this operation as long as it is possible. Determine the final word after the operation is performed.
        Example : word = "abbcccb"

        k=3

        remove consicutive workd like c after remove c then b
        final output is a

 */




public class ComparessWord {

    public static String compressWord(String word, int k) {
        StringBuilder compressedWord = new StringBuilder(word);
        boolean compressed = true;

        while (compressed) {
            compressed = false;
            int start = 0;
            int end = 0;

            while (end < compressedWord.length()) {
                while (end < compressedWord.length() && compressedWord.charAt(start) == compressedWord.charAt(end)) {
                    end++;
                }
                if (end - start >= k) {
                    compressedWord.delete(start, end);
                    compressed = true;
                    break;
                }
                start = end;
            }
        }
        return compressedWord.toString();
    }
    public static void main(String[] args) {
        String word = "abbcccdb";
        int k = 3;
        String compressedWord = compressWord(word, k);
        System.out.println("Final word: " + compressedWord);  // Output: "a"
    }
}
