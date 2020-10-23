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
        return 0;
    }

    @Override
    public int deleteByExample(CategorysExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cgid) {
        return 0;
    }

    @Override
    public int insert(Categorys record) {
        return 0;
    }

    @Override
    public int insertSelective(Categorys record) {
        return 0;
    }

    @Override
    public List<Categorys> selectByExample(CategorysExample example) {
        return categorysMapper.selectByExample(example);
    }

    @Override
    public Categorys selectByPrimaryKey(Integer cgid) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return categorysMapper.selectByPrimaryKey(cgid);
    }

    @Override
    public int updateByExampleSelective(Categorys record, CategorysExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Categorys record, CategorysExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Categorys record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Categorys record) {
        return 0;
    }
}
