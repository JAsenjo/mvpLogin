package login;

import com.example.mvp_login.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;



public class LoginActivity extends Activity implements ILoginView, OnClickListener {

	private EditText etUsername,etPassword;
	private Button btn;
	private ProgressBar progressBar;
	private ILoginPresenter presenter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        etUsername=(EditText) findViewById(R.id.editText1);
        etPassword=(EditText) findViewById(R.id.EditText2);
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(this);
        progressBar=(ProgressBar) findViewById(R.id.progressBar1);
        
    }


	@Override
	public void showProgress() {
		progressBar.setVisibility(View.VISIBLE);
	}


	@Override
	public void hideProgress() {
		progressBar.setVisibility(View.GONE);
		
	}


	@Override
	public void errorUsername() {
		etUsername.setError("error");
		
	}


	@Override
	public void errorPassword() {
		etPassword.setError("error");
		
	}


	@Override
	public void login() {
	//	 startActivity(new Intent(this, MainActivity.class));
	//      finish();		
	}


	@Override
	public void onClick(View v) {
        presenter.validateLogin(etUsername.getText().toString(), etPassword.getText().toString());
		
	}


   
}
