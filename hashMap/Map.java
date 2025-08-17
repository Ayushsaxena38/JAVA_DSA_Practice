package hashMap;

import java.util.ArrayList;

public class Map <K,V>{
	ArrayList<mapNode<K,V>> bucket;
	int count;
	int numBucket;
	
	public Map() {
		bucket = new ArrayList<>();
		numBucket = 5;
		count = 0;
		for(int i = 0 ; i < 5; i++) {
			bucket.add(null);
		}
	}
	
	// HashFunction
	public int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc%numBucket;
		return index;
	}
	
	// insert Function
	public void insert(K key , V value) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K,V> head = bucket.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = bucket.get(bucketIndex);
		mapNode <K,V> newHead = new mapNode(key,value);
		newHead.next = head;
		bucket.set(bucketIndex, newHead);
		count++;
		double loadFactor = (1.0*count)/numBucket;
		if(loadFactor > 0.7) {
			reHash();
		}
	}
	
	private void reHash() {
		// TODO Auto-generated method stub
		ArrayList<mapNode<K,V>> temp = bucket;
		bucket = new ArrayList<>();
		count = 0;
		numBucket = numBucket*2;
		for(int i = 0; i < numBucket ; i++) {
			bucket.add(null);
		}
		for(int i = 0 ; i<temp.size();i++) {
			mapNode<K,V> head = temp.get(i);
			while(head != null) {
				K key = head.key;
				V value = head.value;
				insert(key,value);
				head = head.next;
			}
		}
	}
	// Load function
	public double loadFactor() {
		return (1.0*count)/numBucket;
		
	}
	// size function
	public int size(){
		
		return count;
		
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	// Search Function
	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K, V> head = bucket.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	// is key present in map
	public boolean containsKey(K key) {
		int bucketIndex = getBucketIndex(key);
		mapNode<K,V> head = bucket.get(bucketIndex);
		while( head != null) {
			if(head.key.equals(key)) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
	
	// delete function
	public V remove(K key) {
		if(count == 0) {
			return null;
		}
		int bucketIndex = getBucketIndex(key);
		mapNode<K,V> head = bucket.get(bucketIndex);
		mapNode<K,V> prev = null;
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
					count--;
				}else {
					bucket.set(bucketIndex,head.next);
					count--;
				}
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	
	
	
	
	

}
