class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> smap=new HashMap<>();
        HashMap<Character,Integer> tmap=new HashMap<>();
      
        for(char letter:s.toCharArray())
        {
            if(smap.containsKey(letter))
            {
                smap.put(letter,smap.get(letter)+1);
            }
            else{
                smap.put(letter,1);
            }
        }
        for(char letter:t.toCharArray())
        {
            if(tmap.containsKey(letter))
            {
                tmap.put(letter,tmap.get(letter)+1);
            }
            else{
                tmap.put(letter,1);
            }
        }

        for(char key:smap.keySet())
        {
            if(tmap.containsKey(key))
            {
                if(!smap.get(key).equals(tmap.get(key)))
                {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
        for(char key:tmap.keySet())
        {
            if(smap.containsKey(key))
            {
                if(!smap.get(key).equals(tmap.get(key)))
                {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
