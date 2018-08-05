package swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.entity.User;
import swagger.model.UserModelGet;
import swagger.model.UserModelGetInner;
import swagger.model.UserModelPut;
import swagger.service.repository.UserRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(UserModelPut userModel)
    {
        User user = new User();
        user.setUserName(userModel.getUserName());

        userRepository.save(user);
    }

    public UserModelGet findAllUsers()
    {
        UserModelGet userModelGet = new UserModelGet();
        for(User user:userRepository.findAll())
        {
            UserModelGetInner userModel = new UserModelGetInner();
            userModel.setUserName(user.getUserName());
            userModelGet.add(userModel);
        }

        return userModelGet;
    }
}
