/**
 * 
 */
package com.faizvisram.WordPressBlog.WordPress;

import java.util.ArrayList;
import java.util.Map;

import android.content.Context;

/**
 * @author Faiz
 *
 */
public class WordPress {
	public static final String API_GET_CATEGORY_INDEX = "get_category_index";
	
	public static final String KEY_STATUS = "status";
	public static final String KEY_CATEGORIES = "categories";
	public static final String KEY_TITLE = "title";
	
	public static final String STATUS_OK = "ok";
	
	/**
	 * 
	 */
	public WordPress() {
		// TODO Auto-generated constructor stub
	}

	public static void getCategories(Context context, final OnReturnListener onReturnListener) {
		ConnectionHandler.execute(context, API_GET_CATEGORY_INDEX, null, new OnReturnListener() {
			
			@Override
			public void onReturn(ArrayList<Map<String, String>> result) {
				if (result != null && result.size() > 0) {
					Map<String, String> item = result.get(0);
					if (STATUS_OK.equals(item.get(KEY_STATUS))) {
						String categoriesArray =  item.get(KEY_CATEGORIES);
						
						ArrayList<Map<String, String>> categories = ConnectionHandler.parseJsonArray(categoriesArray);
						onReturnListener.onReturn(categories);
						
					}
					
				}
			}
		});
	}
}
