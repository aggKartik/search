package com.fcgl.madrid.search.dataModel;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

/**
 * Should Product have a countryId?
 *
 * We should have some logic that updates the popularity index based on how many
 * people add it to their shopping list. The shopping list is in a different service.
 * So perhaps we will have the popularityIndex be calculated in the ShoppingList Service
 * and then make an API request to update tha popularityIndex here...
 */
public class Product {

    @Id
    public int id;
    public String name;
    public Double retail_price;
    public Date added_on;
    public Date last_updated;
    public int barcode;
    public String default_image;
    public List<String> categories;
    public float popularityIndex;

    public Product() {}

    public Product(int id, String name, Double retail_price, Date added_on, Date last_updated, int barcode,
			String default_image, List<String> categories) {
		this.id = id;
		this.name = name;
		this.retail_price = retail_price;
		this.added_on = added_on;
		this.last_updated = last_updated;
		this.barcode = barcode;
		this.default_image = default_image;
		this.categories = categories;
		this.popularityIndex = 0;
	}

    public Product(int id, String name, Double retail_price, Date added_on, Date last_updated, int barcode,
			String default_image, List<String> categories, float popularityIndex) {
		this.id = id;
		this.name = name;
		this.retail_price = retail_price;
		this.added_on = added_on;
		this.last_updated = last_updated;
		this.barcode = barcode;
		this.default_image = default_image;
		this.categories = categories;
		this.popularityIndex = popularityIndex;
	}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", retail_price=" + retail_price +
                ", added_on=" + added_on +
                ", last_updated=" + last_updated +
                ", barcode=" + barcode +
                ", default_image='" + default_image + '\'' +
                ", categories=" + categories +
                ", popularityIndex=" + popularityIndex +
                '}';
    }
}
