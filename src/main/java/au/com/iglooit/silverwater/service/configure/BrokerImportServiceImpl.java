package au.com.iglooit.silverwater.service.configure;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.vo.BrokerImportVO;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by nicholaszhu on 16/12/2014.
 */
@Service
public class BrokerImportServiceImpl implements BrokerImportService {
    @Resource
    private BrokerDAO brokerDAO;

    @Override
    public void saveOrUpdateBroker(BrokerImportVO vo) {
        // find by name
        Broker broker = brokerDAO.findByPhone(vo.getPhone());
        if (broker == null) {
            // create new one
            brokerDAO.createBroker(vo.toBroker());
        } else {
            // update
            broker.setFax(vo.getFax());
            broker.setName(vo.getName());
            broker.setSurname(vo.getSurname());
            broker.setEmail(vo.getEmail());
            broker.setMobile(vo.getMobile());
            broker.setAddress1(vo.getAddress1());
            broker.setAddress2(vo.getAddress2());
            broker.setAddress3(vo.getAddress3());
            broker.setBio(vo.getBio());
            broker.setForename(vo.getForename());
            broker.setPhone(vo.getPhone());
            broker.setTitle(vo.getTitle());
            broker.setSuburbList(vo.getSuburbList());
            brokerDAO.update(broker);
        }

    }
}
