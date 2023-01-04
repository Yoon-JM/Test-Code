package Java_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("egg");
        list.add("tree");

        int size = list.size();

        for(int i=1; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        for (String str : list){
            System.out.println(str);
        }

        list.remove(0);

    }
}
