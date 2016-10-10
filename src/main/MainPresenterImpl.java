package main;

import java.util.List;

public class MainPresenterImpl implements IMainPresenter,IMainInteractor.OnFinishedListener {

	private IMainView view;
	private IMainInteractor interactor;
	
	
	
	
	public MainPresenterImpl(IMainView view) {
		this.view = view;
		this.interactor = new MainInteractorImpl();
	}
	
	
	@Override
	public void onResume() {
		  if (view != null) {
	           view.showProgress();
	        }

	        interactor.findItems(this);
		
	}
	@Override
	public void onItemClicked(int position) {
		  if (view != null) {
	            view.showProgress();
	        }

		  view.showMessage("Click en " + String.valueOf(position));
	}
	@Override
	public void onDestroy() {
		view=null;
		
	}


	@Override
	public void onFinished(List<String> items) {
		if (view != null) {
            view.setItems(items);
            view.hideProgress();
        }
		
	}
	
	
	
	
}
