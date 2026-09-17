class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        smap={}
        tmap={}
        for letter in s:
            if letter in smap.keys():
                smap[letter]+=1
            else:
                smap[letter]=1
        
        for letter in t:
            if letter in tmap.keys():
                tmap[letter]+=1
            else:
                tmap[letter]=1

        for key in smap.keys():
            if(key in tmap):
                if tmap[key]!=smap[key]:
                    return False
            else:
                return False
        for key in tmap.keys():
            if(key in smap):
                if smap[key]!=tmap[key]:
                    return False
            else:
                return False
        return True