import java.util.Random;
import java.util.Scanner;
public class TicTacToe {


	public static void computer(char[] board){
		Random rand = new Random();
		System.out.println("Computers turn!");
		int r;
		r = 0;
		int count = 0;
		do{
			if(count > 100){
				r = rand.nextInt(9);
			}
			else if(board[0] =='O' && board[1] == 'O' && 'O' != board[2]  && r != 2){
				r = 2;
			}
			else if(board[0] =='O' && board[2] == 'O' && 'O' != board[1] && r != 1){
				r = 1;
			}
			else if(board[3] =='O' && board[2] == 'O' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//================================== finish belowVVVV
			else if(board[3] =='O' && board[4] == 'O' && 'O' != board[5] && r != 5){
				r = 5;
			}
			else if(board[3] =='O' && board[5] == 'O' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='O' && board[5] == 'O' && 'O' != board[3] && r != 3){
				r = 3;
			}
			//================================== finish belowVVVV
			else if(board[6] =='O' && board[7] == 'O' && 'O' != board[8] && r != 8){
				r = 8;
			}
			else if(board[6] =='O' && board[8] == 'O' && 'O' != board[7] && r != 7){
				r = 7;
			}
			else if(board[7] =='O' && board[8] == 'O' && 'O' != board[6] && r != 6){
				r = 6;
			}
			//================================== finish belowVVVV
			else if(board[0] =='O' && board[3] == 'O' && 'O' != board[6] && r != 6){
				r = 6;
			}
			else if(board[0] =='O' && board[6] == 'O' && 'O' != board[3]  && r != 3){
				r = 3;
			}
			else if(board[3] =='O' && board[6] == 'O' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//================================== finish belowVVVV
			else if(board[1] =='O' && board[4] == 'O' && 'O' != board[7] && r != 7){
				r = 7;
			}
			else if(board[1] =='O' && board[7] == 'O' && 'O' != board[4]  && r != 4){
				r = 4;
			}
			else if(board[4] =='O' && board[7] == 'O' && 'O' != board[1] && r != 1){
				r = 1;
			}
			//end
			else if(board[2] =='O' && board[5] == 'O' && 'O' != board[8] && r != 8){
				r = 8;
			}
			else if(board[2] =='O' && board[8] == 'O' && 'O' != board[5] && r != 5){
				r = 5;
			}
			else if(board[5] =='O' && board[8] == 'O' && 'O' != board[2] && r != 2){
				r = 2;
			}
			//end
			else if(board[0] =='O' && board[4] == 'O' && 'O' != board[8]  && r != 8){
				r = 8;
			}
			else if(board[0] =='O' && board[8] == 'O' && 'O' != board[4]  && r != 4){
				r = 4;
			}
			else if(board[4] =='O' && board[8] == 'O' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//end ==============================================================
			else if(board[2] =='O' && board[4] == 'O' && 'O' != board[6]  && r != 6){
				r = 6;
			}
			else if(board[2] =='O' && board[6] == 'O' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='O' && board[6] == 'O' && 'O' != board[2] && r != 2){
				r = 2;
			}
			//end=====================================================of winning code!!!=========================================
			else if(board[0] =='X' && board[1] == 'X' && 'O' != board[2] && r != 2){
				r = 2;
			}
			else if(board[0] =='X' && board[2] == 'X' && 'O' != board[1] && r != 1){
				r = 1;
			}
			else if(board[3] =='X' && board[2] == 'X' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//================================== finish belowVVVV
			else if(board[3] =='X' && board[4] == 'X' && 'O' != board[5] && r != 5){
				r = 5;
			}
			else if(board[3] =='X' && board[5] == 'X' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='X' && board[5] == 'X' && 'O' != board[3] && r != 3){
				r = 3;
			}
			//================================== finish belowVVVV
			else if(board[6] =='X' && board[7] == 'X' && 'O' != board[8] && r != 8){
				r = 8;
			}
			else if(board[6] =='X' && board[8] == 'X' && 'O' != board[7] && r != 7){
				r = 7;
			}
			else if(board[7] =='X' && board[8] == 'X' && 'O' != board[6]&& r != 6){
				r = 6;
			}
			//================================== finish belowVVVV
			else if(board[0] =='X' && board[3] == 'X' && 'O' != board[6] && r != 6){
				r = 6;
			}
			else if(board[0] =='X' && board[6] == 'X' && 'O' != board[3] && r != 3){
				r = 3;
			}
			else if(board[3] =='X' && board[6] == 'X' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//================================== finish belowVVVV
			else if(board[1] =='X' && board[4] == 'X' && 'O' != board[7] && r != 7){
				r = 7;
			}
			else if(board[1] =='X' && board[7] == 'X' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='X' && board[7] == 'X' && 'O' != board[1] && r != 1){
				r = 1;
			}
			//end
			else if(board[2] =='X' && board[5] == 'X' && 'O' != board[8] && r != 8){
				r = 8;
			}
			else if(board[2] =='X' && board[8] == 'X' && 'O' != board[5] && r != 4){
				r = 4;
			}
			else if(board[5] =='X' && board[8] == 'X' && 'O' != board[2] && r != 1){
				r = 1;
			}
			//end
			else if(board[0] =='X' && board[4] == 'X' && 'O' != board[8] && r != 8){
				r = 8;
			}
			else if(board[0] =='X' && board[8] == 'X' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='X' && board[8] == 'X' && 'O' != board[0] && r != 0){
				r = 0;
			}
			//end ==============================================================
			else if(board[2] =='X' && board[4] == 'X' && 'O' != board[6] && r != 6){
				r = 6;
			}
			else if(board[2] =='X' && board[6] == 'X' && 'O' != board[4] && r != 4){
				r = 4;
			}
			else if(board[4] =='X' && board[6] == 'X' && 'O' != board[2] && r != 2){
				r = 2;
			}
			//==================O===========================================================
			else{
				r = rand.nextInt(9);
			}
			count++;
		} while(board[r] != ' ');
		board[r] = 'O';
	}

	public static boolean gameoverX(char[] board){
		if(board[0]=='X' && board[1] == 'X' && board[2] == 'X') return true;
		if(board[0]== 'X' && board[3] == 'X' && board[6] == 'X') return true;
		if(board[1]=='X' && board[4] == 'X' && board[7] == 'X') return true;
		if(board[2]=='X' && board[5] == 'X' && board[8] == 'X') return true;
		if(board[3] == 'X' && board[4] == 'X' && board[5] == 'X') return true;
		if(board[6] == 'X' && board[7] == 'X' && board[8] == 'X') return true;
		if(board[0] == 'X' && board[4] == 'X' && board[8] == 'X') return true;
		if(board[2] == 'X' && board[4] == 'X' && board[6] == 'X') return true;
		return false;
	}

	public static boolean gameoverO(char[] board){
		if(board[0]=='O' && board[1] == 'O' && board[2] == 'O') return true;
		if(board[0]== 'O' && board[3] == 'O' && board[6] == 'O') return true;
		if(board[1]=='O' && board[4] == 'O' && board[7] == 'O') return true;
		if(board[2]=='O' && board[5] == 'O' && board[8] == 'O') return true;
		if(board[3] == 'O' && board[4] == 'O' && board[5] == 'O') return true;
		if(board[6] == 'O' && board[7] == 'O' && board[8] == 'O') return true;
		if(board[0] == 'O' && board[4] == 'O' && board[8] == 'O') return true;
		if(board[2] == 'O' && board[4] == 'O' && board[6] == 'O') return true;
		return false;
	}

	public static boolean isTie(char[] board){
		for(int i = 0 ; i<9; i++){
			if(board[i] == ' ') return false;
		}
		return true;
	}

	public static void printBoard(char[] board){

		System.out.println("           +             +            ");
		System.out.println("           +             +            ");
		System.out.println("    " + board[0] + "      +      " + board[1] + "      +       " + board[2] + "    ");
		System.out.println("           +             +            ");
		System.out.println("           +             +            ");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("           +             +            ");
		System.out.println("           +             +            ");
		System.out.println("     " + board[3] + "     +      " + board[4] + "      +      " + board[5] +"     ");
		System.out.println("           +             +            ");
		System.out.println("           +             +            ");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println("           +             +            ");
		System.out.println("           +             +            ");
		System.out.println("      " + board[6] + "    +     " + board[7] + "       +      " + board[8] + "    ");
		System.out.println("           +             +            ");
		System.out.println("           +             +            ");

	}


	public static void main(String[] args){
		boolean next;
		next = true;
		while (next == true){

			Scanner input = new Scanner(System.in);
			int a;			
			String m;
			String yon;
			char[] board = new char[9];
			for (int i = 0; i <9; i++) board[i]= ' ';

			Random rand = new Random();
			System.out.println("Do you want to play multiplayer or sigleplayer!");
			m = input.nextLine();
			if (m.equals("multiplayer")){
				System.out.println("Welcome to TicTacToe!");
				System.out.println("Player one goes first");
				printBoard(board);



				while(!gameoverX(board) && !gameoverO(board) && !isTie(board)){
					do{
						System.out.println("[player1]What place do you want to put your thing? (1-9 please!!)");
						a = input.nextInt();
						a = a - 1;
						if (board[a] != ' '){
							System.out.println("That space is taken up!!!!!!!!!! (bad job with counting!!!!!)");
						}
						if (a>9 || a <0){
							System.out.println("Error: Not vaild number!");
							continue;
						}
					}while(a >9 || a <0 || board[a] != ' ');
					board[a] = 'X';
					if(gameoverX(board) || isTie(board)) break;
					printBoard(board);
					do{
						System.out.println("[player2]What place do you want to put your thing? (1-9 please!!)");
						a = input.nextInt();
						a = a - 1;
						if (a>9 || a <0){
							System.out.println("Error: Not vaild number!");
							continue;
						}
						if (board[a] != ' '){
							System.out.println("That space is taken up!!!!!!!!!! (bad job with counting!!!!!)");
						}
					}while(a >9 || a<0 || board[a] != ' ');
					board[a] = 'O';
					if(gameoverO(board) || isTie(board)) break;
					printBoard(board);
				}

				printBoard(board);
				if(gameoverX(board)){
					System.out.println("Player 1 Wins!!!");
				}
				else if(gameoverO(board)){
					System.out.println("Player 2 Wins!!!");
				}
				else{
					System.out.println("Its a tie!!!");
				}

				//rand.nextInt(10);
			}//end of if
			else{
				System.out.println("Welcome to TicTacToe!");
				System.out.println("You go first!");
				printBoard(board);



				while(!gameoverX(board) && !gameoverO(board) && !isTie(board)){
					do{
						System.out.println("What place do you want to put your thing? (1-9 please!!)");
						a = input.nextInt();
						a = a - 1;
						if (a>9 || a <0){
							System.out.println("Error: Not vaild number!");
							continue;
						}
						if (board[a] != ' '){
							System.out.println("That space is taken up!!!!!!!!!! (bad job with counting!!!!!)");
						}

					}while(a >9 || a<0 || board[a] != ' ');
					board[a] = 'X';
					if(gameoverX(board) || isTie(board)) break;
					computer(board);
					if(gameoverO(board) || isTie(board)) break;
					printBoard(board);
				}

				printBoard(board);
				if(gameoverX(board)){
					System.out.println("You Win!!!");
				}
				else if(gameoverO(board)){
					System.out.println("You Lose!!!");
				}
				else{
					System.out.println("It's a tie!!!");
				}

				//rand.nextInt(10);
			}//end of else
			System.out.println("Do you want to play agin?");
			yon = input.nextLine();
			yon = input.nextLine();
			
			
				if(yon.equals("yes")){
					
				}
				else{
					System.out.println("Game Stoped!");
					System.out.println("Thanks for playing!");
					next = false;
				}

			//end of else
			
				
			
			
		
	}//end of while
}//end of main
}//end of all



