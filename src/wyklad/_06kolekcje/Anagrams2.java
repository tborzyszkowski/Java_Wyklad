package wyklad._06kolekcje;
import java.util.*;
import java.io.*;
import java.util.List;

public class Anagrams2 {
    public static void main(String[] args) {
    	long time1 = System.currentTimeMillis(), 
				time2;
        int minGroupSize = Integer.parseInt(args[1]);
 
        // Read words from file and put into simulated multimap
        Map<String, LinkedList<String>> m = new HashMap<String, LinkedList<String>>();
        try {
            Scanner s = new Scanner(new File(args[0]));
            String word;
            while(s.hasNext()) {
                String alpha = alphabetize(word = s.next());
                LinkedList<String> l = m.get(alpha);
                if (l==null)
                    m.put(alpha, l=new LinkedList<String>());
                l.add(word);
            }
        } catch(IOException e) {
            System.err.println(e);
            System.exit(1);
        }

        // Make a List of all permutation groups above size threshold
        LinkedList<LinkedList<String>> winners = new LinkedList<LinkedList<String>>();
        for (LinkedList<String> l : m.values() ) {
            if (l.size() >= minGroupSize)
                winners.add(l);
   }

        // Sort permutation groups according to size
        Collections.sort(winners, new Comparator<List<String>>() {
            public int compare(List<String> o1, List<String> o2) {
                return o2.size() - o1.size();
            }
        });

        time2 = System.currentTimeMillis();
        		
        // Print permutation groups
        for (List<String> l : winners ) {
            System.out.println(l.size() + ": " + l);
        }
        System.out.println(winners.size());
        System.out.println("Time: " +  (time2 - time1));
    }

    private static String alphabetize(String s) {
        int count[] = new int[256];
        int len = s.length();
        for (int i=0; i<len; i++)
            count[s.charAt(i)]++;
        StringBuffer result = new StringBuffer(len);
        for (char c='a'; c<='z'; c++)
            for (int i=0; i<count[c]; i++)
                result.append(c);
        return result.toString();
    }
}
