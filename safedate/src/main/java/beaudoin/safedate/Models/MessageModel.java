package beaudoin.safedate.Models;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Table(name = "MESSAGE_TABLE")
@Entity
public class MessageModel {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RECEIVED_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;

    @Column(name = "SENT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentDate;

    @Column(name = "SENT_FROM")
    private Integer sentFrom;

    @Column(name = "SENT_TO")
    private Integer sentTo;

    @Column(name = "MSG_HEADER")
    private String messageHeader;

    @Column(name = "MSG_BODY")
    private String messageBody;
}
