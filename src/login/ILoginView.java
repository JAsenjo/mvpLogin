package login;

public interface ILoginView {

	void showProgress();
	void hideProgress();
	void errorUsername();
	void errorPassword();
	void login();
}
