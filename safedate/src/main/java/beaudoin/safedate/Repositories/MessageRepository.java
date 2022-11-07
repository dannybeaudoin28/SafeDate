package beaudoin.safedate.Repositories;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beaudoin.safedate.Models.MessageModel;

@Repository
public interface MessageRepository extends CrudRepository<MessageModel, Integer> {

    @Query(value = "SELECT * FROM MESSAGE_TABLE WHERE MSG_BODY = *?1*", nativeQuery = true)
    List<MessageModel> searchMessages(String searchCriteria);

    @Query(value = "SELECT * FROM MESSAGE_TABLE WHERE MSG_BODY = ?1", nativeQuery = true)
    List<MessageModel> searchMessagesById(Integer msgId);    
}
