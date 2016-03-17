package com.mris.mvc.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.mris.bean.model.DemMeta;
import com.mris.mvc.dao.DemMetaDao;

@Repository
public class DemMetaDaoImpl extends BaseDaoImpl implements DemMetaDao{

	@Override
	public void insert(DemMeta demMeta) {
		getSqlSession().selectOne("DemMeta.insert", demMeta);
	}

	@Override
	public void update(DemMeta demMeta) {
		getSqlSession().selectOne("DemMeta.update", demMeta);
	}

	@Override
	public void delete(String metaId) {
		getSqlSession().selectOne("DemMeta.delete", metaId);
	}

	@Override
	public DemMeta getByMetaId(String metaId) {
		return getSqlSession().selectOne("DemMeta.getByMetaId", metaId);
	}

	@Override
	public List<DemMeta> getByXZQH(String xzqh, int limit, int offset) {
		String query = "";
		
		if (StringUtils.isNotEmpty(xzqh)) {
			query = "%" + xzqh + "%";
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("xzqh", query);
		map.put("limit", limit);
		map.put("offset", offset);
		
		
		return getSqlSession().selectList("DemMeta.getByXZQH", map);
	}

}
