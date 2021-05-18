
public class Validator {

	public boolean validType(String type) {
		return (type.contentEquals("hare")||type.contentEquals("turtle"));
	}
	
	public boolean validName(String name) {
		Integer len = name.length();
		return len>=5 && len<=15;
	}

}
