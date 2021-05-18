
public class Audience {

	private String name;
	private Integer id;
	private String friends;
	private Integer friendId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friends) {
		this.friends = friends;
	}
	public Integer getFriendId() {
		return friendId;
	}
	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}
	
	public Audience(String name,Integer id,String friends, Integer friendId){
		this.name = name;
		this.id = id;
		this.friends = friends;
		this.friendId = friendId;
	}
	

}
