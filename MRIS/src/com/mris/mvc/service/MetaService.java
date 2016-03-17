package com.mris.mvc.service;

import java.util.List;

import com.mris.bean.model.DemMeta;

public interface MetaService {

	void addDem(DemMeta demMeta);
	
	DemMeta getDemByMetaId(String demMetaId);
	
	void updateDem(DemMeta demMeta);
	
	void deleteDem(String demMetaId);
	
	List<DemMeta> getDemByXZQH(String xzqh, int limit, int offset);
}
