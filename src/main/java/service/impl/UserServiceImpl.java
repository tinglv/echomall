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
        int response = useMapper.checkUsername(username);

        return null;
    }


}
