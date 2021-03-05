package online.mengxun.server.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Admin {

    @Id
    private String id;
    private String name;
    private String nickName;
    private String password;
    private Date created;
    private Date updated;
}
