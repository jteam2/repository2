package come.team.domain;

import lombok.Data;

@Data
public class CartVO {
	int cartNo;
	String productCode;
	String id;
	int amount;
}
