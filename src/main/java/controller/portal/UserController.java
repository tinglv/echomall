package controller.portal;

import common.Const;
import common.ServerResponse;

/**
 * Created by tlv on 5/31/2017.
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    /**
     * login
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequstMapping(value = "login.do", RequestMethod = "POST")
    @ResponseBody
    public ServerResponse<User> login(String username , String password , HttpSession session){

        return null;
    }

    @RequstMapping(value = "logout.do", RequestMethod = "GET")
    @ResponseBody
    public ServerResponse<String> login(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.creatBySuccess();
    }

}
