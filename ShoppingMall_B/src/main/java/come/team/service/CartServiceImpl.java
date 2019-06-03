package come.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.team.domain.CartVO;
import come.team.mapper.CartMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class CartServiceImpl implements CartService {
	@Setter(onMethod_=@Autowired)
	private CartMapper mapper;



	@Override
	public CartVO addCart(CartVO cart) {
	
		return mapper.addCart(cart);
	}

}
