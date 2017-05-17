package baidu.baiwei.com.mwpshiyan2.presener;

import baidu.baiwei.com.mwpshiyan2.bean.User;
import baidu.baiwei.com.mwpshiyan2.molde.UserMolde;
import baidu.baiwei.com.mwpshiyan2.view.userView;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class presenerP {
    private final UserMolde userMolde;
    private final userView userView;
    public presenerP(userView userView){
        this.userView = userView;
        this.userMolde=new UserMolde();
    }

    public void login(User user){

        boolean login = userMolde.login(user);
        if(login==true){
            userView.onLoginSuccess();
        }else {
            userView.onLoginFinde(login);
        }
    }


}
