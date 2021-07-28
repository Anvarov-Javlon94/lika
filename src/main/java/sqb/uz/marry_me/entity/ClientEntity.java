package sqb.uz.marry_me.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name_of_client;
    @Column(length = 2000)
    String text_of_client;
    Date send_message_date;
    String ip_address;
    String user_agent;
}
