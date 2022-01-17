package inheritance.product.dbapp;

public class ProductDB {
	

    public static Product getProduct(String productCode) {
    	
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data.
    	
    	Product p = null;
    	
    	if(productCode.equalsIgnoreCase("java")
    			|| productCode.equalsIgnoreCase("jsp")
    			|| productCode.equalsIgnoreCase("mySql")) {
    		
    		Book b= new Book();
    		
    		if(productCode.equalsIgnoreCase("java")) {
    			b.setCode(productCode);
    			b.setDescription("Murachs Java Programming");
    			b.setPrice(56.56);
    			b.setAuthor("Murach");
    		}else if (productCode.equalsIgnoreCase("jsp")) {
    			b.setCode(productCode);
    			b.setDescription("Murach's JSP");
    			b.setPrice(34.45);
    			b.setAuthor("Mike");
    		}else if (productCode.equalsIgnoreCase("jsp")) {
    			b.setCode(productCode);
    			b.setDescription("Mysql");
    			b.setPrice(34.45);
    			b.setAuthor("Mike");
    		}
    		
    		p =b;
    		
    	}else if(productCode.equalsIgnoreCase("Eclipse")) {
    			Software s = new Software();
    			s.setCode(productCode);
    			s.setDescription("Eclipse");
    			s.setPrice(0.00);
    			s.setVersion("4.4.5");
    			p=s;
    		}
    	return p;			
    		}
    	

    }

