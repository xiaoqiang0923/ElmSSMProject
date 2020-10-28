package ele.me.service.impl;


import ele.me.dao.CustomerMapper;
import ele.me.domain.Customer;
import ele.me.domain.CustomerExample;
import ele.me.service.CustomerService;
import ele.me.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public long countByExample(CustomerExample example) {
        return customerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerExample example) {
        return customerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return customerMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.insertSelective(record);
    }

    @Override
    public List<Customer> selectByExample(CustomerExample example) {
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer selectByPrimaryKey(Integer cid) {
        return customerMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Customer record, CustomerExample example) {
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Customer record, CustomerExample example) {
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        record.setCpass(MD5Util.getMD5(record.getCpass()));
        return customerMapper.updateByPrimaryKey(record);
    }
}
