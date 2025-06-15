
import java.util.Scanner;

//TICTACTOE

class play_board{
    String[][] board=new String[3][3];
    int check=0;
    Scanner sc=new Scanner(System.in);
    public void disp_board(){
        System.out.println("The board now is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("| "+board[i][j]+" |");
            }
            System.out.println();
        }

    }

    public void user_play(String sym){
        System.out.print("Enter your position (in usual array indexing method): ");
        String pos=sc.next();
        int row=(int) pos.charAt(0)-48;
        int col=(int) pos.charAt(1)-48;
        if (board[row][col]==null) board[row][col]=sym;
        else{
            System.out.println("INVALID POSITION, TRY AGAIN!!!");
            user_play(sym);
            }
    }
    
    public int board_check(){
        //row check
        for(int i=0;i<3;i++){
            if(board[i][0] != null &&board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])){
                System.out.println(board[i][0]+" HAS WON THE GAME!");
                check=1;
                return check;
            }
        }
        //col check
        for(int i=0;i<3;i++){
            if(board[0][i] != null &&board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])){
                System.out.println(board[0][i]+" HAS WON THE GAME!");
                check=1;
                return check;
            }
        }
        //dia check
        if(board[0][0] != null &&board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])){
            System.out.println(board[0][0]+" HAS WON THE GAME!");
            check=1;
            return check;
        }
        if(board[2][0] != null && board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2])){
            System.out.println(board[2][0]+" HAS WON THE GAME!");
            check=1;
            return check;
        }
        return check;
    }

    public void control(){
        while (true){
        disp_board();
        System.out.print("Enter your choice of symbol -- O or X: ");
        //play1
        String sym1=sc.next();
        user_play(sym1);
        disp_board();
        String sym2=(sym1.equals("O"))?"X":"O";
        user_play(sym2);
        disp_board();
        //play2
        user_play(sym1);
        disp_board();
        user_play(sym2);
        disp_board();
        //play3
        user_play(sym1);
        disp_board();
        if (board_check()==1){ break;}
        user_play(sym2);
        disp_board();
        //compare occurs always
        if (board_check()==1){ break;}
        //play4
        user_play(sym1);
        disp_board();
        if (board_check()==1){ break;}
        user_play(sym2);
        disp_board();
        //compare occurs always
        if (board_check()==1){ break;}
        user_play(sym1);
        disp_board();
        if (board_check()==1){ break;}
        System.out.println("THE GAME HAS TIED!!!");
        break;
        }
    }
    
}

class tictactoe{
    public static void main(String[] args) {
        play_board b0=new play_board();
        b0.control();

    }
}
