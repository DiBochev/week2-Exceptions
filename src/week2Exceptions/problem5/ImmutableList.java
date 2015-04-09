package week2Exceptions.problem5;

import java.util.ArrayList;
import java.util.Collection;


public class ImmutableList<E> extends ArrayList<E>{

	public ImmutableList(Collection<E> collection){
//		ArrayList<E> arr = new ArrayList<E>();
//		for (E element : collection) {
//			element.
//		}
		
//		TO_DO
	}
	
	@Override
	public E set(int index, E element) {
		throw new IllegalAccessError("cannot change element to immutable list!");
	}
	
	@Override
	public boolean add(E e) {
		throw new IllegalAccessError("cannot add element to immutable list!");
	}

	@Override
	public E get(int index) {
		return super.get(index);
	}
}
