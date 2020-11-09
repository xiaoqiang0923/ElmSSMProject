package ele.me.dao;

import ele.me.domain.BusinessToActivities;
import ele.me.domain.BusinessToActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessToActivitiesMapper {
    long countByExample(BusinessToActivitiesExample example);

    int deleteByExample(BusinessToActivitiesExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(BusinessToActivities record);

    int insertSelective(BusinessToActivities record);

    List<BusinessToActivities> selectByExample(BusinessToActivitiesExample example);

    BusinessToActivities selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") BusinessToActivities record, @Param("example") BusinessToActivitiesExample example);

    int updateByExample(@Param("record") BusinessToActivities record, @Param("example") BusinessToActivitiesExample example);

    int updateByPrimaryKeySelective(BusinessToActivities record);

    int updateByPrimaryKey(BusinessToActivities record);
}