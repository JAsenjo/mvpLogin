package main;

import java.util.List;

import android.widget.ListView;

public interface IMainView {

	void showProgress();
	void hideProgress();
	
	void setItems(List<String> items);
	void showMessage(String message);
	
	
	
}
