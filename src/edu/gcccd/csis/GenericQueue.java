/**
 * Created by mark.wiggins on 11/8/2017.
 */
package edu.gcccd.csis;
import  java.util.ArrayList;
import  java.util.NoSuchElementException;


public class GenericQueue<A> {
private ArrayList <A> elements;
public GenericQueue() {
elements = new ArrayList<>();
}

public A dequeue() {
    if (elements.isEmpty())
        return null;
    else
        return elements.remove(0);
                    }

public void enqueue(A thing) {
elements.add(thing);
                            }


public int length() {
    elements.size();
      return elements.size();
                    }
}
