class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    if(!set.contains(board[i][j])){
                        set.add(board[i][j]);
                    }else{
                        return false;
                    }
                }
            }
        }
        for(int i=0; i<9; i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i]!='.'){
                    if(!set.contains(board[j][i])){
                        set.add(board[j][i]);
                    }else{
                        return false;
                    }
                }
            }
        }
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                HashSet<Character> set=new HashSet<>();
                for(int r=i; r<i+3; r++){
                    for(int c=j; c<j+3; c++){
                        if(board[r][c]!='.'){
                            if(!set.contains(board[r][c])){
                                set.add(board[r][c]);
                            }else{
                                return false;
                            }
                        }
                        
                    }
                }
            }
        }
        return true;
    }
}