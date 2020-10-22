package ele.me.dao;

import ele.me.domain.Categorys;
import ele.me.domain.CategorysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategorysMapper {
    long countByExample(CategorysExample example);

    int deleteByExample(CategorysExample example);

    int deleteByPrimaryKey(Integer cgid);

    int insert(Categorys record);

    int insertSelective(Categorys record);

    List<Categorys> selectByExample(CategorysExample example);

    Categorys selectByPrimaryKey(Integer cgid);

    int updateByExampleSelective(@Param("record") Categorys record, @Param("example") CategorysExample example);

    int updateByExample(@Param("record") Categorys record, @Param("example") CategorysExample example);

    int updateByPrimaryKeySelective(Categorys record);

    int updateByPrimaryKey(Categorys record);
}