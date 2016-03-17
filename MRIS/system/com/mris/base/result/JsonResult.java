package com.mris.base.result;

import net.sf.json.JSONArray;

public class JsonResult {
	private static JSONArray results = new JSONArray();
	public static String getResult(int status, Object result){
		results.clear();
		results.add(0, status);
		results.add(1, result);
		return results.toString();
	}
}
