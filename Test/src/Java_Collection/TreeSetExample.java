package Java_Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String> works = new TreeSet<>();

        works.add("Yoon Jimin");
        works.add("Java 망해라");
        works.add("Very 힘들어요");

        System.out.println(works);
        System.out.println(works.first());
        System.out.println(works.last());
        System.out.println(works.higher("Yoon"));
        System.out.println(works.subSet("Java", "Very"));

    }
    class node{
        Object element;
        node leftl;
        node right;
    }
}
