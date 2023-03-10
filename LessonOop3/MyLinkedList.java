import java.util.Iterator;


public class MyLinkedList implements Iterable<node>
{   
    node first;
    node last;
    int size = 0;

    int nextIndex = 0;
    node next = null;
    MyLinkedList()
    {
        size = 0;
    }

    void Add(String data)
    {
        if (first == null)
        {
            first = new node(data);
            last = first;
        }
        else
        {
            last.nextNode = new node(data);
            last = last.nextNode;
        }

        size++;
    }

    public boolean hasNext() {
        return nextIndex < size;
    }

    public String next() {
        if (next == null)
        {
            next = first;
        }
        else
        {
            next = next.nextNode;
        }
        nextIndex++;
        return next.data;
    }

    int size()
    {
        return size;
    }

    @Override
    public Iterator<node> iterator() {

        Iterator<node> it = new Iterator<node>() {
        
            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public node next() {
                if (next == null)
                {
                    next = first;
                }
                else
                {
                    next = next.nextNode;
                }
                nextIndex++;
                return next;
            }


        };
        return it;

    }
}
