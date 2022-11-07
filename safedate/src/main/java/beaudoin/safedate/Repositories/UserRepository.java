package beaudoin.safedate.Repositories;

import java.util.Optional;

import org.apache.catalina.mbeans.UserMBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beaudoin.safedate.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUsername(String username);
}
