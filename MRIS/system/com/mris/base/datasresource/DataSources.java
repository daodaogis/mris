package com.mris.base.datasresource;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSources extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		String dataSourceName = DataSourceSwitch.getDataSourceName();
		return dataSourceName;
	}

	@Override
	public void setTargetDataSources(Map<Object, Object> targetDataSources) {
		super.setTargetDataSources(targetDataSources);
	}

	@Override
	protected DataSource determineTargetDataSource() {
		return super.determineTargetDataSource();
	}

}
