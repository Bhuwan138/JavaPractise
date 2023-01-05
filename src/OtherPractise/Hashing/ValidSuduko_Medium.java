package OtherPractise.Hashing;

import java.util.HashSet;
import java.util.Set;

/*
* https://leetcode.com/problems/valid-sudoku/
* 36. Valid Sudoku
* */
public class ValidSuduko_Medium {
    public static void main(String[] args) {
        String[][] board = {{"8","3",".",".","7",".",".",".","."}
                            ,{"6",".",".","1","9","5",".",".","."}
                            ,{".","9","8",".",".",".",".","6","."}
                            ,{"8",".",".",".","6",".",".",".","3"}
                            ,{"4",".",".","8",".","3",".",".","1"}
                            ,{"7",".",".",".","2",".",".",".","6"}
                            ,{".","6",".",".",".",".","2","8","."}
                            ,{".",".",".","4","1","9",".",".","5"}
                            ,{".",".",".",".","8",".",".","7","9"}};
        char[][] charBoard = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                charBoard[i][j] = board[i][j].charAt(0);
            }
        }
        System.out.println(isValidSudoku(charBoard));

    }

    static public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    //validating for row
                    if(!set.add("row" + i + board[i][j])) return false;
                    //validating for col
                    if(!set.add("col" + j + board[i][j])) return false;
                    //validating for innerBox
                    if(!set.add("insideBox" + ((i / 3) * 3 + (j / 3)) + board[i][j])) return false;
                }
            }
        }
        return true;
    }
}
