package ele.me.service.impl;

import ele.me.dao.BusinessMapper;
import ele.me.domain.Business;
import ele.me.domain.BusinessExample;
import ele.me.service.BusinessService;
import ele.me.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "businessService")
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;


    @Override
    public long countByExample(BusinessExample example) {
        return businessMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BusinessExample example) {
        return businessMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer bid) {
        return businessMapper.deleteByPrimaryKey(bid);
    }

    @Override
    public int insert(Business record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.insert(record);
    }

    @Override
    public int insertSelective(Business record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.insertSelective(record);
    }

    @Override
    public List<Business> selectByExample(BusinessExample example) {
        return businessMapper.selectByExample(example);
    }

    @Override
    public Business selectByPrimaryKey(Integer bid) {
        return businessMapper.selectByPrimaryKey(bid);
    }

    @Override
    public int updateByExampleSelective(Business record, BusinessExample example) {
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Business record, BusinessExample example) {
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Business record) {
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Business record) {
        record.setBpassword(MD5Util.getMD5(record.getBpassword()));
        return businessMapper.updateByPrimaryKey(record);
    }
}
