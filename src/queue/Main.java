package queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Comparator<Candidate> comparator = (firstCandidate,secondCandidate)->
                                            firstCandidate.getParty().compareTo(secondCandidate.getParty());
        Queue<Candidate> candidates = new PriorityQueue<>();
        candidates.offer(new Candidate("Asiwaju","Apc"));
        candidates.offer(new Candidate("Rabiu Kwankwaso","NNPP"));
        candidates.offer(new Candidate("Rufai","Apc"));
        candidates.offer(new Candidate("Peter Obi","LP"));
        candidates.offer(new Candidate("Chimezie","OPC"));


        System.out.println("Before:: "+ candidates);
    }

}

