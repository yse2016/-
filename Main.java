public class Main{
	public static void main(String[] args) {
		InterfaceMan im = new InterfaceMan();
		Quizman qm = new Quizman();

		im.showMsgInput();
        int userAnswer = im.getuserAnswer();

		if(qm.judde(userAnswer)){
			im.showMsgAtari();
		}else{
			im.showMsgHazure();;
		}
	}
}