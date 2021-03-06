package inheritance.product.dbapp;

import java.text.NumberFormat;

public class Product {

		private String code;
		private String description;
		private double price;
		protected static int count=0;
		
		public Product() {
			
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			Product.count = count;
		}
		
		public String getPriceFormatted() {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(price);
		}
		@Override
		public String toString() {
		
		return description;
		}
}
