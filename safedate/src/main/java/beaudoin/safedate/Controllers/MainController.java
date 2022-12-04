package beaudoin.safedate.Controllers;

import java.util.List;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.Header;

import beaudoin.safedate.Models.MessageModel;
import beaudoin.safedate.Services.MessageService;

/**
 * @Author: Danny Beaudoin
 * @Date: 06-11-2022
 */
@RestController(value = "api/home")
public class MainController {
    
}
