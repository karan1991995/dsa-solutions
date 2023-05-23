class LengthOfLastWord {
    //Function to find the minimum element in sorted and rotated array.
    public static int lengthOfLastWord(String s) {
        String words[]= s.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String str[]) throws Exception {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));


    }

}
