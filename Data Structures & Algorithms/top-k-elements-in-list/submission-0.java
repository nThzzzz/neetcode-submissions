class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] Frequentes = new int[k];

    Map<Integer, Integer> ocorrencia = new HashMap<>();

    for(int i=0; i<nums.length; i++){
        ocorrencia.put(nums[i], ocorrencia.getOrDefault(nums[i], 0)+1);
    }

    // ordena um map com base valores
    List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(      ocorrencia.entrySet());
    lista.sort(Map.Entry.comparingByValue());
    lista = lista.reversed();

    for(int i=0; i<k; i++){
        Frequentes[i] = lista.get(i).getKey();
    }

    return Frequentes;
    }
}
