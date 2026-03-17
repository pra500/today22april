package pac1;

import org.apache.commons.codec.language.MatchRatingApproachEncoder;

import java.util.*;

public class Stringpgmss {
    public static void main(String[] args) {

        String s="pragti";
        String s1="";


        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }

        System.out.println(s1);



        //
        String s2="java is easy";
        StringBuilder sb=new StringBuilder();

       String[] arr=
        s2.split(" ");

       for(int i=arr.length-1;i>=0;i--)
       {
           sb.append(arr[i]);
           sb.append(" ");


       }
        System.out.println(sb.toString().trim());



       String s9="pyhassda";

       char[] arr2=  s9.toCharArray();



       Map<Character, Integer>map=new HashMap<Character, Integer>();
for(char c:arr2)
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

Set<Map.Entry<Character, Integer>>map1=map.entrySet();
for(Map.Entry<Character, Integer>map22:map1)
{
    if(map22.getValue()>1)
    {
        System.out.println(map22.getKey() + " " + map22.getValue());

    }
}


















    }
}
