package com.starfall.ssm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UrlLogExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UrlLogExample() {
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCreatTimeIsNull() {
			addCriterion("creat_time is null");
			return (Criteria) this;
		}

		public Criteria andCreatTimeIsNotNull() {
			addCriterion("creat_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreatTimeEqualTo(Date value) {
			addCriterion("creat_time =", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeNotEqualTo(Date value) {
			addCriterion("creat_time <>", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeGreaterThan(Date value) {
			addCriterion("creat_time >", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("creat_time >=", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeLessThan(Date value) {
			addCriterion("creat_time <", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
			addCriterion("creat_time <=", value, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeIn(List<Date> values) {
			addCriterion("creat_time in", values, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeNotIn(List<Date> values) {
			addCriterion("creat_time not in", values, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeBetween(Date value1, Date value2) {
			addCriterion("creat_time between", value1, value2, "creatTime");
			return (Criteria) this;
		}

		public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
			addCriterion("creat_time not between", value1, value2, "creatTime");
			return (Criteria) this;
		}

		public Criteria andOpNameIsNull() {
			addCriterion("op_name is null");
			return (Criteria) this;
		}

		public Criteria andOpNameIsNotNull() {
			addCriterion("op_name is not null");
			return (Criteria) this;
		}

		public Criteria andOpNameEqualTo(String value) {
			addCriterion("op_name =", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameNotEqualTo(String value) {
			addCriterion("op_name <>", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameGreaterThan(String value) {
			addCriterion("op_name >", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameGreaterThanOrEqualTo(String value) {
			addCriterion("op_name >=", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameLessThan(String value) {
			addCriterion("op_name <", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameLessThanOrEqualTo(String value) {
			addCriterion("op_name <=", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameLike(String value) {
			addCriterion("op_name like", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameNotLike(String value) {
			addCriterion("op_name not like", value, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameIn(List<String> values) {
			addCriterion("op_name in", values, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameNotIn(List<String> values) {
			addCriterion("op_name not in", values, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameBetween(String value1, String value2) {
			addCriterion("op_name between", value1, value2, "opName");
			return (Criteria) this;
		}

		public Criteria andOpNameNotBetween(String value1, String value2) {
			addCriterion("op_name not between", value1, value2, "opName");
			return (Criteria) this;
		}

		public Criteria andOpIdIsNull() {
			addCriterion("op_id is null");
			return (Criteria) this;
		}

		public Criteria andOpIdIsNotNull() {
			addCriterion("op_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpIdEqualTo(Integer value) {
			addCriterion("op_id =", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdNotEqualTo(Integer value) {
			addCriterion("op_id <>", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdGreaterThan(Integer value) {
			addCriterion("op_id >", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("op_id >=", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdLessThan(Integer value) {
			addCriterion("op_id <", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdLessThanOrEqualTo(Integer value) {
			addCriterion("op_id <=", value, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdIn(List<Integer> values) {
			addCriterion("op_id in", values, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdNotIn(List<Integer> values) {
			addCriterion("op_id not in", values, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdBetween(Integer value1, Integer value2) {
			addCriterion("op_id between", value1, value2, "opId");
			return (Criteria) this;
		}

		public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
			addCriterion("op_id not between", value1, value2, "opId");
			return (Criteria) this;
		}

		public Criteria andRequestUrlIsNull() {
			addCriterion("request_url is null");
			return (Criteria) this;
		}

		public Criteria andRequestUrlIsNotNull() {
			addCriterion("request_url is not null");
			return (Criteria) this;
		}

		public Criteria andRequestUrlEqualTo(String value) {
			addCriterion("request_url =", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlNotEqualTo(String value) {
			addCriterion("request_url <>", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlGreaterThan(String value) {
			addCriterion("request_url >", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
			addCriterion("request_url >=", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlLessThan(String value) {
			addCriterion("request_url <", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlLessThanOrEqualTo(String value) {
			addCriterion("request_url <=", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlLike(String value) {
			addCriterion("request_url like", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlNotLike(String value) {
			addCriterion("request_url not like", value, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlIn(List<String> values) {
			addCriterion("request_url in", values, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlNotIn(List<String> values) {
			addCriterion("request_url not in", values, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlBetween(String value1, String value2) {
			addCriterion("request_url between", value1, value2, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestUrlNotBetween(String value1, String value2) {
			addCriterion("request_url not between", value1, value2, "requestUrl");
			return (Criteria) this;
		}

		public Criteria andRequestMethodIsNull() {
			addCriterion("request_method is null");
			return (Criteria) this;
		}

		public Criteria andRequestMethodIsNotNull() {
			addCriterion("request_method is not null");
			return (Criteria) this;
		}

		public Criteria andRequestMethodEqualTo(String value) {
			addCriterion("request_method =", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodNotEqualTo(String value) {
			addCriterion("request_method <>", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodGreaterThan(String value) {
			addCriterion("request_method >", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodGreaterThanOrEqualTo(String value) {
			addCriterion("request_method >=", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodLessThan(String value) {
			addCriterion("request_method <", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodLessThanOrEqualTo(String value) {
			addCriterion("request_method <=", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodLike(String value) {
			addCriterion("request_method like", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodNotLike(String value) {
			addCriterion("request_method not like", value, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodIn(List<String> values) {
			addCriterion("request_method in", values, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodNotIn(List<String> values) {
			addCriterion("request_method not in", values, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodBetween(String value1, String value2) {
			addCriterion("request_method between", value1, value2, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestMethodNotBetween(String value1, String value2) {
			addCriterion("request_method not between", value1, value2, "requestMethod");
			return (Criteria) this;
		}

		public Criteria andRequestParamsIsNull() {
			addCriterion("request_params is null");
			return (Criteria) this;
		}

		public Criteria andRequestParamsIsNotNull() {
			addCriterion("request_params is not null");
			return (Criteria) this;
		}

		public Criteria andRequestParamsEqualTo(String value) {
			addCriterion("request_params =", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsNotEqualTo(String value) {
			addCriterion("request_params <>", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsGreaterThan(String value) {
			addCriterion("request_params >", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsGreaterThanOrEqualTo(String value) {
			addCriterion("request_params >=", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsLessThan(String value) {
			addCriterion("request_params <", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsLessThanOrEqualTo(String value) {
			addCriterion("request_params <=", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsLike(String value) {
			addCriterion("request_params like", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsNotLike(String value) {
			addCriterion("request_params not like", value, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsIn(List<String> values) {
			addCriterion("request_params in", values, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsNotIn(List<String> values) {
			addCriterion("request_params not in", values, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsBetween(String value1, String value2) {
			addCriterion("request_params between", value1, value2, "requestParams");
			return (Criteria) this;
		}

		public Criteria andRequestParamsNotBetween(String value1, String value2) {
			addCriterion("request_params not between", value1, value2, "requestParams");
			return (Criteria) this;
		}

		public Criteria andResponseStatusIsNull() {
			addCriterion("response_status is null");
			return (Criteria) this;
		}

		public Criteria andResponseStatusIsNotNull() {
			addCriterion("response_status is not null");
			return (Criteria) this;
		}

		public Criteria andResponseStatusEqualTo(String value) {
			addCriterion("response_status =", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusNotEqualTo(String value) {
			addCriterion("response_status <>", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusGreaterThan(String value) {
			addCriterion("response_status >", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusGreaterThanOrEqualTo(String value) {
			addCriterion("response_status >=", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusLessThan(String value) {
			addCriterion("response_status <", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusLessThanOrEqualTo(String value) {
			addCriterion("response_status <=", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusLike(String value) {
			addCriterion("response_status like", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusNotLike(String value) {
			addCriterion("response_status not like", value, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusIn(List<String> values) {
			addCriterion("response_status in", values, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusNotIn(List<String> values) {
			addCriterion("response_status not in", values, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusBetween(String value1, String value2) {
			addCriterion("response_status between", value1, value2, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andResponseStatusNotBetween(String value1, String value2) {
			addCriterion("response_status not between", value1, value2, "responseStatus");
			return (Criteria) this;
		}

		public Criteria andControllerNameIsNull() {
			addCriterion("controller_name is null");
			return (Criteria) this;
		}

		public Criteria andControllerNameIsNotNull() {
			addCriterion("controller_name is not null");
			return (Criteria) this;
		}

		public Criteria andControllerNameEqualTo(String value) {
			addCriterion("controller_name =", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameNotEqualTo(String value) {
			addCriterion("controller_name <>", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameGreaterThan(String value) {
			addCriterion("controller_name >", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameGreaterThanOrEqualTo(String value) {
			addCriterion("controller_name >=", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameLessThan(String value) {
			addCriterion("controller_name <", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameLessThanOrEqualTo(String value) {
			addCriterion("controller_name <=", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameLike(String value) {
			addCriterion("controller_name like", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameNotLike(String value) {
			addCriterion("controller_name not like", value, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameIn(List<String> values) {
			addCriterion("controller_name in", values, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameNotIn(List<String> values) {
			addCriterion("controller_name not in", values, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameBetween(String value1, String value2) {
			addCriterion("controller_name between", value1, value2, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerNameNotBetween(String value1, String value2) {
			addCriterion("controller_name not between", value1, value2, "controllerName");
			return (Criteria) this;
		}

		public Criteria andControllerMethodIsNull() {
			addCriterion("controller_method is null");
			return (Criteria) this;
		}

		public Criteria andControllerMethodIsNotNull() {
			addCriterion("controller_method is not null");
			return (Criteria) this;
		}

		public Criteria andControllerMethodEqualTo(String value) {
			addCriterion("controller_method =", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodNotEqualTo(String value) {
			addCriterion("controller_method <>", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodGreaterThan(String value) {
			addCriterion("controller_method >", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodGreaterThanOrEqualTo(String value) {
			addCriterion("controller_method >=", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodLessThan(String value) {
			addCriterion("controller_method <", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodLessThanOrEqualTo(String value) {
			addCriterion("controller_method <=", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodLike(String value) {
			addCriterion("controller_method like", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodNotLike(String value) {
			addCriterion("controller_method not like", value, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodIn(List<String> values) {
			addCriterion("controller_method in", values, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodNotIn(List<String> values) {
			addCriterion("controller_method not in", values, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodBetween(String value1, String value2) {
			addCriterion("controller_method between", value1, value2, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andControllerMethodNotBetween(String value1, String value2) {
			addCriterion("controller_method not between", value1, value2, "controllerMethod");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNull() {
			addCriterion("cost_time is null");
			return (Criteria) this;
		}

		public Criteria andCostTimeIsNotNull() {
			addCriterion("cost_time is not null");
			return (Criteria) this;
		}

		public Criteria andCostTimeEqualTo(String value) {
			addCriterion("cost_time =", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotEqualTo(String value) {
			addCriterion("cost_time <>", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThan(String value) {
			addCriterion("cost_time >", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeGreaterThanOrEqualTo(String value) {
			addCriterion("cost_time >=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThan(String value) {
			addCriterion("cost_time <", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLessThanOrEqualTo(String value) {
			addCriterion("cost_time <=", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeLike(String value) {
			addCriterion("cost_time like", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotLike(String value) {
			addCriterion("cost_time not like", value, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeIn(List<String> values) {
			addCriterion("cost_time in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotIn(List<String> values) {
			addCriterion("cost_time not in", values, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeBetween(String value1, String value2) {
			addCriterion("cost_time between", value1, value2, "costTime");
			return (Criteria) this;
		}

		public Criteria andCostTimeNotBetween(String value1, String value2) {
			addCriterion("cost_time not between", value1, value2, "costTime");
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