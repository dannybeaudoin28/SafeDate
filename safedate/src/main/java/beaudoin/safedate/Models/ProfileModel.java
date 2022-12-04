package beaudoin.safedate.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "PROFILE_TABLE")
@Entity
public class ProfileModel {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_EMAIL")
    private String email;

    @Column(name = "PROFILE_PICTURE")
    private byte[] picture;

    @Column(name = "ACCOUNT_BIO")
    private String bio;

    @Column(name = "ACCOUNT_TAGS")
    private String[] tags;
}
