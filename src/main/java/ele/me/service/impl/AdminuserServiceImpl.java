package ele.me.service.impl;

import ele.me.dao.AdminuserMapper;
import ele.me.domain.Adminuser;
import ele.me.domain.AdminuserExample;
import ele.me.service.AdminuserService;
import ele.me.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "adminuserService")
public class AdminuserServiceImpl implements AdminuserService {
    @Autowired
    private AdminuserMapper adminuserMapper;

    @Override
    public long countByExample(AdminuserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AdminuserExample example) {
        return adminuserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return adminuserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Adminuser record) {
        return 0;
    }

    @Override
    public int insertSelective(Adminuser record) {
        //对传递过来的明文密码加密为密文然后比对
        record.setPassword(MD5Util.getMD5(record.getPassword()));
        return adminuserMapper.insertSelective(record);
    }

    @Override
    public List<Adminuser> selectByExample(AdminuserExample example) {
        return adminuserMapper.selectByExample(example);
    }

    @Override
    public Adminuser selectByPrimaryKey(Integer uid) {
        return adminuserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByExampleSelective(Adminuser record, AdminuserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Adminuser record, AdminuserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Adminuser record) {
        record.setPassword(MD5Util.getMD5(record.getPassword()));
        return adminuserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Adminuser record) {
        return 0;
    }
}
