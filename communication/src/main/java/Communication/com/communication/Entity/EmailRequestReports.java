package Communication.com.communication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "T_EMAIL_REQUEST", schema = "EMAIL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailRequestReports {
    @Id
    @Column(name = "DIGIT_REQUEST_ID")
    private String id;
    @Column(name = "EMAIL_SUBJECT")
    private String emailSubject;
    @Column(name = "DIGIT_TEMPLATE_ID")
    private String digitTemplateId;
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;
    @Column(name = "SERVICE_USER")
    private String serviceUser;
}
