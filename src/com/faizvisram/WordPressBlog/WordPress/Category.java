/**
 * 
 */
package com.faizvisram.WordPressBlog.WordPress;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Faiz Visram
 *
 */
public class Category {

	private String id = null;
	private String slug = null;
	private String title = null;
	private String description = null;
	private String parent = null;
	private String postCount = null;
	
	/**
	 * 
	 */
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(String id, String slug, String title, String description,
			String parent, String postCount) {
		super();
		this.id = id;
		this.slug = slug;
		this.title = title;
		this.description = description;
		this.parent = parent;
		this.postCount = postCount;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}

	/**
	 * @return the postCount
	 */
	public String getPostCount() {
		return postCount;
	}

	/**
	 * @param postCount the postCount to set
	 */
	public void setPostCount(String postCount) {
		this.postCount = postCount;
	}

	public static Category parse(String json) {
		return parse(JsonParser.parseObject(json));
	}

	public static Category parse(Map<String, String> rawCategory) {
		Category category = new Category();
		
		// TODO complete implementation
		
		return category;
	}

	public static List<Category> parseArray(String json) {
		List<Category> categories = new ArrayList<Category>();
		List<Map<String, String>> rawCategories = new ArrayList<Map<String, String>>();
		
		rawCategories = JsonParser.parseArray(json);
		
		for (Map<String, String> rawCategory : rawCategories) {
			categories.add(parse(rawCategory));
		}
		
		return categories;
	}
}
