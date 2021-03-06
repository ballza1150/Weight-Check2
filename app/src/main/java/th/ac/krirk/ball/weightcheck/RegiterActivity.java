package th.ac.krirk.ball.weightcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegiterActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passwordEditText, nameEditText;
    private String userString, passwordString, nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiter);

        // Bind Widget
        bindWidget();

    } // main method

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        nameEditText = (EditText) findViewById(R.id.editText3);
    }

    public void clickRegis(View view) {

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();

        if (userString.equals("") || passwordString.equals("") || nameString.equals("")) {

            // Have Space
            Toast.makeText(RegiterActivity.this, getResources().getString(R.string.have_space),
                    Toast.LENGTH_SHORT).show();

        } else {

            // No Space
            MyManage objMyManage = new MyManage(this);
            objMyManage.addUsertable(userString, passwordString, nameString);
            Toast.makeText(RegiterActivity.this,
                    getResources().getString(R.string.success_rigis),
                    Toast.LENGTH_SHORT).show();
            finish();

        } // if

    }// clickRegis

} // main class
