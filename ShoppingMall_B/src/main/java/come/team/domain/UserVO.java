package come.team.domain;

import java.util.Date;

import lombok.Data;
@Data
public class UserVO {
	String id;
	String password;
	String name;
	String address;
	String contact;
	String email;
	Date regiDate;
	int userCode;
	int point;
}
