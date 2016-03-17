package com.mris.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mris.bean.model.DemMeta;
import com.mris.mvc.dao.DemMetaDao;
import com.mris.mvc.service.MetaService;

@Service
public class MetaServiceImpl implements MetaService{
	
	@Autowired
	private DemMetaDao demMetaDao;

	@Override
	public void addDem(DemMeta demMeta) {
		demMetaDao.insert(demMeta);
	}

	@Override
	public DemMeta getDemByMetaId(String demMetaId) {
		return demMetaDao.getByMetaId(demMetaId);
	}

	@Override
	public void updateDem(DemMeta demMeta) {
		demMetaDao.update(demMeta);
	}

	@Override
	public void deleteDem(String demMetaId) {
		demMetaDao.delete(demMetaId);
	}

	@Override
	public List<DemMeta> getDemByXZQH(String xzqh, int limit, int offset) {
		return demMetaDao.getByXZQH(xzqh, limit, offset);
	}
}
