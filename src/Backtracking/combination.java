package Backtracking;

public class combination {



    public static void main(String[] args) {
        int n = 4;
        int tq = 2;// total queen
        boolean[] board = new boolean[n];
        Printanswer(board, tq, 0, "",0);

    }

    public static void Printanswer(boolean[] board, int tq, int qpsf, String ans,int last) {

        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = last; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Printanswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
                board[i]=false;

            }
        }

    }

}
