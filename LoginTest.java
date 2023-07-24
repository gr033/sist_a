class LoginTest{
	public boolean isMember(String id, String pwd){
		if(id.equals("hyeonju") && pwd.equals("Hello")){
			return true;
		}else{
			return false;
		}
	}
}