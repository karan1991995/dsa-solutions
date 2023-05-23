class longestCommonPrefix {


    public static String longestCommonPrefix(String str[]) {
        String minimumStrinArr = str[0];
        String resultstr = "";
        for (int i = 0; i < str.length; i++) {
            if (minimumStrinArr.length() > str[i].length()) {
                minimumStrinArr = str[i];
            }
        }
        if (str.length == 1) {
            resultstr = minimumStrinArr;
        }
        for (int i = 1; i <= minimumStrinArr.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length; j++) {
                if (str[j].substring(0, i).equals(minimumStrinArr.substring(0, i))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                resultstr = minimumStrinArr.substring(0, i);
            }
        }
        return resultstr;
    }

    public static void main(String str[]) throws Exception {

        System.out.println(longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));

    }

}
