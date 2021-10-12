package ex46;

import java.util.Map;
import java.util.TreeMap;

class findFrequency {


    public static  Map<String,Integer> frequencyCounter(String str)
    {
        Map<String,Integer> temp = new TreeMap<>();

        String array[] = str.split(" "); //splits string to create an array

        for(int i = 0; i < array.length; i++)
        {
            if(temp.containsKey(array[i]))
            {
                temp.put(array[i], temp.get(array[i])+1);
            }
            else
            {
                temp.put(array[i],1);
            }
        }

        return temp;
    }


    public static void print(String st)
    {
        Map<String,Integer> map=frequencyCounter(st);

        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.printf("%s %s %-2s", entry.getKey() , ":", "\t");
            for (int i = 0; i < entry.getValue(); ++i)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}