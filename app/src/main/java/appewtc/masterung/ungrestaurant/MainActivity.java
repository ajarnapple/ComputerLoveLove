package appewtc.masterung.ungrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString, passwordString;
    private MyManage myManage;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget การผูก
        bindWidget();

        //Request Database
        myManage = new MyManage(this);



        //Button Controller ทำปุ่มให้ทำงาน
        buttonController();

        //Tester Add Value
        tester();

    }   //Main Method นี่คือ Method หลัก Method ห่อหุ่ม Statement

    private void tester() {
        myManage.addValueToSQLite("user", "pass", "name");
        myManage.addQuestion("คำถาม", "ก", "ข", "ค", "ง", "1");

    }

    private void buttonController() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Receive Value from Edit Text
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                // Check Space
                if (userString.equals("") || passwordString.equals("") ) {
                    // Have Space
                    MyAlertDialog myAlertDialog = new MyAlertDialog();
                    myAlertDialog.myDialog(MainActivity.this, "มีช่องว่าง", "กรุณากรอกทุกช่องคะ");

                } else {

                    //No Space
                }


            } //onClick
        });

    }   //buttonContraoller

    private void bindWidget() {


        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);

    }
} //Main Class นี่ คือ class หลัก
