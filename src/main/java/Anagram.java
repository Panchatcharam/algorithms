import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public Boolean TestAnagram(String one, String two) {

        if (one.length() != two.length()) {
            return false;
        }

        Map<Character, Integer> freqOne = new HashMap<>();
        Map<Character, Integer> freqTwo = new HashMap<>();

        for (int index = 0 ; index < one.length(); ++index) {
            if (freqOne.containsKey(one.charAt(index))) {
                freqOne.put(one.charAt(index), freqOne.get(one.charAt(index)) +1);
            } else {
                freqOne.put(one.charAt(index), 1);
            }
        }

        for (int index = 0 ; index < two.length(); ++index) {
            if (freqTwo.containsKey(two.charAt(index))) {
                freqTwo.put(two.charAt(index), freqTwo.get(two.charAt(index)) +1);
            } else {
                freqTwo.put(two.charAt(index), 1);
            }
        }

        for(int index = 0 ; index < one.length(); ++index) {
            if (!freqTwo.get(one.charAt(index)).equals(freqOne.get(one.charAt(index)))) {
                return false;
            }
        }

        return true;
    }
}
