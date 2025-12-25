package Graph;

import java.lang.classfile.attribute.SourceIDAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CreateGraph {

    static void addData(List<List<Integer>> graph,int index, int data,int neighbour){
            graph.get(index).add(data);
            graph.get(index).add(neighbour);
    }

    static void dfs(List<List<Integer>> graph ,int node, boolean visited[]){
        System.out.println(node);
        visited[node] = true;

        for(int ele: graph.get(node)){
            if(!visited[ele]){
                dfs(graph,ele,visited);
            }
        }
    }

    static void bfs(List<List<Integer>> graph ,int node){
        boolean visited[] = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            for(int ele : graph.get(current)){
                if(!visited[ele]){
                    queue.add(ele);
                    visited[ele] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 4;

        // List<List<Integer>> graph = new ArrayList<>();
        // graph = [[1, 2], [0, 2], [1, 3], [0, 2]];
        // Scanner scanner = new Scanner(System.in);
        // for(int i=0;i<V;i++){
        //     graph.add(new ArrayList<>());
        //     System.out.print("Enter the neighbour 1 of " + i +":");
        //     int data = scanner.nextInt();
        //     System.out.print("Enter the neighbour 2 of " + i +":");
        //      int  neighbour = scanner.nextInt();
        //     addData(graph, i, data, neighbour);
        // }
        // System.out.println(graph);

           List<List<Integer>> graph = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(0, 2),
            Arrays.asList(1, 3),
            Arrays.asList(0, 2)
        );

        System.out.println(graph);
        boolean[] visited = new boolean[V];
        dfs(graph,3,visited);
        bfs(graph,0);

        // scanner.close();
    }
}
