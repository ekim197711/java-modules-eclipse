package dk.otherorg.api;

import dk.myorg.secret.stuff.SecretUtil;
import dk.myorg.util.MyUtil1;

public class MyApiClass {
	public static void main(String[] args) {
		new MyUtil1().saySomething();
		new SecretUtil().tellSecret();
	}
}
