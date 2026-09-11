class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> respotas = new ArrayList<>();
    
    HashMap<String, List<String>> hash = new HashMap<>();

    for(String s : strs){
      char[] carac = s.toCharArray();
      Arrays.sort(carac);
      String chave = new String(carac); 
      
      List<String> valores = new ArrayList<>();
      if(hash.containsKey(chave)){
        valores = hash.get(chave);
      }
      valores.add(s);
      hash.put(chave, valores);
    }

    for(Map.Entry<String, List<String>> c : hash.entrySet()){
      respotas.add(c.getValue());
    }

    return respotas;
  }
}
