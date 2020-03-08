package LinkedList;

public class ListNodeImplementation {

    public static void main(String[] a) {
        ListNodeSrc<Integer> listNode = new ListNodeSrc<Integer>();
        listNode.add(9);
        listNode.add(4);
        listNode.add(5);
        System.out.println("Count : " + listNode.count);
        System.out.println(" listNode.get() : " + listNode.get(3));


    }


}
