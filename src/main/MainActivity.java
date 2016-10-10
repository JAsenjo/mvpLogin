package main;

import java.util.List;

import com.example.mvp_login.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends Activity implements OnItemClickListener,IMainView {

	 private ListView listView;
	 private ProgressBar progressBar;
	private IMainPresenter presenter;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView=(ListView) findViewById(R.id.listView1);
		listView.setOnItemClickListener(this);
		progressBar=(ProgressBar) findViewById(R.id.progressBar1);
		presenter=new MainPresenterImpl(this);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		presenter.onResume();
		super.onResume();
	}

	@Override
	protected void onDestroy() {
		presenter.onDestroy();
		super.onDestroy();
	}


	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		presenter.onItemClicked(position);
		
	}

	@Override
	public void showProgress() {
		progressBar.setVisibility(View.VISIBLE);
		listView.setVisibility(View.INVISIBLE);
	}

	@Override
	public void hideProgress() {
		progressBar.setVisibility(View.GONE);
		listView.setVisibility(View.VISIBLE);
	}

	@Override
	public void setItems(List<String> items) {
	 listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));

		
	}

	@Override
	public void showMessage(String message) {
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
		
	}

	
}
