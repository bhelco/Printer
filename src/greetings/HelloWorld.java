package greetings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.Printer;


public class HelloWorld 
{
    public static void main(String[] args)
    {
        Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "My Printer", new ColorCartridge());
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        
        System.out.println(mySet.size());
        System.out.println(mySet.isEmpty());
        System.out.println(mySet.contains(1));
        System.out.println(mySet.contains(4));
        System.out.println(mySet.remove(1));
        System.out.println(mySet.size());
        System.out.println(mySet.contains(1));

        Queue<String> myQueue = new LinkedList<String>();
        myQueue.offer("a");
        myQueue.offer("b");
        myQueue.offer("c");
        
        while(myQueue.peek() != null)
        {
            System.out.println(myQueue.poll());
        }
        
        Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
        
        List<Integer> joeScores = new ArrayList<Integer>();
        joeScores.add(89);
        joeScores.add(70);
        joeScores.add(9);    
        testScores.put("Joe", joeScores);

        List<Integer> amyScores = new ArrayList<Integer>();
        amyScores.add(95);
        amyScores.add(100);
        amyScores.add(88);    
        testScores.put("Amy", amyScores);

        List<Integer> fredScores = new ArrayList<Integer>();
        fredScores.add(81);
        fredScores.add(75);
        fredScores.add(90);    
        testScores.put("Fred", fredScores);
        
        printScores("Joe", testScores);
        printScores("Amy", testScores);
        printScores("Fred", testScores);
    }
    
    public static void printScores(String studentName, Map<String, List<Integer>> scoresMap)
    {
        List<Integer> scores = scoresMap.get(studentName);
        System.out.println(studentName);
        for(int score : scores)
        {
            System.out.println(score);
        }
    }

}