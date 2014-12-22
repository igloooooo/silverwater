package au.com.iglooit.silverwater.service.configure;

import au.com.iglooit.silverwater.model.vo.BrokerImportVO;

/**
 * Created by nicholaszhu on 16/12/2014.
 */
public interface BrokerImportService {
    void saveOrUpdateBroker(BrokerImportVO vo);
}
