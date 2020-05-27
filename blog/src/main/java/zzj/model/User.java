package zzj.model;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class User {
    private Integer id;
    private String name;
    //java.util.Date;
    private Date createTime;

}
