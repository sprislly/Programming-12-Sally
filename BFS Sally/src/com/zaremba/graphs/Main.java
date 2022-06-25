package com.zaremba.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    public static ArrayList<Integer> checked = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("BFS.");
        setupTree();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your root node: ");
        int root = myObj.nextInt();

        checked.add(graph.get(root-1).getKey());
        BFS(root-1);
        for (Integer i : checked) {
            System.out.println(i);
        }

    }

    /* BFS
    The BFS algorithm that checks a node then all the nodes it is connected to.
    @param int index the starting node for the algorithm; requires int, index > 0.
    @return checks the line and then connected nodes to make sure they are accounted for in the list.
     */
    private static void BFS(int index) {
        //Your code here.  Feel free to modify signature or add helper functions
        Node line = graph.get(index);
        line.setVisited(true);
        addNode(line);
        for (Integer i : checked) {
            if(!graph.get(i-1).isVisited()) {
                BFS(i-1);
                break;
            }
        }
    }

    /* addNode
    @param Node line all the nodes in a line.
    @return adds the node in the list if it isn't already there.
     */
    private static void addNode(Node line){
        for(Integer i : line.getNodes()){
            int key = 0;
            for (Integer j : checked) {
                if(Objects.equals(i, j)){
                    key = 1;
                    break;
                }
            }
            if (key != 1) {
                checked.add(i);
            }
        }
    }


    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
