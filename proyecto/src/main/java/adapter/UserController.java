package adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.User;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public void addUser(@Notblank @NotNull User user)
    {
        userService.addUser()
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @GetMapping(path="{id}")
    public User getUserById(@PathVariable("id") User_Id id){
        return userService.getUserById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") User_Id id){
        userService.deleteUser(id);
    } 
    
    public void updateUser(asdfadf, asdfasdf, asdfasdf){
        userService.updateUser(id, User)
    }
}
