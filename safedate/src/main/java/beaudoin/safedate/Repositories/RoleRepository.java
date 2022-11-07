package beaudoin.safedate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import beaudoin.safedate.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByName(String name);
}
