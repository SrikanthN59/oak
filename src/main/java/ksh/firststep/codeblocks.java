package ksh.firststep;

public class codeblocks {
	public static void main(String[] args){
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

	if(gameOver){
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Your final score was " + finalScore);

}

	boolean newGameOver = true;
		int newScore = 1000;
		int newLevelCompleted = 8;
		int newBonus = 200;

	if(newGameOver){
		int finalScore = newScore + (newLevelCompleted * newBonus);
		System.out.println("Your final score was " + finalScore);

}



	
}
}