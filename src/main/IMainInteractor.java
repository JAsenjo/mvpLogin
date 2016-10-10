package main;

import java.util.List;

public interface IMainInteractor {


    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
	
}
