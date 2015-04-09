package week2Exceptions.problem4;

import java.util.HashMap;

public class NotNullList<K, V> extends HashMap<K, V>{

	private boolean insertNullKeys = false;
	
	public NotNullList(boolean insertNullElements){
		this.insertNullKeys = insertNullElements;
	}
	
	@Override
	public V put(K key, V value) {
		if (insertNullKeys) {
			if (key == null) {
				throw new NullException();
			}
		}
		return super.put(key, value);
	}
	
	@Override
	public V get(Object key) {
		if (insertNullKeys) {
			if (key == null) {
				throw new NullException();
			}
		}
		return super.get(key);
	}
}
