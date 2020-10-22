package ele.me.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNull() {
            addCriterion("bpassword is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordIsNotNull() {
            addCriterion("bpassword is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordEqualTo(String value) {
            addCriterion("bpassword =", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotEqualTo(String value) {
            addCriterion("bpassword <>", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThan(String value) {
            addCriterion("bpassword >", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("bpassword >=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThan(String value) {
            addCriterion("bpassword <", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLessThanOrEqualTo(String value) {
            addCriterion("bpassword <=", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordLike(String value) {
            addCriterion("bpassword like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotLike(String value) {
            addCriterion("bpassword not like", value, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordIn(List<String> values) {
            addCriterion("bpassword in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotIn(List<String> values) {
            addCriterion("bpassword not in", values, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordBetween(String value1, String value2) {
            addCriterion("bpassword between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBpasswordNotBetween(String value1, String value2) {
            addCriterion("bpassword not between", value1, value2, "bpassword");
            return (Criteria) this;
        }

        public Criteria andBimgIsNull() {
            addCriterion("bimg is null");
            return (Criteria) this;
        }

        public Criteria andBimgIsNotNull() {
            addCriterion("bimg is not null");
            return (Criteria) this;
        }

        public Criteria andBimgEqualTo(String value) {
            addCriterion("bimg =", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotEqualTo(String value) {
            addCriterion("bimg <>", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgGreaterThan(String value) {
            addCriterion("bimg >", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgGreaterThanOrEqualTo(String value) {
            addCriterion("bimg >=", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLessThan(String value) {
            addCriterion("bimg <", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLessThanOrEqualTo(String value) {
            addCriterion("bimg <=", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgLike(String value) {
            addCriterion("bimg like", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotLike(String value) {
            addCriterion("bimg not like", value, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgIn(List<String> values) {
            addCriterion("bimg in", values, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotIn(List<String> values) {
            addCriterion("bimg not in", values, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgBetween(String value1, String value2) {
            addCriterion("bimg between", value1, value2, "bimg");
            return (Criteria) this;
        }

        public Criteria andBimgNotBetween(String value1, String value2) {
            addCriterion("bimg not between", value1, value2, "bimg");
            return (Criteria) this;
        }

        public Criteria andBscoreIsNull() {
            addCriterion("bscore is null");
            return (Criteria) this;
        }

        public Criteria andBscoreIsNotNull() {
            addCriterion("bscore is not null");
            return (Criteria) this;
        }

        public Criteria andBscoreEqualTo(Double value) {
            addCriterion("bscore =", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreNotEqualTo(Double value) {
            addCriterion("bscore <>", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreGreaterThan(Double value) {
            addCriterion("bscore >", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("bscore >=", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreLessThan(Double value) {
            addCriterion("bscore <", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreLessThanOrEqualTo(Double value) {
            addCriterion("bscore <=", value, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreIn(List<Double> values) {
            addCriterion("bscore in", values, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreNotIn(List<Double> values) {
            addCriterion("bscore not in", values, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreBetween(Double value1, Double value2) {
            addCriterion("bscore between", value1, value2, "bscore");
            return (Criteria) this;
        }

        public Criteria andBscoreNotBetween(Double value1, Double value2) {
            addCriterion("bscore not between", value1, value2, "bscore");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIsNull() {
            addCriterion("bdescription is null");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIsNotNull() {
            addCriterion("bdescription is not null");
            return (Criteria) this;
        }

        public Criteria andBdescriptionEqualTo(String value) {
            addCriterion("bdescription =", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotEqualTo(String value) {
            addCriterion("bdescription <>", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionGreaterThan(String value) {
            addCriterion("bdescription >", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bdescription >=", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLessThan(String value) {
            addCriterion("bdescription <", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLessThanOrEqualTo(String value) {
            addCriterion("bdescription <=", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLike(String value) {
            addCriterion("bdescription like", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotLike(String value) {
            addCriterion("bdescription not like", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIn(List<String> values) {
            addCriterion("bdescription in", values, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotIn(List<String> values) {
            addCriterion("bdescription not in", values, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionBetween(String value1, String value2) {
            addCriterion("bdescription between", value1, value2, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotBetween(String value1, String value2) {
            addCriterion("bdescription not between", value1, value2, "bdescription");
            return (Criteria) this;
        }

        public Criteria andCourierIsNull() {
            addCriterion("courier is null");
            return (Criteria) this;
        }

        public Criteria andCourierIsNotNull() {
            addCriterion("courier is not null");
            return (Criteria) this;
        }

        public Criteria andCourierEqualTo(String value) {
            addCriterion("courier =", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierNotEqualTo(String value) {
            addCriterion("courier <>", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierGreaterThan(String value) {
            addCriterion("courier >", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierGreaterThanOrEqualTo(String value) {
            addCriterion("courier >=", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierLessThan(String value) {
            addCriterion("courier <", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierLessThanOrEqualTo(String value) {
            addCriterion("courier <=", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierLike(String value) {
            addCriterion("courier like", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierNotLike(String value) {
            addCriterion("courier not like", value, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierIn(List<String> values) {
            addCriterion("courier in", values, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierNotIn(List<String> values) {
            addCriterion("courier not in", values, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierBetween(String value1, String value2) {
            addCriterion("courier between", value1, value2, "courier");
            return (Criteria) this;
        }

        public Criteria andCourierNotBetween(String value1, String value2) {
            addCriterion("courier not between", value1, value2, "courier");
            return (Criteria) this;
        }

        public Criteria andBlocationIsNull() {
            addCriterion("blocation is null");
            return (Criteria) this;
        }

        public Criteria andBlocationIsNotNull() {
            addCriterion("blocation is not null");
            return (Criteria) this;
        }

        public Criteria andBlocationEqualTo(String value) {
            addCriterion("blocation =", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationNotEqualTo(String value) {
            addCriterion("blocation <>", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationGreaterThan(String value) {
            addCriterion("blocation >", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationGreaterThanOrEqualTo(String value) {
            addCriterion("blocation >=", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationLessThan(String value) {
            addCriterion("blocation <", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationLessThanOrEqualTo(String value) {
            addCriterion("blocation <=", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationLike(String value) {
            addCriterion("blocation like", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationNotLike(String value) {
            addCriterion("blocation not like", value, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationIn(List<String> values) {
            addCriterion("blocation in", values, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationNotIn(List<String> values) {
            addCriterion("blocation not in", values, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationBetween(String value1, String value2) {
            addCriterion("blocation between", value1, value2, "blocation");
            return (Criteria) this;
        }

        public Criteria andBlocationNotBetween(String value1, String value2) {
            addCriterion("blocation not between", value1, value2, "blocation");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNull() {
            addCriterion("delivery is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNotNull() {
            addCriterion("delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEqualTo(Double value) {
            addCriterion("delivery =", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotEqualTo(Double value) {
            addCriterion("delivery <>", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThan(Double value) {
            addCriterion("delivery >", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery >=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThan(Double value) {
            addCriterion("delivery <", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThanOrEqualTo(Double value) {
            addCriterion("delivery <=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryIn(List<Double> values) {
            addCriterion("delivery in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotIn(List<Double> values) {
            addCriterion("delivery not in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryBetween(Double value1, Double value2) {
            addCriterion("delivery between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotBetween(Double value1, Double value2) {
            addCriterion("delivery not between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
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