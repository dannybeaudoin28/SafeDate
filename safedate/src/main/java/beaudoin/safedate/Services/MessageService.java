package beaudoin.safedate.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import beaudoin.safedate.Models.MessageModel;
import beaudoin.safedate.Repositories.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public ResponseEntity<?> getAllMessages() {
        return new ResponseEntity<>((messageRepository.findAll()), HttpStatus.OK);
    }
    
}
