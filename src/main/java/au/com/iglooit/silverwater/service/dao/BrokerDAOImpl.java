package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.repository.BaseRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BrokerDAOImpl extends BaseRepository<Broker> implements BrokerDAO {
    public BrokerDAOImpl() {
        super(Broker.class);
    }
}
