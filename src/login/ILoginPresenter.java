package login;

public interface ILoginPresenter {

	void validateLogin(String username,String password);
	
	void onDestroy();
	
}
