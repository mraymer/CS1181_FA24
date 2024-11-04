import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;

class Main {
    public static void main(String[] args) throws Exception{
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(5);
        s.push(12);
        System.out.println(s.pop());
        s.push(11);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());     
        //System.out.println(s.pop());

        System.out.println("Priority queue:");
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            return a.compareTo(b) * -1;
        });
        q.offer(12);
        q.offer(22);
        q.offer(5);
        q.offer(16);
        q.offer(35);
        q.offer(2);

        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        Map<Integer, String> checkOuts = new HashMap<>();
        checkOuts.put(123, "Raymer");
        checkOuts.put(456, "Doom");
        checkOuts.put(123, "Wischgoll");

        System.out.println(checkOuts.get(123));
        
        Map<String, Integer> words = new HashMap<>();
        Scanner inFile = new Scanner(new File("test.txt"));

        while(inFile.hasNextLine()){
            String line = inFile.nextLine();

            for (String word : line.split("[\\s\\p{Punct}]+")){
                Integer count = words.get(word);
                if (count == null){
                    words.put(word, 1);
                } else {
                    words.put(word, count+1);
                }
            }
        }
        inFile.close();
        System.out.println(words);

    }

 
}