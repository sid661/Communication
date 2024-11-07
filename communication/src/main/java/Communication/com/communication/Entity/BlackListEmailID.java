package Communication.com.communication.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(schema = "email", name = "t_email_blacklist")
public class BlackListEmailID {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BLACKLIST_SEQUESNCE")
    @SequenceGenerator(name = "BLACKLIST_SEQUENCE", sequenceName = "email.t_email_blacklist_blacklist_id_seq", allocationSize = 1)
    @Column(name = "blacklist_id")
    private Long blackListId;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "effective_from")
    private Timestamp effectiveFrom;
    @Column(name = "black_listed")
    private String emailIdStatus;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "company_code")
    private String companyCode;
    @Column(name = "created_user")
    private String createdUser;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "rate_limit")
    private Long rateCount;

}
