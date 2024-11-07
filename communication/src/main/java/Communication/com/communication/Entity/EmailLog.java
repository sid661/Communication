package Communication.com.communication.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "t_email_logs", schema = "email")
public class EmailLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_SEQUENCE")
    @SequenceGenerator(name = "LOG_SEQUENCE", sequenceName = "email.t_email_logs_log_id_seq", allocationSize = 1)
    private Long logId;

    private String referenceId;
    private String activity;
    private String method;
    private String url;
    private String header;
    private String request;
    private String response;
    @Column(name = "response_code")
    private Integer responseCode;
    private String exception;
    @CreationTimestamp
    @Column(name = "created_date")
    private Timestamp createdDate;
}
