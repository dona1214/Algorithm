/*
코딩테스트를 준비하는 머쓱이는 프로그래머스에서 문제를 풀고 나중에 다시 코드를 보면서 공부하려고 작성한 코드를 컴퓨터 바탕화면에 아무 위치에나 저장해 둡니다. 저장한 코드가 많아지면서 머쓱이는 본인의 컴퓨터 바탕화면이 너무 지저분하다고 생각했습니다. 프로그래머스에서 작성했던 코드는 그 문제에 가서 다시 볼 수 있기 때문에 저장해 둔 파일들을 전부 삭제하기로 했습니다.

컴퓨터 바탕화면은 각 칸이 정사각형인 격자판입니다. 이때 컴퓨터 바탕화면의 상태를 나타낸 문자열 배열 wallpaper가 주어집니다. 파일들은 바탕화면의 격자칸에 위치하고 바탕화면의 격자점들은 바탕화면의 가장 왼쪽 위를 (0, 0)으로 시작해 (세로 좌표, 가로 좌표)로 표현합니다. 빈칸은 ".", 파일이 있는 칸은 "#"의 값을 가집니다. 드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있습니다. 머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며 드래그로 파일들을 선택하는 방법은 다음과 같습니다.
*/

class Solution {
    int gRow, gCol;
    int minRow, minCol;
    int maxRow, maxCol;
    char[][] gWallpaper;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int[] solution(String[] wallpaper) {
        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;

        gRow = wallpaper.length;
        gCol = wallpaper[0].length();
        gWallpaper = new char[gRow][gCol];

        int idx = 0;
        for (String str : wallpaper) {
            gWallpaper[idx] = str.toCharArray();
            idx++;
        }

        for (int r = 0; r < gRow; r++) {
            for (int c = 0; c < gCol; c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    dfs(r, c);
                }
            }
        }

        //max 값에 + 1을 하는 이유는 드래그를 하려면 끝점을 선택해야 함
        return new int[]{minRow, minCol, maxRow + 1, maxCol + 1};
    }

    private void dfs(int r, int c) {
        if (r < minRow) {
            minRow = r;
        }
        if (r > maxRow) {
            maxRow = r;
        }
        if (c < minCol) {
            minCol = c;
        }
        if (c > maxCol) {
            maxCol = c;
        }

        gWallpaper[r][c] = '!';

        for (int[] direction : directions) {
            int newR = r + direction[0];
            int newC = c + direction[1];

            if (newR < 0 || newR >= gRow || newC < 0 || newC >= gCol || gWallpaper[newR][newC] != '#')
                continue;

            dfs(newR, newC);
        }
    }
}