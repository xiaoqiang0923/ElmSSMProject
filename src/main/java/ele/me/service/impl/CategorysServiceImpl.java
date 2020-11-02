package ele.me.service.impl;

import ele.me.dao.CategorysMapper;
import ele.me.domain.Categorys;
import ele.me.domain.CategorysExample;
import ele.me.service.CategorysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "categorysService")
public class CategorysServiceImpl implements CategorysService {
    @Autowired
    private CategorysMapper categorysMapper;


    @Override
    public long countByExample(CategorysExample example) {
        return categorysMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CategorysExample example) {
        return categorysMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cgid) {
        return categorysMapper.deleteByPrimaryKey(cgid);
    }

    @Override
    public int insert(Categorys record) {
        return categorysMapper.insert(record);
    }

    @Override
    public int insertSelective(Categorys record) {
        return categorysMapper.insertSelective(record);
    }

    @Override
    public List<Categorys> selectByExample(CategorysExample example) {
        return categorysMapper.selectByExample(example);
    }

    @Override
    public Categorys selectByPrimaryKey(Integer cgid) {
        return categorysMapper.selectByPrimaryKey(cgid);
    }

    @Override
    public int updateByExampleSelective(Categorys record, CategorysExample example) {
        return categorysMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Categorys record, CategorysExample example) {

        return categorysMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Categorys record) {

        return categorysMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Categorys record) {

        return categorysMapper.updateByPrimaryKey(record);
    }
}
