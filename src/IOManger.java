
public  class IOManger {
	static int currentuserId=0;
	static int countShapeOfCurrentUser=0;
	
	public static int getCountShapeOfCurrentUser() {
		return countShapeOfCurrentUser;
	}

	public static void setCountShapeOfCurrentUser(int countShapeOfCurrentUser) {
		IOManger.countShapeOfCurrentUser = countShapeOfCurrentUser;
	}

	public static int getCurrentuserId() {
		return currentuserId;
	}

	public static void setCurrentuserId(int currentuserId) {
		IOManger.currentuserId = currentuserId;
	}

}
