package ele.me.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGimgIsNull() {
            addCriterion("gimg is null");
            return (Criteria) this;
        }

        public Criteria andGimgIsNotNull() {
            addCriterion("gimg is not null");
            return (Criteria) this;
        }

        public Criteria andGimgEqualTo(String value) {
            addCriterion("gimg =", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotEqualTo(String value) {
            addCriterion("gimg <>", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgGreaterThan(String value) {
            addCriterion("gimg >", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgGreaterThanOrEqualTo(String value) {
            addCriterion("gimg >=", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLessThan(String value) {
            addCriterion("gimg <", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLessThanOrEqualTo(String value) {
            addCriterion("gimg <=", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLike(String value) {
            addCriterion("gimg like", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotLike(String value) {
            addCriterion("gimg not like", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgIn(List<String> values) {
            addCriterion("gimg in", values, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotIn(List<String> values) {
            addCriterion("gimg not in", values, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgBetween(String value1, String value2) {
            addCriterion("gimg between", value1, value2, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotBetween(String value1, String value2) {
            addCriterion("gimg not between", value1, value2, "gimg");
            return (Criteria) this;
        }

        public Criteria andGintroductionIsNull() {
            addCriterion("gintroduction is null");
            return (Criteria) this;
        }

        public Criteria andGintroductionIsNotNull() {
            addCriterion("gintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andGintroductionEqualTo(String value) {
            addCriterion("gintroduction =", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionNotEqualTo(String value) {
            addCriterion("gintroduction <>", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionGreaterThan(String value) {
            addCriterion("gintroduction >", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("gintroduction >=", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionLessThan(String value) {
            addCriterion("gintroduction <", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionLessThanOrEqualTo(String value) {
            addCriterion("gintroduction <=", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionLike(String value) {
            addCriterion("gintroduction like", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionNotLike(String value) {
            addCriterion("gintroduction not like", value, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionIn(List<String> values) {
            addCriterion("gintroduction in", values, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionNotIn(List<String> values) {
            addCriterion("gintroduction not in", values, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionBetween(String value1, String value2) {
            addCriterion("gintroduction between", value1, value2, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGintroductionNotBetween(String value1, String value2) {
            addCriterion("gintroduction not between", value1, value2, "gintroduction");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Double value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Double value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Double value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Double value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Double value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Double> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Double> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Double value1, Double value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Double value1, Double value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGcgidIsNull() {
            addCriterion("gcgid is null");
            return (Criteria) this;
        }

        public Criteria andGcgidIsNotNull() {
            addCriterion("gcgid is not null");
            return (Criteria) this;
        }

        public Criteria andGcgidEqualTo(Integer value) {
            addCriterion("gcgid =", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidNotEqualTo(Integer value) {
            addCriterion("gcgid <>", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidGreaterThan(Integer value) {
            addCriterion("gcgid >", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcgid >=", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidLessThan(Integer value) {
            addCriterion("gcgid <", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidLessThanOrEqualTo(Integer value) {
            addCriterion("gcgid <=", value, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidIn(List<Integer> values) {
            addCriterion("gcgid in", values, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidNotIn(List<Integer> values) {
            addCriterion("gcgid not in", values, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidBetween(Integer value1, Integer value2) {
            addCriterion("gcgid between", value1, value2, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGcgidNotBetween(Integer value1, Integer value2) {
            addCriterion("gcgid not between", value1, value2, "gcgid");
            return (Criteria) this;
        }

        public Criteria andGbidIsNull() {
            addCriterion("gbid is null");
            return (Criteria) this;
        }

        public Criteria andGbidIsNotNull() {
            addCriterion("gbid is not null");
            return (Criteria) this;
        }

        public Criteria andGbidEqualTo(Integer value) {
            addCriterion("gbid =", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotEqualTo(Integer value) {
            addCriterion("gbid <>", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidGreaterThan(Integer value) {
            addCriterion("gbid >", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gbid >=", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidLessThan(Integer value) {
            addCriterion("gbid <", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidLessThanOrEqualTo(Integer value) {
            addCriterion("gbid <=", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidIn(List<Integer> values) {
            addCriterion("gbid in", values, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotIn(List<Integer> values) {
            addCriterion("gbid not in", values, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidBetween(Integer value1, Integer value2) {
            addCriterion("gbid between", value1, value2, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotBetween(Integer value1, Integer value2) {
            addCriterion("gbid not between", value1, value2, "gbid");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}