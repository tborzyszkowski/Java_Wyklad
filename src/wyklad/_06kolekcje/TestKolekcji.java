package wyklad._06kolekcje;

import java.util.*;

public class TestKolekcji {

	public static void main(String[] args) {
		Random rand = new Random();
		
		final int K = 10 * 1000 * 1000;
		Integer findMe[] = new Integer[K];
		
		for(int i =0; i<K; i++)
			findMe[i] = rand.nextInt(20 * 1000 * 1000);
		
		final int N = 100 * 1000 * 1000;
		ArrayList<Integer> listInt = new ArrayList<Integer>(N);
		
		long time1 = System.currentTimeMillis(), 
				time2;

		///////////////////////////////////////
		// Lista
//		
//		for(int i = 0; i < N; i++)
//			listInt.add(rand.nextInt(1000 * 1000));
//		
//		time2 = System.currentTimeMillis();
//		System.out.println("List add time("+ N +") = "+ (time2 - time1));
//		
//		time1 = System.currentTimeMillis();
//		
//		Collections.sort(listInt);
//		
//		for(int i =0; i<K; i++) {
//			Collections.binarySearch(listInt, findMe[i]);
////			for(int j = 0; j < N; j++)
////				if(findMe[i].equals(listInt.get(j)))
////					continue;
//		}	
//		time2 = System.currentTimeMillis();
//		System.out.println("List find time("+ N +") = "+ (time2 - time1));
//		
		///////////////////////////////////////
		// HashTable
		HashSet<Integer> hashInt = new HashSet<Integer>();
		
		time1 = System.currentTimeMillis(); 
		
		for(int i = 0; i < N; i++)
			hashInt.add(rand.nextInt(1000 * 1000));
		
		time2 = System.currentTimeMillis();
		System.out.println("Hash add time("+ N +") = "+ (time2 - time1));

		time1 = System.currentTimeMillis();
		
		for(int i =0; i<K; i++) {
				hashInt.contains(findMe[i]);
		}	
		time2 = System.currentTimeMillis();
		System.out.println("Hash find time("+ K +") = "+ (time2 - time1));

		///////////////////////////////////////
		// Tree
		TreeSet<Integer> treeInt = new TreeSet<Integer>();
		
		time1 = System.currentTimeMillis(); 
		
		for(int i = 0; i < N; i++)
			treeInt.add(rand.nextInt(1000 * 1000));
		
		time2 = System.currentTimeMillis();
		System.out.println("Tree add time("+ N +")  = "+ (time2 - time1));
		
		time1 = System.currentTimeMillis();
		
		for(int i =0; i<K; i++) {
			treeInt.contains(findMe[i]);
		}	
		time2 = System.currentTimeMillis();
		System.out.println("Tree find time("+ K +") = "+ (time2 - time1));

	}

}
