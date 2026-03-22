public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.isEmpty()) return true;
        if(ransomNote.length() > magazine.length()) return false;
        int[] lookupArray = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            lookupArray[magazine.charAt(i) - 'a']++;
        }
        for(int j = 0; j < ransomNote.length(); j++) {
            if(lookupArray[ransomNote.charAt(j) - 'a'] >= 1) {
                lookupArray[ransomNote.charAt(j) - 'a']--;
            }
            else
                return false;
        }
        return true;
    }
}
