public class snakeAndLadder{
	
	public static final int ladder = 0;
	public static final int snake = 1;
	
	public static void main(String[] args) {
		
		int turnCount1 = 0;
		int turnCount2 = 0;
		int player = 0;
		
		System.out.println("Start position for player 1 and Player 2 is 0");
		
		while(player<2){
			int position = 0;
			while(position!=100) {
				int repeat = 1; //to consider the repeatition of ladder case as one turn.
				while(repeat == 1){
					int dieNumber = ((int) Math.floor(Math.random()*10) % 6) + 1;
					int playOption = (int) Math.floor(Math.random()*10) % 3;
					switch(playOption) {
					case snake:
						repeat = 0;
						position = position - dieNumber;
						if(position<0)
							position = 0;
						break;
					case ladder:
						position = position + dieNumber;
						if(position>100)
							position = position - dieNumber;
						break;
					default :
						repeat = 0;
						position = position + 0;
					}
				}
				if(player == 0)
					turnCount1 += 1;
				else		
					turnCount2 += 1;
			}
			player++;
		}
		System.out.println("The no of turns for player1 to reach 100 is " + turnCount1);
		System.out.println("The no of turns for player2 to reach 100 is " + turnCount2);
		if(turnCount1<turnCount2)
			System.out.println("The Winner is Player 1");
		else
			System.out.println("The Winner is Player 2");
	}
}