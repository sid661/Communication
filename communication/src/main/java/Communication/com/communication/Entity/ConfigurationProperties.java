package Communication.com.communication.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "T_EMAIL_CONFIG_PROPERTIES", schema = "EMAIL")
public class ConfigurationProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROPERTY_CONFIG_SEQUESNCE")
    @SequenceGenerator(name = "PROPERTY_CONFIG_SEQUESNCE", sequenceName = "email.t_config_properties_id_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PROPERTY_NAME")
    private String propertyName;
    @Column(name = "PROPERTY_VALUE_LIFE")
    private String propertyLife;
    @Column(name = "PROPERTY_VALUE_GENERAL")
    private String propertyGeneral;
    @Column(name = "CREATED_USER")
    private String createdUser;
    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;
}
