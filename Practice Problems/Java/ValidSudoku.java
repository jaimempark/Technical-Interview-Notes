//https://leetcode.com/problems/valid-sudoku/submissions/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 1. Iterate through the rows (n^2)
        // 2. Keep track of the columns
        // Toolsets: HashMaps, Arrays, Trees, Queue, stack, Hashset
        HashSet<Character> track = new HashSet<>();
        //Row
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(Character.isDigit(board[i][j])){
                    if(track.contains(board[i][j])){
                        return false;
                    } else {
                       track.add(board[i][j]);
                    }
                }
            }
            track.clear();
        }
                
        //Column
        for(int i=0; i<board[0].length; i++ ){
            for (int j=0; j<board.length; j++){
                if(Character.isDigit(board[j][i])){
                    if(track.contains(board[j][i])){
                        return false;
                    } else {
                       track.add(board[j][i]);
                    }
                }
            }
            track.clear();
        }
                
        //The box
        for(int i=0; i<board.length; i+=3){
            for(int j=0; j<board[i].length; j+=3){
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        if(Character.isDigit(board[k][l])){
                            if(track.contains(board[k][l])){
                                return false;
                            } else {
                               track.add(board[k][l]);
                            }
                        }
                    }
                }
                track.clear();
            }
        }
        
        return true;
    }
}