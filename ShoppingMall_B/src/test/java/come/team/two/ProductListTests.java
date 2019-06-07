package come.team.two;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import come.team.domain.Criteria;
import come.team.domain.InquiryVO;
import come.team.domain.ProductVO;
import come.team.mapper.InquiryMapper;
import come.team.mapper.ProductMapper;
import come.team.mapper.ReviewMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ProductListTests {

	@Setter(onMethod_ = @Autowired)
	private ProductMapper productMapper;
	
	@Setter(onMethod_ = @Autowired)
	private ReviewMapper reviewMapper;
	
	@Setter(onMethod_ = @Autowired)
	private InquiryMapper inquiryMapper;
	
	@Test
	public void getInquiryList() {
		Criteria criteria = new Criteria(1, 10, new BigDecimal(0));
		List<InquiryVO> list = inquiryMapper.getInquiryList(criteria);
		list.forEach(inq -> log.info(inq));
	}

//	
//	@Test
//	public void findPagingList() { //�럹�씠吏뺥빐�꽌 由ъ뒪�듃瑜� 遺덈윭 �삱 �닔 �엳�뒗吏� �뀒�뒪�듃
//		Criteria criteria = new Criteria();
//
//		List<ProductVO> list = productMapper.findPagingList(criteria); //mapper瑜� �넻�빐�꽌 媛� 援ы븯湲�
//		
//		list.forEach(page -> log.info(page));
//	}
//
//	
//	@Test
//	public void findByKeyword() {
//		Criteria criteria = new Criteria();
//		criteria.setType("M"); 
//		criteria.setKeyword("LG"); //Manufacturer媛� LG�씤 寃껊쭔 異붿텧
//		
//		List<ProductVO> list = productMapper.findPagingList(criteria);
//
//		list.forEach(page -> log.info(page));
//		  //productType = T
//		  //productCode = C
//		  //productName = N
//		  //manufacturer = M
//		  //description = D
//	}
//	
//
//	@Test
//	public void getReviewList() {
//		Criteria criteria = new Criteria(2, 15);
//		
//		List<ReviewVO> list = reviewMapper.getReviewList(criteria, "b12");
//		
//		list.forEach(review -> log.info(review));
//		
//	}

}
