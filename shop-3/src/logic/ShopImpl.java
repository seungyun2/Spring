package logic;

public class ShopImpl implements Shop {
	
	private UserCatalog userCatalog;
	
	public void setuserCatalog(UserCatalog userCatalog){
		this.userCatalog = userCatalog;
	}

	public User getUserByUserIdAndPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return this.userCatalog.getUserByUserIdAndPassword(userId, password);
	}

}
