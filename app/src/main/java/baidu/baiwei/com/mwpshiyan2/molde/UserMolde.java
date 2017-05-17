package baidu.baiwei.com.mwpshiyan2.molde;

import baidu.baiwei.com.mwpshiyan2.bean.User;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class UserMolde implements IuserMolde{
    @Override
    public boolean login(User user) {

        if("100".equals(user.getName())&&"222".equals(user.getPassword())){
            return true;
        }else {
            return false;
        }




    }
}
