package Speedpac;

import java.util.*;


public class Cattt {

    public static void main(String[] args)

    {
        String str="fpyuuoiio";
char[] arr= str.toCharArray();
Map<Character, Integer>map=new HashMap<Character, Integer>();

for(Character c: arr)
{
    if(map.containsKey(c))
    {
        map.put(c, map.get(c)+1);



    }
    else
    {
        map.put(c, 1);
    }
}


Set<Map.Entry<Character, Integer>>set1=map.entrySet();
        {
            for(Map.Entry<Character, Integer>mmm:set1)
            {if(mmm.getValue()>1)
            {
                System.out.println(mmm.getKey() + " " + mmm.getValue());
            }
            }
        }





    }
}
