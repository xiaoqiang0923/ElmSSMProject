package ele.me.service.impl;


import ele.me.dao.GoodsMapper;
import ele.me.domain.Goods;
import ele.me.domain.GoodsExample;
import ele.me.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public long countByExample(GoodsExample example) {
        return goodsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsExample example) {
        return goodsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer gid) {
        return goodsMapper.deleteByPrimaryKey(gid);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public List<Goods> selectByExample(GoodsExample example) {
        return goodsMapper.selectByExample(example);
    }

    @Override
    public Goods selectByPrimaryKey(Integer gid) {
        return goodsMapper.selectByPrimaryKey(gid);
    }

    @Override
    public int updateByExampleSelective(Goods record, GoodsExample example) {
        return goodsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Goods record, GoodsExample example) {
        return goodsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

}
