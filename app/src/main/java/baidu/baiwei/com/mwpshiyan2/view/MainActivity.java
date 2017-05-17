package baidu.baiwei.com.mwpshiyan2.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import baidu.baiwei.com.mwpshiyan2.R;
import baidu.baiwei.com.mwpshiyan2.bean.User;
import baidu.baiwei.com.mwpshiyan2.presener.presenerP;

public class MainActivity extends AppCompatActivity implements userView, View.OnClickListener {

    private EditText ed_password;
    private EditText ed_username;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_password = (EditText) findViewById(R.id.ed_password);
        ed_username = (EditText) findViewById(R.id.ed_username);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);

    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFinde(Boolean error) {
        Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        String username = ed_username.getText().toString().trim();
        String password = ed_password.getText().toString().trim();
        if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
            Toast.makeText(this, "账号密码为空", Toast.LENGTH_SHORT).show();
        }
        User user=new User(username,password);
        presenerP presenter=new presenerP(this);
        presenter.login(user);

    }
}

