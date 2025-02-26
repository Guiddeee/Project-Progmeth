package resourceUtil;

public class getImage {
	public static String getPlayerImg() {
		return "res/player.png" ;
	}
	
	public static String getSubjectImg(SubjectType t) {
		String res="";
		if(t == SubjectType.COMPROG) {
			res="/resourceImage/comProg.png";
		}
		//else if
		/////////////
		return res;
		
	}
}
