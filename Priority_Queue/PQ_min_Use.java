package Priority_Queue;

public class PQ_min_Use {

	public static void main(String[] args) throws PriorityQueueEmptyExcetion {
		// TODO Auto-generated method stub
		PQ_min<String> pq = new PQ_min<>();
		pq.insert("abs", 0);
		pq.insert("abb", 1);
		pq.insert("aab", 2);
		pq.remove();
		System.out.println(pq.getMin());
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		pq.remove();
//		System.out.println(pq.getMin());
		
		System.out.println(pq.getMin());
		pq.insert("abs",1);
		
		System.out.println(pq.getMin());
		pq.insert("nkl",3);
		pq.insert("auui", 4);
		System.out.println(pq.remove());
		

	}

}
