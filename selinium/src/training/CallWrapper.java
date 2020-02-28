package training;

public class CallWrapper {

	public static void main(String[] args) throws Exception {
		Wrappermethod w=new Wrappermethod();
		w.launchapp("https://in.linkedin.com/");
		w.clickbyxpath("/html/body/nav/a[3]");
		w.enterbyid("username", "karthikeyan");
		w.enterbyid("password", "hello");
		w.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		w.screenshot("C:\\Users\\BLTuser.BLT1221\\Desktop\\output\\webb");
		w.closeapp();
		

	}

}
