

import java.util.*;
import dto.Employee;

public class Test {
    public static void main(String[] args) {
        /*
        * Creating a arraylist
        */
        List<Integer> arrayList = new ArrayList<>();

        /*
         * Adding elements to ArrayList
         */

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        /*
         * Adding collection to arrayList
         */
        arrayList.addAll(Arrays.asList(1,6,7,8,90,100,99));
        System.out.println(arrayList);

        /*
         * Updating elements in arrayList
         */
        arrayList.set(2,10);
        System.out.println(arrayList);

        /*
         * Removing elements from ArrayList based on value
         */
        arrayList.remove(new Integer(4));
        arrayList.remove(Integer.valueOf(4));
        System.out.println(arrayList);

        /*
         * Removing elements from ArrayList based on index
         */
        arrayList.remove(Integer.valueOf(1));
        System.out.println(arrayList);

        /*
         * Sorting an arrayList
         */
        Collections.sort(arrayList);
        System.out.println(arrayList);

        /*
         * Creating a linkedList
         */
        List<Integer> linkedList = new LinkedList<>();

        /*
         * Adding elements to linkedList
         */

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        /*
         * Adding collection to linkedList
         */
        linkedList.addAll(Arrays.asList(1,6,7,8,90,100,99));
        System.out.println(linkedList);

        /*
         * Updating elements in linkedList
         */
        linkedList.set(2,10);
        System.out.println(linkedList);

        /*
         * Removing elements from linkedList based on value
         */
        linkedList.remove(new Integer(4));
        linkedList.remove(Integer.valueOf(4));
        System.out.println(linkedList);

        /*
         * Removing elements from linkedList based on index
         */
        linkedList.remove(Integer.valueOf(1));
        System.out.println(linkedList);

        /*
         * Sorting an linkedList
         */
        Collections.sort(linkedList);
        System.out.println(linkedList);


        /*
         * Understanding hashcode
         * */

        Employee e;
        e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        System.out.println(e);
        System.out.println(e.getClass().getName() + "@" + Integer.toHexString(e.hashCode()));

        Employee e1 = new Employee();
        e1.name = "Reyan Ali";
        e1.address = "Phokka Kuan, Ambehta Peer";
        e1.SSN = 11122333;
        e1.number = 101;

        System.out.println(e1);
        System.out.println(e1.getClass().getName() + "@" + Integer.toHexString(e1.hashCode()));


        /*
         * Creating a hashMap
         */

        Map<Integer, String> map = new HashMap<>();


        /*
         * Adding entries to a hashMap
         */
        map.put(21,"20");
        map.put(200,"20");
        map.put(120,"20");
        map.put(1,"test");
        map.put(20,"20");

        /*
        * Iterate over map entries
        * */
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Key :" + entry.getKey());
            System.out.println("Value :" + entry.getValue());
        }

        /*
        * Check if a key is present or not
         */
        System.out.println( map.containsKey(1));

        /*
         * Creating a linkedHashMap
         */

        Map<Integer, String> linkedHashmap = new LinkedHashMap<>();


        /*
         * Adding entries to a linkedhashMap
         */
        linkedHashmap.put(21,"20");
        linkedHashmap.put(200,"20");
        linkedHashmap.put(120,"20");
        linkedHashmap.put(1,"test");
        linkedHashmap.put(20,"20");

        /*
         * Iterate over map entries
         * */
        for (Map.Entry entry: linkedHashmap.entrySet()) {
            System.out.println("Key :" + entry.getKey());
            System.out.println("Value :" + entry.getValue());
        }

        /*
         * Check if a key is present or not
         */
        System.out.println(linkedHashmap.containsKey(1));

        /*
         * Creating a treeMap
         */

        Map<Integer, String> treeMap = new HashMap<>();


        /*
         * Adding entries to a treeMap
         */
        treeMap.put(21,"20");
        treeMap.put(200,"20");
        treeMap.put(120,"20");
        treeMap.put(1,"test");
        treeMap.put(20,"20");

        /*
         * Iterate over map entries
         * */
        for (Map.Entry entry: treeMap.entrySet()) {
            System.out.println("Key :" + entry.getKey());
            System.out.println("Value :" + entry.getValue());
        }

        /*
         * Check if a key is present or not
         */
        System.out.println( treeMap.containsKey(1));


        /*
        * Create a set
        * */
        Set<Integer> set = new HashSet<>();

        /*
        * Add values to a set
        * */
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        /*
        * Print the full set
         */
        System.out.println(set);

        /*
        * Iterate over the set
        * */
        for(int i : set){
            System.out.println(i);
        }

        /*
         * Create a linkedHashset
         * */
        Set<Integer> linkedHashset = new LinkedHashSet<>();

        /*
         * Add values to a linkedHashset
         * */
        linkedHashset.add(1);
        linkedHashset.add(2);
        linkedHashset.add(5);
        linkedHashset.add(3);
        linkedHashset.add(4);

        /*
         * Print the full linkedHashset
         */
        System.out.println(linkedHashset);

        /*
         * Iterate over the linkedHashset
         * */
        for(int i : linkedHashset){
            System.out.println(i);
        }


    }
}
