package ele.me.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategorysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategorysExample() {
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

        public Criteria andCgidIsNull() {
            addCriterion("cgid is null");
            return (Criteria) this;
        }

        public Criteria andCgidIsNotNull() {
            addCriterion("cgid is not null");
            return (Criteria) this;
        }

        public Criteria andCgidEqualTo(Integer value) {
            addCriterion("cgid =", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotEqualTo(Integer value) {
            addCriterion("cgid <>", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThan(Integer value) {
            addCriterion("cgid >", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgid >=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThan(Integer value) {
            addCriterion("cgid <", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThanOrEqualTo(Integer value) {
            addCriterion("cgid <=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidIn(List<Integer> values) {
            addCriterion("cgid in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotIn(List<Integer> values) {
            addCriterion("cgid not in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidBetween(Integer value1, Integer value2) {
            addCriterion("cgid between", value1, value2, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotBetween(Integer value1, Integer value2) {
            addCriterion("cgid not between", value1, value2, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgnameIsNull() {
            addCriterion("cgname is null");
            return (Criteria) this;
        }

        public Criteria andCgnameIsNotNull() {
            addCriterion("cgname is not null");
            return (Criteria) this;
        }

        public Criteria andCgnameEqualTo(String value) {
            addCriterion("cgname =", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameNotEqualTo(String value) {
            addCriterion("cgname <>", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameGreaterThan(String value) {
            addCriterion("cgname >", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameGreaterThanOrEqualTo(String value) {
            addCriterion("cgname >=", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameLessThan(String value) {
            addCriterion("cgname <", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameLessThanOrEqualTo(String value) {
            addCriterion("cgname <=", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameLike(String value) {
            addCriterion("cgname like", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameNotLike(String value) {
            addCriterion("cgname not like", value, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameIn(List<String> values) {
            addCriterion("cgname in", values, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameNotIn(List<String> values) {
            addCriterion("cgname not in", values, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameBetween(String value1, String value2) {
            addCriterion("cgname between", value1, value2, "cgname");
            return (Criteria) this;
        }

        public Criteria andCgnameNotBetween(String value1, String value2) {
            addCriterion("cgname not between", value1, value2, "cgname");
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