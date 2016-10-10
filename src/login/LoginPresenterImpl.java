package login;

public class LoginPresenterImpl implements ILoginPresenter,ILoginInteractor.OnLoginFinishedListener {

	private ILoginView view;
	private ILoginInteractor interactor;
	
	public LoginPresenterImpl(ILoginView view, ILoginInteractor interactor) {
		this.view = view;
		this.interactor = interactor;
	}

	@Override
	public void validateLogin(String username, String password) {
		if(view!=null){
			view.showProgress();		
		}
		
	}

	@Override
	public void onDestroy() {
		view=null;
		
	}

	@Override
	public void onUsernameError() {
		if(view!=null){
			view.hideProgress();
			view.errorUsername();
		}
		
	}

	@Override
	public void onPasswordError() {
		if(view!=null){
			view.hideProgress();
			view.errorPassword();
		}
		
	}

	@Override
	public void onSuccess() {
		if(view!=null){
			view.login();
		}
		
	}
	
	
	
	
	
	
	
	
}
