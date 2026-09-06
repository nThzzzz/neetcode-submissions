class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> ocorrenciaS = new HashMap<>();
    HashMap<Character, Integer> ocorrenciaT = new HashMap<>();

    for (Character c : s.toCharArray()) {
      ocorrenciaS.put(c, ocorrenciaS.getOrDefault(c, 0) + 1);
    }

    for (Character c : t.toCharArray()) {
      ocorrenciaT.put(c, ocorrenciaT.getOrDefault(c, 0) + 1);
    }

    return ocorrenciaS.equals(ocorrenciaT);
    }
}
