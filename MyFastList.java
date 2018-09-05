/**
 * Extend either ArrayList or LinkedList
 */
public class MyFastList extends ArrayList /*ArrayList*/ {

    MyFastList(int length){
        super(length);
    }

    /**
     * Method: search checks whether the key is in the list
     * @param key the integer to search for in the list
     * @return true if key is in the list and false otherwise
     */
    public boolean search(int key) {
        int temp;
        for(int i = 0; i < m_max + 1; i++) {
            if (m_list[i] == key) {
                if(i - 1 >= 0) {
                    temp = m_list[i];
                    m_list[i] = m_list[i-1];
                    m_list[i-1] = temp;
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}