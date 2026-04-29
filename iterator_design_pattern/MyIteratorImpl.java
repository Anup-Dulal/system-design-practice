package iterator_design_pattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> users;
    private int length;

    
    private int position = 0;

    public MyIteratorImpl(List<User> users) {
        this.users = users;
        this.length = users.size();
    }

    @Override
    public boolean hasNext() {
        if ( position >= length) 
            return false;
        else 
            return true;
    }

    @Override
    public Object next() {
        User user = users.get(position);
        position++;
        return user;
    }
}
