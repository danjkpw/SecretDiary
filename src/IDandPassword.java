import java.util.HashMap;

public class IDandPassword {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPassword(){
		logininfo.put("User123","Password123");
		logininfo.put("Siit123","Thammasat123");
		logininfo.put("Danny123","Jakrapat123");
		logininfo.put("123","123");
		logininfo.put(" "," ");
		logininfo.put("This is Username","This is password");
	}
	//Protected method
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
