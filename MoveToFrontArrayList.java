/**
 * MoveToFrontArrayList
 * Description: 
 * CS2040
 * 
 * You need to create a constructor and implement search.
 */


/**
 *
 */
public class MoveToFrontArrayList extends ArrayList {

    MoveToFrontArrayList(int length){
        super(length);
    }

    //Function shifts the elements of the array up to make space for the key
    void shift(int high) {
        for(int i = 0; i < high; i++) {
            m_list[high - i] = m_list[high - i - 1];
        }
    }

    //returns true if array contains the key; false otherwise
    //if key is found, key is replaced as the first element in the array
    public boolean search(int key) {
        int temp;
        for(int i = 0; i < m_max + 1; i++) {
            if (m_list[i] == key) {
                temp = key;
                shift(i);
                m_list[0] = temp;
                return true;
            }
        }
        return false;
    }
}