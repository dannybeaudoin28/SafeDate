package beaudoin.safedate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import beaudoin.safedate.Models.ProfileModel;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileModel, Integer>{
    @Query(value = "SELECT * FROM PROFILE_TABLE WHERE ID = ?", nativeQuery = true)
    ProfileModel getProfile(Integer profileId);

    @Query(value = "INSERT INTO PROFILE_TABLE(PROFILE_PICTURE) VALUES ('') WHERE ID = ?1", nativeQuery = true)
    ProfileModel deleteImage(Integer profileId);
}
