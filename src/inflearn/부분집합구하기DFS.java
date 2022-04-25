package inflearn;

public class 부분집합구하기DFS {

    public static void main(String[] args) {
        int n = 3;
        boolean[] chk = new boolean[n+1];
        부분집합구하기DFS solution = new 부분집합구하기DFS();
        solution.solution(1, n, chk);
    }

    private void solution(int l, final int n, boolean[] chk) {
        if(l==(n+1))    {
            String temp = "";
            for(int i=1; i<=n; i++) {
                if(chk[i])  temp+=(i+" ");
            }
            if(temp.length()>0) System.out.println(temp);
            return;
        }
        else    {
            chk[l] = true;
            solution(l+1, n, chk);
            chk[l] = false;
            solution(l+1, n, chk);
        }
    }
}
