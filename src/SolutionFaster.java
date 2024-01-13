import java.util.HashMap;

class SolutionFaster {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> lettersCounter = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            if (lettersCounter.get(c) == null) lettersCounter.put(c, 1);
            else lettersCounter.put(c, lettersCounter.get(c) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (lettersCounter.get(c) != null && lettersCounter.get(c) != 0) {
                lettersCounter.put(c, lettersCounter.get(c) - 1);
            } else return false;
        }
        return true;
    }
}