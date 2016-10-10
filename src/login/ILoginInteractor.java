package login;

public interface ILoginInteractor {

	  interface OnLoginFinishedListener {
	        void onUsernameError();

	        void onPasswordError();

	        void onSuccess();
	    }

	    void login(String username, String password, OnLoginFinishedListener listener);

	}
	
	

