package Strings;

public class twoLetterString {
    public static void main(String[] args) {
        System.out.println(solution(5, 1, 2));
    }

    public static String solution(int AA, int AB, int BB) {
        // Implement your solution here
        StringBuilder sb = new StringBuilder();
        if (AA == 0 && AB == 0 && BB == 0) {
            return "";
        }
        if (AA == 0 && AB == 0 && BB != 0) {
            sb.append("BB");
        } else if (AA == 0 && AB != 0 && BB == 0) {
            sb.append("AB");
        } else if (AA != 0 && AB == 0 && BB == 0) {
            sb.append("AA");
        }
        for (int i = 0; i < AA; i++) {
            sb.append("AA");
            for (int j = 0; j < AB; j++) {
                if (sb.toString().charAt(i + 1) == 'A') {
                    sb.append("BA");
                } else {
                    sb.append("AB");
                }
                for (int k = 0; k < BB; k++) {
                    if (sb.toString().charAt(i + 1) == 'A') {
                        sb.append("BB");
                    }
                }

            }
        }
        return sb.toString();
    }
}
