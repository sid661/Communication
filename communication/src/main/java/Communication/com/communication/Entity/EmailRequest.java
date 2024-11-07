package Communication.com.communication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "T_EMAIL_REQUEST", schema = "EMAIL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailRequest {

    @Id
    @Column(name = "DIGIT_REQUEST_ID")
    private String id;
    @JsonManagedReference
    @OneToMany(mappedBy = "emailRequest", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EmailTransaction> transactionList;
    @Column(name="EMAIL_FORM")
    private String emailForm;
    @Column(name="EMAIL_SUBJECT")
    private String emailSubject;
    @Column(name="EMAIL_PARAMS")
    private String emailParams;
    @Column(name="EMAIL_ATTACHMENT")
    private String emailAttachment;
    @Column(name="DIGIT_TEMPLATE_ID")
    private String digitTemplateId;
    @Column(name="REFERENCE_NUMBER")
    private String referenceNumber;
    @Column(name="COMPANY_CODE")
    private String companyCode;
    @Column(name="CREATED_DATE")
    private Timestamp createdDate;
   @Column(name="SERVICE_USER")
    private String serviceUser;
   @Column(name="SOURCE_IP")
   private String sourceIp;
   @Column(name="recipient_count")
   private int recipientsCount;
   @OneToMany(mappedBy = "emailRequest",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   private List<EmailRecipient> emailRecipientList;
   @PrePersist
   public void PrePersistHook(){
       this.id= UUID.randomUUID().toString();
   }

}
