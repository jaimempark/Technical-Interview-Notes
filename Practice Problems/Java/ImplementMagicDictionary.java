//https://leetcode.com/problems/implement-magic-dictionary/

class MagicDictionary {
    String[] dictionary;
    public MagicDictionary() {

    }
    
    public void buildDict(String[] dict) {
        dictionary = dict;
    }
    
    public boolean search(String word) {
        for (String dictWord: dictionary) {
            if (dictWord.length() == word.length()) {
                int count = 0;
                for (int i=0; i< word.length(); i++) {
                    if (word.charAt(i) != dictWord.charAt(i)) {
                        count++;
                    }
                    if (count > 1) {
                        break;
                    }
                }
                if (count == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}