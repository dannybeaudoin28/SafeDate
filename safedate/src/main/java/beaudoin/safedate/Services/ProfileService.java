package beaudoin.safedate.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import beaudoin.safedate.Models.ProfileModel;
import beaudoin.safedate.Repositories.ProfileRepository;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public ResponseEntity<?> getAllProfiles() {
        return new ResponseEntity<>((profileRepository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<?> getProfile(Integer profileId) {
        return new ResponseEntity<>((profileRepository.getProfile(profileId)), HttpStatus.OK);
    }

    public ResponseEntity<?> saveProfile(ProfileModel profile) {
        return new ResponseEntity<>(( profileRepository.save(profile)), HttpStatus.OK);
    }

    public ResponseEntity<?> deleteImage(Integer profileId) {
        return new ResponseEntity<>((profileRepository.deleteImage(profileId)), HttpStatus.OK);
    }
    
}
