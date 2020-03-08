package LinkedList;

class ListNodeSrc<t> {
    public ListNodeSrc headNode = null;
    public ListNodeSrc tailNode = null;
    public int count = 0;
    ListNodeSrc<t> next;
    int data;

    ListNodeSrc(int data) {
        this.data = data;
        this.next = null;

    }

    ListNodeSrc() {

    }

    public void add(int data) {
        System.out.println(" Data : " + data);
        ListNodeSrc newNode = new ListNodeSrc(data);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {

            tailNode.next = newNode;
            tailNode = newNode;
        }
        count++;
    }

    public int size() {

        return count;
    }

    public void display() {
        ListNodeSrc current = headNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int get(int i) throws NullPointerException {
        if (i > count || i < 0) {
            throw new NullPointerException(" Out of bound ");
        }
        if (headNode == null) throw new NullPointerException(" Out of bound ");
        if (i == 0) {
            return headNode.data;
        }
        if (i == count) {
            return tailNode.data;
        }
        ListNodeSrc current = headNode;
        int j = 0;
        for (j = 0; j <= i; j++) {
            System.out.println("Current Data : " + current.data);
            current = current.next;

        }
        return current.data;

    }


}

