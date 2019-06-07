package come.team.mapper;

import java.util.List;

import come.team.domain.Criteria;
import come.team.domain.ProductVO;

public interface ProductMapper {
	
	List<ProductVO> findPagingList(Criteria criteria); //�럹�씠吏뺥빐�꽌 �젣�뭹 李얘린
	List<ProductVO> findByKeyword(Criteria criteria); //�궎�썙�뱶濡� �젣�뭹 李얘린
	ProductVO findOneWithProductCode(String productCode); //肄붾뱶濡� �젣�뭹 李얘린
	int countAll(Criteria criteria); //�쟾泥� �긽�뭹 媛쒖닔 援ы븯湲�
	ProductVO productView(String productCode);// �긽�뭹 �젙蹂대낫湲�
	void insertProduct(ProductVO vo); //�젣�뭹 �벑濡�
	void delete(String productCode); //�젣�뭹 �궘�젣
	void update(ProductVO vo); //�젣�뭹 �닔�젙
	int total();
}
