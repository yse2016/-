class Quizman{
	private int numAnswer = 8;

	public boolean judge(int userAnswer){
		if(userAnswer == this.numAnswer){
			return true;
		}else{
			return false;
		}
	}
}