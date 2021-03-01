package learn2kata;

public class camelCaseConvertion {

    static String toCamelCase(String s) {
        String camelCaseString;
        StringBuilder sb = new StringBuilder();
        String[] wordList = s.split("[-_*&]");
        for (int i = 0; i < wordList.length; i++) {
            if (i == 0) {
                sb.append(wordList[i]);
            }
            if (i >= 1) {
                if (Character.isUpperCase(wordList[i].charAt(0))) {
                    sb.append(wordList[i]);
                }
                if (Character.isLowerCase(wordList[i].charAt(0))) {
                    String modifiedString = wordList[i].substring(0, 1).toUpperCase() + wordList[i].substring(1);
                    sb.append(modifiedString);
                }

            }
        }
        camelCaseString = sb.toString();
        return camelCaseString;
    }
}