class Solution {
    public String frequencySort(String s) {
        //construct all the frequencies for all characters
        HashMap<Character,Integer> frequancyOFChars=new HashMap<>();
        for (char c: s.toCharArray() ) {
            if(!frequancyOFChars.containsKey(c)){
                frequancyOFChars.put(c,1);
            }else{
                frequancyOFChars.put(c,frequancyOFChars.get(c)+1);
            }
        }

        ArrayList<Character> sortedCharacters=new ArrayList<>();
        //add all char in priority queue
        frequancyOFChars.forEach((Character e,Integer x)->{
            sortedCharacters.add(e);
        });

        Collections.sort(sortedCharacters, new Comparator<Character>() {
            @Override
            public int compare(Character t1, Character t2) {
                int t1Freq=frequancyOFChars.get(t1);
                int t2Freq=frequancyOFChars.get(t2);
                return t2Freq-t1Freq;
            }
        });
        System.out.println(sortedCharacters.toString());
        //build the res
        StringBuilder res=new StringBuilder();
        sortedCharacters.forEach(e->{
            for (int i = 0; i <frequancyOFChars.get(e) ; i++) {
                res.append(e);
            }
        });

        return res.toString();
  
    }
}