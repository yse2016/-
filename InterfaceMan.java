class InterfaceMan{
	private String msgInput = "数を入力してください＞";
	private String msgAtari = "あたり";
	private String msgHazure = "はずれ";
	private int userAnswer;

	public void showMsgInput(){
	System.out.println(this.msgInput);
	this.userAnswer = new java.util.Scanner(System.in).nextInt();
	}
	public int getUserAnswer(){
		return this.userAnswer;
	}
	public void showMsgAtari(){
		System.out.println(this.msgAtari);
	}
	public void showMsgHazure(){
		System.out.println(this.msgHazure);
	}
}