package beaudoin.safedate.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import beaudoin.safedate.Models.MessageModel;
import beaudoin.safedate.Services.MessageService;

/**
 * @Author: Danny Beaudoin
 * @Date: 06-11-2022
 */
@RestController
public class MainController {
    @Autowired
    private MessageService messageService;

    /**
     * 
     * @return a ResponseEntity that contains a list of all messages to the 
     *         client.
     */
    @GetMapping("viewAllMessages")
    public ResponseEntity<?> getAllyMessages() {
        return messageService.getAllMessages();
    }
}
