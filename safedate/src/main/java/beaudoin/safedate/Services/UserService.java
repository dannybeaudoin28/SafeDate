package beaudoin.safedate.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import beaudoin.safedate.Models.Role;
import beaudoin.safedate.Models.User;

@Service
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
