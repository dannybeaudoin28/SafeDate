package beaudoin.safedate.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Danny Beaudoin
 * @Date: 06-11-2022
 */
@Controller
public class MainController {

    /**
     * 
     * @return a ResponseEntity that contains a list of all messages to the 
     *         client.
     */
    @GetMapping("viewAllMessages")
    public ResponseEntity<?> getAllyMessages() {

        return new ResponseEntity<>(null);
    }
}
