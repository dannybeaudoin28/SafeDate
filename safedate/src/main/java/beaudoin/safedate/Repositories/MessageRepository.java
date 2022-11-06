package beaudoin.safedate.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beaudoin.safedate.Models.MessageModel;

@Repository
public interface MessageRepository extends CrudRepository<MessageModel, Integer> {
    
}
