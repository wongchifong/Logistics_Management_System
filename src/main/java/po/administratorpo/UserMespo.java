package po.administratorpo;

public class UserMespo {
	int id;
	String name;
	String password;
	String role;//这里的role考虑用UserRole类型
	public UserMespo(int i,String n,String p,String r){
		id=i;
		name=n;
		password=p;
		role=r;
	}
	public String getName(){
		return name;
		
	}
	public int getID(){
		return id;
		
	}
	public String getPassword(){
		return password;
		
	}
	public String getRole(){
		return role;
		
	}
}
