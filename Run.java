package Exersice11_8;

import java.util.*;
/*
 Write a method minLength that accepts a set of strings as a parameter and that returns
 the length of the shortest string in the list. If your method is passed an empty set,
 it should return 0.
 */




public class Run
{

    public static void main(String[] args)
    {
        Set<String> list1 = new HashSet<>();
        list1.add("Hej");
        list1.add("HGHGHG");

        System.out.println(minLength(list1));




    }

    public static int minLength (Set<String> list)
    {

        int shortest = 999;

        for (String s: list)
        {
            if(s.length() < shortest)
            {
                shortest = s.length();

            }
        }
        return shortest;

    }



}
