package beaudoin.safedate.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import beaudoin.safedate.Models.MessageModel;
import beaudoin.safedate.Repositories.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public ResponseEntity<?> getAllMessages() {
        return new ResponseEntity<>((messageRepository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<?> searchMessages(String searchCriteria) {
        return new ResponseEntity<>((messageRepository.searchMessages(searchCriteria)), HttpStatus.OK);
    }

    public ResponseEntity<?> searchMessagesById(Integer msgId) {
        return new ResponseEntity<>((messageRepository.searchMessagesById(msgId)), HttpStatus.OK);
    }

    public ResponseEntity<?> sendMessage(Integer sendFrom, Integer sendTo, String msgBody) {
        String msgHead = msgBody.substring(0, 10);

        MessageModel msgModel = new MessageModel();
        msgModel.setMessageBody(msgBody);
        msgModel.setMessageHeader(msgHead);
        msgModel.setSentFrom(sendFrom);
        msgModel.setSentTo(sendTo);
        msgModel.setSentDate(new Date());

        return new ResponseEntity<>((messageRepository.save(msgModel)), HttpStatus.OK);
    }
    
}
