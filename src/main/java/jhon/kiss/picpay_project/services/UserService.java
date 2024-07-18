package jhon.kiss.picpay_project.services;

import jdk.javadoc.doclet.Reporter;
import jhon.kiss.picpay_project.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import jhon.kiss.picpay_project.domain.user.User;
import jhon.kiss.picpay_project.domain.user.UserDTO;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    private void saveUser(User user){
        this.repository.save(user);
    }

    public User createUser(UserDTO user){
        User newUser = new User(user);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

}
