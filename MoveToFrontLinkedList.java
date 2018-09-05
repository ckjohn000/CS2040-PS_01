public class MoveToFrontLinkedList extends LinkedList {

    public MoveToFrontLinkedList () {
        super();
    }

    /**
     * Method: search checks whether the key is in the list
     * @param key the integer to search for in the list
     * @return true if key is in the list and false otherwise
     */
    public boolean search(int key) {
        Node temp = head;
        Node newHead;

        if(temp == null) {
            return false;
        }

        if(temp.data == key) {
            return true;
        }

        while(temp.next != null) {
            if(temp.next.data == key) {
                newHead = temp.next;
                temp.next = newHead.next;
                newHead.next = head;
                head = newHead;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}