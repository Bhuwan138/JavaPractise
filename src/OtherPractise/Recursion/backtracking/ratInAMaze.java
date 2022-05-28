package OtherPractise.Recursion.backtracking;

public class ratInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        RatMaxe ratMaxe = new RatMaxe();
        int n = maze.length;
        ratMaxe.solveMaze(maze,n);
    }
}

class RatMaxe{
    public void solveMaze(int[][] maze, int length){
        int[][]solution = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                solution[i][j] =0;
            }
        }
        mazeHelp(maze,length,solution,0,0);
    }

    private void mazeHelp(int[][] maze, int length, int[][] solution, int x, int y) {

        if(x == length-1 && y == length-1)
        {
            solution[x][y] = 1;
            printMaze(solution,length);
            return;
        }

        if(x>=length || x<0 || y>= length || y<0 || maze[x][y] == 0 || solution[x][y] == 1){
            return;
        }

        solution[x][y] = 1;
        mazeHelp(maze,length,solution,x-1,y);
        mazeHelp(maze,length,solution,x+1,y);
        mazeHelp(maze,length,solution,x,y-1);
        mazeHelp(maze,length,solution,x,y+1);
        solution[x][y] = 0;
    }

    private void printMaze(int[][] solution, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(solution[i][j] + " ");
            }
        }
        System.out.println();
    }


}
