package ele.me.service;

import ele.me.domain.Categorys;
import ele.me.domain.CategorysExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategorysService {
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
