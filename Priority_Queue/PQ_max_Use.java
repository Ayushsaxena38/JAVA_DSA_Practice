package Priority_Queue;

public class PQ_max_Use {

	public static void main(String[] args) throws PriorityQueueEmptyExcetion {
		// TODO Auto-generated method stub
		PQ_max<String> pq = new PQ_max<>();
		pq.insert("abs", 9);
		pq.insert("abd", 10);
		System.out.println(pq.getMax());
		pq.insert("ayush",25);
		System.out.println(pq.remove());
		System.out.println(pq.getMax());
	}

}
