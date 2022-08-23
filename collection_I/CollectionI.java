package collection_I;

import java.util.*;

//7	43	74	87	102
public class CollectionI {
    public static void q7() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Java");
        String idListSearch = "Java";
        if (arrayList.contains(idListSearch)) {
            System.out.println(" ton tai " + idListSearch + " trong danh sach");
        } else {
            System.out.println(" k ton tai " + idListSearch + " trong danh sach");
        }
    }

    public static void q43(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("quang");
        linkedList.add("dat");
        linkedList.add("tuyen");
        linkedList.add("trang");

        System.out.println(" danh sach ban dau : " + linkedList);
        System.out.println(" phan tu cuuoi danh sach : "  + linkedList.getLast());
        System.out.println(" danh sach sau khi lay ra pah tu cuoi : " +linkedList  );
    }
    public static void q74(){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(2);
        // show treeSet
        System.out.println("bo ban dau :" + treeSet);
        System.out.println("lay xoa phan tu dau tien :" + treeSet.pollFirst());
        System.out.println("bo sau :" + treeSet);
    }
    public static void q87(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Java");
        priorityQueue.add("C++");
        priorityQueue.add("PHP");
        priorityQueue.add("Java");
        System.out.println(priorityQueue);
        System.out.println( " String representation of the Priority Queue :"+ priorityQueue.toString());
    }
    public static void q102(){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"java");
        treeMap.put(2,"php");
        treeMap.put(3,"c++");
        System.out.println("treemap 1:" + treeMap);

        TreeMap<Integer,String> treeMap1= new TreeMap<>();
        treeMap1.putAll(treeMap);
        System.out.println("treemap 2 :" + treeMap1);
    }
    public static void main(String[] args) {
        q102();
    }
}
