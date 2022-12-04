package beaudoin.safedate.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import beaudoin.safedate.Models.ProfileModel;
import beaudoin.safedate.Services.ProfileService;


/**
 * @Author: Danny Beaudoin
 * @Date: 08-11-2022
 */
@RestController(value = "/api/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/viewAllProfiles")
    public ResponseEntity<?> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @GetMapping("/viewProfile")
    public ResponseEntity<?> getProfile(Integer profileId) {
        return profileService.getProfile(profileId);
    }

    @PostMapping("/deleteImage")
    public ResponseEntity<?> deleteImage(Integer profileId) {
        return profileService.deleteImage(profileId);
    }

    @PostMapping("/saveProfile")
    public ResponseEntity<?> saveProfile(ProfileModel profile) {
        return profileService.saveProfile(profile);
    }
}
