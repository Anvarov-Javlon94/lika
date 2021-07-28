package sqb.uz.marry_me.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientSimple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String user_agent;
    String ip_address;
    Date date_of_visit;

}
