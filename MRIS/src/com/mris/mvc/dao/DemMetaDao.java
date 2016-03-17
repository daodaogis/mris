package com.mris.mvc.dao;

import java.util.List;

import com.mris.bean.model.DemMeta;

public interface DemMetaDao {
	
	void insert(DemMeta demMeta);
	
	void update(DemMeta demMeta);
	
	void delete(String metaId);
	
	DemMeta getByMetaId(String metaId);
	
	List<DemMeta> getByXZQH(String xzqh, int limit, int offset);
}
