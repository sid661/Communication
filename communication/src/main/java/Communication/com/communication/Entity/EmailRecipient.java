package Communication.com.communication.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity
@Table(schema = "email", name = "t_email_recipient")
public class EmailRecipient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECIPIENT_SEQUENCE")
    @SequenceGenerator(name = "RECIPIENT_SEQUENCE", sequenceName = "email.t_email_recipient_recipient_id_seq", allocationSize = 1)
    @Column(name = "recipient_id")
    private Long recipientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "DIGIT_REQUEST_ID", referencedColumnName = "DIGIT_REQUEST_ID")
    @ToString.Exclude
    private EmailRequest emailRequest;

    @Column(name = "email_id")
    private String emailId;

    @CreationTimestamp
    @Column(name = "created_time")
    private Timestamp createdDate;
}
