public class MarkNotFoundList extends LinkedList {

    MarkNotFoundList () {
        super();
    }

    MarkNotFoundList (int length) {};

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

        if(temp.data < 0) {
            return false;
        }

        while(temp.next != null) {
            if(temp.data < 0) {
                return false;
            }
            if(temp.next.data == key) {
                newHead = temp.next;
                temp.next = newHead.next;
                newHead.next = head;
                head = newHead;
                return true;
            }
            temp = temp.next;
        }

        newHead = new Node(-key, null);
        newHead.next = head;
        head = newHead;
        return false;
    }
}
