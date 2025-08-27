/*
    BOJ 14500 테트로미노
    Status: v1  /
    Key:
    Notes:
    Last Reviewed: 2025-08-25
*/

package BruteForce;
import java.util.*;
import java.io.*;

public class P14500 {
    static int N, M;
    static int[][] a;
    static boolean[][] vis;
    static int ans = 0;
    static final int[] dx = {1,0,-1,0};
    static final int[] dy = {0,1,0,-1};
    static int maxCell; //pruning

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N][M];
        vis = new boolean[N][M];

        maxCell = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(a[i][j] > maxCell) maxCell = a[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                vis[i][j] = true;
                dfs(i, j , 1, a[i][j]);
                vis[i][j] = false;
                addT(i, j);
            }
        }
        System.out.println(ans);
    }

    // 깊이 4까지 선형/곡선(연결 경로) 모양 전부 탐색
    static void dfs(int x, int y, int depth, int sum) {
        if (depth == 4) {
            if (sum > ans) ans = sum;
            return;
        }
        //가지치기 : 남은 칸을 모두 최대값으로 더해도 갱신 불가하면 return
        if(sum + maxCell * (4 - depth) <= ans) return;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if( !inRange(nx,ny) || vis[nx][ny]) continue;
            vis[nx][ny] = true;
            dfs(nx, ny, depth + 1, sum + a[nx][ny]);
            vis[nx][ny] = false;
        }
    }

    // 중심 (x,y) 기준 T자 패턴 4개 합산
    static void addT(int x, int y) {
        // ㅗ: 위, 좌, 우
        tryT(x, y, new int[][]{{-1,0},{0,-1},{0,1}});
        // ㅜ: 아래, 좌, 우
        tryT(x, y, new int[][]{{1,0},{0,-1},{0,1}});
        // ㅏ: 위, 아래, 오른쪽
        tryT(x, y, new int[][]{{-1,0},{1,0},{0,1}});
        // ㅓ: 위, 아래, 왼쪽
        tryT(x, y, new int[][]{{-1,0},{1,0},{0,-1}});
    }

    static void tryT(int x, int y, int[][] arms) {
        int sum = a[x][y];
        for (int[] d : arms) {
            int nx = x + d[0];
            int ny = y + d[1];
            if( !inRange(nx,ny)) return; //하나라도 격자 밖이면 해당 T는 불가
            sum += a[nx][ny];
        }
        if(sum > ans) ans = sum;
    }

    static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

}
