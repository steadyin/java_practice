package inflearn;

//class Node {
//    int data;
//    Node lt;
//    Node rt;
//
//    public Node(int data) {
//        this.data = data;
//        lt = rt = null;
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {
    int[] dis = {-1, 1, 5};
    int[] chk = new int[10001];
    int answer = -1;
    Queue<Integer> queue = new LinkedList<>();

    private int bfs(int start, int target)  {
        int level = 0;

        queue.offer(start);
        chk[start] = 1;

        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i=0; i<len; i++) {
                int n = queue.poll();

                for(int j=0; j<3; j++) {
                    int k = n + dis[j];

                    if(k==target)   return level + 1;

                    if(k>=1 && k<=10000 && chk[k]==0) {
                        chk[k] = 1;
                        queue.offer(k);
                    }
                }
            }

            level ++;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        송아지찾기 solution = new 송아지찾기();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        System.out.println(solution.bfs(n, m));
    }
}
