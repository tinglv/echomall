package service.impl;

import common.ServerResponse;
import service.IUserService;

/**
 * Created by tlv on 5/31/2017.
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper useMapper;

    @Overide
    public ServerResponse<User> login(String username, String password){
        int resultCount = useMapper.checkUsername(username);
        if(resultCount == 0){
            return ServerResponse.creatByErrorMessage("用户不存在");
        }

        //todo password MD5

        User user = useMapper.selectLogin(username,password);
        if()

        return null;
    }


}
