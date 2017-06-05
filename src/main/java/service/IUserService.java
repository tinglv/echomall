package service;

import common.ServerResponse;

/**
 * Created by tlv on 5/31/2017.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);


}
