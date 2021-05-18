import java.util.ArrayList;

public class Validator {

	public boolean validName(String name) {
		Integer len = name.length();
		return len.intValue() >= 2 && len.intValue() <= 20;
	}
	public boolean validFriends(String friends) {
		return (friends.contentEquals("yes")||friends.contentEquals("no"));
	}
	public boolean validId(Integer id) {
		return id != null && id.intValue()>9999 && id.intValue()<100000;
	}
	public boolean existId(Integer id,ArrayList<Audience> audiences) {
		for (Audience audience : audiences) {
			if(audience.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
}
