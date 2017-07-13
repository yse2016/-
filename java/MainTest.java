public class MainTest{
      public static void main(String[] args){
        // InterfaceManインスタンスを、新規作成する
        InterfaceTestman im = new InterfaceTestman();
        // Quizmanインスタンスを、新規作成する
        Quizman qm = new Quizman();
    
        // InterfaceManに、メッセージを出力させて、回答を保存させる
        im.showMsgInput();
        // Quizmanインスタンスに、ユーザの回答を渡して、正解か判定させる
        int userAnswer = im.getUserAnswer();
        if(qm.judge(userAnswer)){
          // もし「正解」なら、InterfaceManに「あたり！」メッセージを出力させる
        	im.showMsgAtari();
        } else {
          // そうでなければ、InterfaceManに「ハズレ」メッセージを出力させる
          im.showMsgHazure();
        }
      }
    }