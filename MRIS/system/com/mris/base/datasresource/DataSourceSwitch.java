package com.mris.base.datasresource;

public class DataSourceSwitch {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDataSourceName(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	public static String getDataSourceName() {
		return contextHolder.get();
	}

	public static void clearDataSourceName() {
		contextHolder.remove();
	}
}
