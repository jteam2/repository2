package come.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import come.team.domain.Criteria;
import come.team.domain.InquiryVO;
import come.team.mapper.InquiryMapper;
import lombok.Setter;

@Service
public class InquiryServiceImpl implements InquiryService {
	
	@Setter(onMethod_ = @Autowired)
	private InquiryMapper mapper;
	

	@Override
	public List<InquiryVO> getInquiryList(Criteria criteria) {
		return mapper.getInquiryList(criteria);
	}

	@Override
	public int getInquiryNum() {
		return mapper.getInquiryNum();
	}

	@Override
	public InquiryVO getInquiryView(int inquiryNo) {
		return mapper.getInquiryView(inquiryNo);
	}

	@Override
	public void registerInquiry(InquiryVO inquiryVO) {
		mapper.registerInquiry(inquiryVO);

	}

	@Override
	public void deleteInquiry() {
		mapper.deleteInquiry();
	}

}
