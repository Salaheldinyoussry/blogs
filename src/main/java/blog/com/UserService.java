package blog.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void save(User user){
        userRepository.save(user);
    }

    public User getUser(String username){
        return userRepository.findByUsername(username);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
