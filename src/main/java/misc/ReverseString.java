package misc;

public class ReverseString {
    public String doIt(String input) {
        if (input.isEmpty()) {
            return input;
        }
        char[] charArray = input.toCharArray();
        int start = 0;
        char temp;
        int end = charArray.length - 1;

        if (start >= end) {
            return input;
        }

        for(;;) {
            while (!Character.isAlphabetic(charArray[start])) {
                ++start;
            }

            while (!Character.isAlphabetic(charArray[end])) {
                --end;
            }

            if (start < end) {
                temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                ++start;
                --end;
            } else {
                break;
            }
        }

        return new String(charArray);
    }
}
