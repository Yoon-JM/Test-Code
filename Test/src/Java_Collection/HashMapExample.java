package Java_Collection;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("=== 깜짝 위생 검사====");
        hashMap.put("조영현", 1);
        hashMap.put("구민상", 6);
        hashMap.put("정동우", 2);
        hashMap.put("조민혁", 5);
        hashMap.put("진하늘", 3);
        hashMap.put("이용석", 3);
        hashMap.put("권순하", 0);

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();

        while (iterator1.hasNext()){
            Map.Entry<String, Integer> entry = iterator1.next();
            System.out.println("이름 : " + entry.getKey() + ", 머리 감은 횟수 : " + entry.getValue());
        }
        Set<String> keySet = hashMap.keySet();
        System.out.println("조사 참여자 :" + keySet);

        Collection<Integer> values = hashMap.values();
        Iterator<Integer> iterator2 = values.iterator();

        int total = 0;

        while (iterator2.hasNext()){
            int num = iterator2.next();
            total += num;
        }
        System.out.println("평균 :" + (float) total / keySet.size() + "회");

        System.out.print("가장 적게 감은 사람 : ");
        iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String , Integer> tempEntry = iterator1.next();
            if(tempEntry.getValue() == Collections.min(values))
                System.out.print(tempEntry.getKey() + " ");
        }
        System.out.println();
    }

}

