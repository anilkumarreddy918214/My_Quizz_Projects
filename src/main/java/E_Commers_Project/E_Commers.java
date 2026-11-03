package E_Commers_Project;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Product {
	int id;
	String name;
	String brand;
	double price;
	String description;
	String category;
	String subCategory;

	Product(int id, String name, String brand, double price, String description, String category, String subCategory) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.description = description;
		this.category = category;
		this.subCategory = subCategory;
	}
}

class Category {
	String name;
	String[] subCategories;

	Category(String name, String[] subCategories) {
		this.name = name;
		this.subCategories = subCategories;
	}
}

public class E_Commers extends JFrame {

	// =========================================================
	// PRODUCT ARRAYS - NO COLLECTIONS USED
	// =========================================================
	static Product[] accessories = new Product[10];
	static Product[] beds = new Product[10];
	static Product[] beverages = new Product[10];
	static Product[] chairs = new Product[10];
	static Product[] clocks = new Product[10];
	static Product[] cookingEssentials = new Product[10];
	static Product[] desktops = new Product[10];
	static Product[] earphones = new Product[10];
	static Product[] fruitsVegetables = new Product[10];
	static Product[] kidsClothing = new Product[10];
	static Product[] laptops = new Product[10];
	static Product[] lighting = new Product[10];
	static Product[] mensClothing = new Product[10];
	static Product[] mobiles = new Product[10];
	static Product[] riceGrains = new Product[10];
	static Product[] shoes = new Product[10];
	static Product[] showpieces = new Product[10];
	static Product[] snacks = new Product[10];
	static Product[] sofas = new Product[10];
	static Product[] speakers = new Product[10];
	static Product[] tables = new Product[10];
	static Product[] vases = new Product[10];
	static Product[] wallDecor = new Product[10];
	static Product[] wardrobes = new Product[10];
	static Product[] womensClothing = new Product[10];

	static Category electronics;
	static Category clothing;
	static Category furniture;
	static Category groceries;
	static Category homeDecor;

	// Cart: simple array instead of ArrayList/Collections
	static Product[] cart = new Product[250];
	static int cartCount = 0;

	JPanel mainPanel;
	JLabel cartLabel;
	String selectedCategory;
	String selectedSubCategory;

	public E_Commers() {
		loadCategories();
		loadProducts();
		createMainWindow();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				E_Commers app = new E_Commers();
				app.setVisible(true);
			}
		});
	}

	// =========================================================
	// LOAD CATEGORIES
	// =========================================================
	static void loadCategories() {
		String[] electronicsSubCategories = { "Mobiles", "Laptops", "Speakers", "Earphones", "Desktops" };
		electronics = new Category("Electronics", electronicsSubCategories);

		String[] clothingSubCategories = { "Men's Clothing", "Women's Clothing", "Kids Clothing", "Shoes",
				"Accessories" };
		clothing = new Category("Clothing", clothingSubCategories);

		String[] furnitureSubCategories = { "Sofas", "Beds", "Tables", "Chairs", "Wardrobes" };
		furniture = new Category("Furniture", furnitureSubCategories);

		String[] grocerySubCategories = { "Rice & Grains", "Fruits & Vegetables", "Snacks", "Beverages",
				"Cooking Essentials" };
		groceries = new Category("Groceries", grocerySubCategories);

		String[] homeDecorSubCategories = { "Wall Decor", "Lighting", "Clocks", "Vases", "Showpieces" };
		homeDecor = new Category("Home Decor", homeDecorSubCategories);

	}

	// =========================================================
	// LOAD ALL 250 PRODUCTS
	// =========================================================
	static void loadProducts() {
		// accessories
		accessories[0] = new Product(1, "Leather Wallet", "WildHorn", 999,

				"Compact leather wallet with multiple card and cash compartments",

				"Clothing", "Accessories");

		accessories[1] = new Product(2, "Men's Leather Belt", "Levis", 1299,

				"Classic leather belt suitable for formal and casual outfits",

				"Clothing", "Accessories");

		accessories[2] = new Product(3, "Women's Handbag", "Caprese", 2499,

				"Stylish handbag with spacious compartments for everyday use",

				"Clothing", "Accessories");

		accessories[3] = new Product(4, "Women's Sunglasses", "Fastrack", 1799,

				"Fashionable sunglasses with UV protection",

				"Clothing", "Accessories");

		accessories[4] = new Product(5, "Men's Sunglasses", "Ray-Ban", 4999,

				"Premium sunglasses with stylish frame and UV protection",

				"Clothing", "Accessories");

		accessories[5] = new Product(6, "Women's Scarf", "Biba", 799,

				"Soft and fashionable scarf suitable for casual outfits",

				"Clothing", "Accessories");

		accessories[6] = new Product(7, "Men's Cap", "Puma", 899,

				"Comfortable casual cap suitable for outdoor activities",

				"Clothing", "Accessories");

		accessories[7] = new Product(8, "Women's Watch", "Fastrack", 2499,

				"Stylish wristwatch suitable for everyday and casual wear",

				"Clothing", "Accessories");

		accessories[8] = new Product(9, "Men's Watch", "Titan", 3999,

				"Classic wristwatch with elegant design for everyday use",

				"Clothing", "Accessories");

		accessories[9] = new Product(10, "Women's Hair Accessories Set", "Accessorize",

				699,

				"Set of stylish hair accessories for everyday use",

				"Clothing", "Accessories");

		// beds
		beds[0] = new Product(1, "Queen Size Wooden Bed", "Wakefit", 24999,

				"Strong wooden queen size bed with modern design",

				"Furniture", "Beds");

		beds[1] = new Product(2, "King Size Wooden Bed", "Urban Ladder", 34999,

				"Spacious king size bed with durable wooden construction",

				"Furniture", "Beds");

		beds[2] = new Product(3, "Hydraulic Storage Bed", "Wakefit", 39999,

				"Modern bed with hydraulic storage space underneath",

				"Furniture", "Beds");

		beds[3] = new Product(4, "Platform Bed", "Pepperfry", 22999,

				"Minimal platform bed with strong wooden frame",

				"Furniture", "Beds");

		beds[4] = new Product(5, "Single Bed", "Nilkamal", 14999,

				"Compact single bed suitable for bedrooms and guest rooms",

				"Furniture", "Beds");

		beds[5] = new Product(6, "Upholstered Bed", "Home Centre", 29999,

				"Comfortable upholstered bed with padded headboard",

				"Furniture", "Beds");

		beds[6] = new Product(7, "Metal Bed Frame", "Durian", 17999,

				"Durable metal bed frame with modern finish",

				"Furniture", "Beds");

		beds[7] = new Product(8, "Kids Wooden Bed", "Pepperfry", 15999,

				"Safe and comfortable wooden bed designed for children",

				"Furniture", "Beds");

		beds[8] = new Product(9, "Canopy Bed", "CasaCraft", 44999,

				"Elegant canopy bed with premium wooden construction",

				"Furniture", "Beds");

		beds[9] = new Product(10, "Storage Platform Bed", "Sleepyhead", 31999,

				"Modern platform bed with convenient storage compartments",

				"Furniture", "Beds");

		// beverages
		beverages[0] = new Product(1, "Tata Tea Gold 500g", "Tata Tea", 299,

				"Premium tea leaves with rich aroma and refreshing taste",

				"Groceries", "Beverages");

		beverages[1] = new Product(2, "Nescafe Classic 100g", "Nescafe", 349,

				"Instant coffee with rich coffee aroma and flavor",

				"Groceries", "Beverages");

		beverages[2] = new Product(3, "Bru Instant Coffee 100g", "Bru", 299,

				"Instant coffee with strong and refreshing taste",

				"Groceries", "Beverages");

		beverages[3] = new Product(4, "Horlicks 500g", "Horlicks", 299,

				"Malted nutritional drink mix for the whole family",

				"Groceries", "Beverages");

		beverages[4] = new Product(5, "Bournvita 500g", "Cadbury", 299,

				"Chocolate flavored malt beverage mix",

				"Groceries", "Beverages");

		beverages[5] = new Product(6, "Real Fruit Juice 1L", "Real", 120,

				"Refreshing fruit juice made with real fruit flavor",

				"Groceries", "Beverages");

		beverages[6] = new Product(7, "Tropicana Orange Juice 1L", "Tropicana", 130,

				"Refreshing orange juice with natural fruit taste",

				"Groceries", "Beverages");

		beverages[7] = new Product(8, "Coconut Water 1L", "Paper Boat", 80,

				"Refreshing coconut water beverage",

				"Groceries", "Beverages");

		beverages[8] = new Product(9, "Green Tea 25 Bags", "Lipton", 180,

				"Refreshing green tea with a light and natural flavor",

				"Groceries", "Beverages");

		beverages[9] = new Product(10, "Lemon Drink 1L", "Paper Boat", 90,

				"Refreshing lemon flavored traditional drink",

				"Groceries", "Beverages");

		// chairs
		chairs[0] = new Product(1, "Office Chair", "Green Soul", 8999,

				"Ergonomic office chair with comfortable back support",

				"Furniture", "Chairs");

		chairs[1] = new Product(2, "Gaming Chair", "Green Soul", 12999,

				"Comfortable gaming chair with adjustable features",

				"Furniture", "Chairs");

		chairs[2] = new Product(3, "Dining Chair", "Urban Ladder", 4999,

				"Stylish dining chair with sturdy wooden construction",

				"Furniture", "Chairs");

		chairs[3] = new Product(4, "Rocking Chair", "Home Centre", 8999,

				"Comfortable rocking chair for relaxation",

				"Furniture", "Chairs");

		chairs[4] = new Product(5, "Plastic Chair", "Nilkamal", 1499,

				"Lightweight and durable plastic chair for everyday use",

				"Furniture", "Chairs");

		chairs[5] = new Product(6, "Accent Chair", "CasaCraft", 9999,

				"Modern accent chair designed for living room interiors",

				"Furniture", "Chairs");

		chairs[6] = new Product(7, "Bar Chair", "Pepperfry", 5999,

				"Stylish bar chair suitable for kitchen counters and bars",

				"Furniture", "Chairs");

		chairs[7] = new Product(8, "Lounge Chair", "Sleepyhead", 10999,

				"Comfortable lounge chair for reading and relaxation",

				"Furniture", "Chairs");

		chairs[8] = new Product(9, "Visitor Chair", "Durian", 3999,

				"Simple and comfortable chair for offices and waiting areas",

				"Furniture", "Chairs");

		chairs[9] = new Product(10, "Folding Chair", "AmazonBasics", 2499,

				"Portable folding chair suitable for home and outdoor use",

				"Furniture", "Chairs");

		// clocks
		clocks[0] = new Product(1, "Round Wall Clock", "Ajanta", 699,

				"Classic round wall clock with easy-to-read numbers",

				"Home Decor", "Clocks");

		clocks[1] = new Product(2, "Digital Wall Clock", "Orpat", 999,

				"Modern digital wall clock with clear display",

				"Home Decor", "Clocks");

		clocks[2] = new Product(3, "Wooden Wall Clock", "Seiko", 1999,

				"Elegant wooden wall clock with classic design",

				"Home Decor", "Clocks");

		clocks[3] = new Product(4, "Modern Designer Clock", "Home Centre", 1499,

				"Contemporary designer wall clock for modern interiors",

				"Home Decor", "Clocks");

		clocks[4] = new Product(5, "Pendulum Clock", "Seiko", 3999,

				"Classic pendulum clock with elegant decorative design",

				"Home Decor", "Clocks");

		clocks[5] = new Product(6, "Table Clock", "Ajanta", 599,

				"Compact table clock suitable for desks and bedside tables",

				"Home Decor", "Clocks");

		clocks[6] = new Product(7, "Roman Numeral Clock", "Homesake", 1299,

				"Decorative wall clock featuring Roman numerals",

				"Home Decor", "Clocks");

		clocks[7] = new Product(8, "Vintage Wall Clock", "CasaCraft", 1799,

				"Vintage style wall clock with decorative finish",

				"Home Decor", "Clocks");

		clocks[8] = new Product(9, "Minimalist Wall Clock", "Ikea", 899,

				"Simple minimalist wall clock for modern interiors",

				"Home Decor", "Clocks");

		clocks[9] = new Product(10, "Large Wall Clock", "Home Centre", 2499,

				"Large decorative wall clock suitable for living rooms",

				"Home Decor", "Clocks");

		// cookingEssentials
		cookingEssentials[0] = new Product(1, "Sunflower Oil 1L", "Fortune", 149,

				"Refined sunflower cooking oil suitable for everyday cooking",

				"Groceries", "Cooking Essentials");

		cookingEssentials[1] = new Product(2, "Groundnut Oil 1L", "Fortune", 179,

				"Premium groundnut oil suitable for Indian cooking",

				"Groceries", "Cooking Essentials");

		cookingEssentials[2] = new Product(3, "Turmeric Powder 200g", "Tata Sampann", 65,

				"Pure turmeric powder for Indian cooking",

				"Groceries", "Cooking Essentials");

		cookingEssentials[3] = new Product(4, "Red Chilli Powder 200g", "Everest", 75,

				"Fine red chilli powder with rich color and flavor",

				"Groceries", "Cooking Essentials");

		cookingEssentials[4] = new Product(5, "Garam Masala 100g", "MDH", 95,

				"Aromatic spice blend for Indian dishes",

				"Groceries", "Cooking Essentials");

		cookingEssentials[5] = new Product(6, "Salt 1kg", "Tata Salt", 30,

				"Iodized salt suitable for everyday cooking",

				"Groceries", "Cooking Essentials");

		cookingEssentials[6] = new Product(7, "Sugar 1kg", "Madhur", 55,

				"Fine white sugar suitable for cooking and beverages",

				"Groceries", "Cooking Essentials");

		cookingEssentials[7] = new Product(8, "Honey 500g", "Dabur", 199,

				"Natural honey suitable for food and beverages",

				"Groceries", "Cooking Essentials");

		cookingEssentials[8] = new Product(9, "Tomato Ketchup 500g", "Kissan", 120,

				"Rich tomato ketchup suitable for snacks and meals",

				"Groceries", "Cooking Essentials");

		cookingEssentials[9] = new Product(10, "Soy Sauce 250ml", "Ching's Secret", 75,

				"Flavorful soy sauce suitable for cooking and noodles",

				"Groceries", "Cooking Essentials");

		// desktops
		desktops[0] = new Product(1,

				"HP All-in-One 24",

				"HP",

				54990,

				"All-in-one desktop with Full HD display for home and office use",

				"Electronics",

				"Desktops");

		desktops[1] = new Product(2,

				"Dell Inspiron Desktop",

				"Dell",

				59990,

				"Powerful desktop computer suitable for work, study and entertainment",

				"Electronics",

				"Desktops");

		desktops[2] = new Product(3,

				"Apple iMac 24",

				"Apple",

				134900,

				"Premium all-in-one desktop with Retina display and Apple silicon chip",

				"Electronics",

				"Desktops");

		desktops[3] = new Product(4,

				"Lenovo IdeaCentre 3",

				"Lenovo",

				42990,

				"Reliable desktop computer designed for everyday home and office tasks",

				"Electronics",

				"Desktops");

		desktops[4] = new Product(5,

				"ASUS S500 Desktop",

				"ASUS",

				48990,

				"Compact desktop computer with powerful performance for office use",

				"Electronics",

				"Desktops");

		desktops[5] = new Product(6,

				"Acer Aspire TC",

				"Acer",

				45990,

				"Tower desktop computer suitable for home, study and productivity",

				"Electronics",

				"Desktops");

		desktops[6] = new Product(7,

				"HP Victus Gaming Desktop",

				"HP",

				89990,

				"Gaming desktop with dedicated graphics and high performance processor",

				"Electronics",

				"Desktops");

		desktops[7] = new Product(8,

				"Dell XPS Desktop",

				"Dell",

				109990,

				"High performance desktop with premium design and powerful hardware",

				"Electronics",

				"Desktops");

		desktops[8] = new Product(9,

				"Lenovo Legion Tower",

				"Lenovo",

				99990,

				"Gaming desktop with dedicated graphics and advanced cooling system",

				"Electronics",

				"Desktops");

		desktops[9] = new Product(10,

				"MSI MAG Infinite",

				"MSI",

				94990,

				"Gaming desktop with powerful processor, graphics and RGB lighting",

				"Electronics",

				"Desktops");

		// earphones
		earphones[0] = new Product(1,

				"AirPods Pro 3",

				"Apple",

				24900,

				"Wireless earbuds with active noise cancellation and premium sound",

				"Electronics",

				"Earphones");

		earphones[1] = new Product(2,

				"Galaxy Buds 3 Pro",

				"Samsung",

				17999,

				"Premium wireless earbuds with noise cancellation and clear audio",

				"Electronics",

				"Earphones");

		earphones[2] = new Product(3,

				"OnePlus Buds Pro 3",

				"OnePlus",

				11999,

				"Wireless earbuds with powerful bass and active noise cancellation",

				"Electronics",

				"Earphones");

		earphones[3] = new Product(4,

				"Sony WF-1000XM5",

				"Sony",

				22990,

				"Premium noise cancelling wireless earbuds with high quality audio",

				"Electronics",

				"Earphones");

		earphones[4] = new Product(5,

				"boAt Airdopes 141",

				"boAt",

				1299,

				"Affordable wireless earbuds with long battery life and deep bass",

				"Electronics",

				"Earphones");

		earphones[5] = new Product(6,

				"Noise Buds N1",

				"Noise",

				1999,

				"Wireless earbuds with active noise cancellation and low latency",

				"Electronics",

				"Earphones");

		earphones[6] = new Product(7,

				"Realme Buds Air 6",

				"Realme",

				3299,

				"Wireless earbuds with noise cancellation and immersive sound",

				"Electronics",

				"Earphones");

		earphones[7] = new Product(8,

				"JBL Tune Buds",

				"JBL",

				4999,

				"True wireless earbuds with powerful JBL sound and noise cancellation",

				"Electronics",

				"Earphones");

		earphones[8] = new Product(9,

				"Oppo Enco Air 4 Pro",

				"Oppo",

				4499,

				"Wireless earbuds with active noise cancellation and long battery backup",

				"Electronics",

				"Earphones");

		earphones[9] = new Product(10,

				"CMF Buds Pro 2",

				"CMF",

				4299,

				"Wireless earbuds with dual drivers and advanced noise cancellation",

				"Electronics",

				"Earphones");

		// fruitsVegetables
		fruitsVegetables[0] = new Product(1, "Fresh Apples 1kg", "Fresho", 199,

				"Fresh and naturally sweet apples suitable for everyday consumption",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[1] = new Product(2, "Fresh Bananas 1kg", "Fresho", 69,

				"Fresh ripe bananas rich in essential nutrients",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[2] = new Product(3, "Fresh Oranges 1kg", "Fresho", 129,

				"Juicy fresh oranges rich in vitamin C",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[3] = new Product(4, "Fresh Mangoes 1kg", "Fresho", 199,

				"Sweet and juicy seasonal mangoes",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[4] = new Product(5, "Fresh Tomatoes 1kg", "Fresho", 49,

				"Fresh red tomatoes suitable for cooking and salads",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[5] = new Product(6, "Fresh Potatoes 1kg", "Fresho", 39,

				"Fresh potatoes suitable for a variety of Indian dishes",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[6] = new Product(7, "Fresh Onions 1kg", "Fresho", 59,

				"Fresh onions suitable for everyday cooking",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[7] = new Product(8, "Fresh Carrots 500g", "Fresho", 49,

				"Fresh crunchy carrots suitable for cooking and salads",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[8] = new Product(9, "Fresh Spinach 250g", "Fresho", 29,

				"Fresh green spinach suitable for healthy meals",

				"Groceries", "Fruits & Vegetables");

		fruitsVegetables[9] = new Product(10, "Fresh Green Peas 500g", "Fresho", 89,

				"Fresh green peas suitable for curries and other dishes",

				"Groceries", "Fruits & Vegetables");

		// kidsClothing
		kidsClothing[0] = new Product(1, "Boys Cotton T-Shirt", "Allen Solly Junior", 799,

				"Comfortable cotton T-shirt for kids everyday wear",

				"Clothing", "Kids Clothing");

		kidsClothing[1] = new Product(2, "Girls Printed Dress", "Hopscotch", 1299,

				"Colorful printed dress suitable for girls casual wear",

				"Clothing", "Kids Clothing");

		kidsClothing[2] = new Product(3, "Boys Denim Jeans", "Levis Kids", 1499,

				"Comfortable denim jeans designed for active kids",

				"Clothing", "Kids Clothing");

		kidsClothing[3] = new Product(4, "Girls Cotton Kurti", "Biba Girls", 999,

				"Soft cotton kurti suitable for casual and festive occasions",

				"Clothing", "Kids Clothing");

		kidsClothing[4] = new Product(5, "Boys Hoodie", "Puma Kids", 1599,

				"Warm and comfortable hoodie for children",

				"Clothing", "Kids Clothing");

		kidsClothing[5] = new Product(6, "Girls Leggings", "Juniors", 699,

				"Stretchable cotton leggings for comfortable everyday use",

				"Clothing", "Kids Clothing");

		kidsClothing[6] = new Product(7, "Boys Shorts", "Nike Kids", 999,

				"Lightweight sports shorts suitable for outdoor activities",

				"Clothing", "Kids Clothing");

		kidsClothing[7] = new Product(8, "Girls Party Frock", "Mothercare", 1799,

				"Beautiful party frock suitable for birthdays and celebrations",

				"Clothing", "Kids Clothing");

		kidsClothing[8] = new Product(9, "Kids Tracksuit", "Adidas Kids", 2299,

				"Comfortable tracksuit suitable for sports and outdoor activities",

				"Clothing", "Kids Clothing");

		kidsClothing[9] = new Product(10, "Kids Winter Jacket", "Monte Carlo Kids", 2499,

				"Warm winter jacket designed for children",

				"Clothing", "Kids Clothing");

		// laptops
		laptops[0] = new Product(1,

				"MacBook Air M4",

				"Apple",

				99900,

				"Lightweight laptop with Apple M4 chip and Retina display",

				"Electronics",

				"Laptops");

		laptops[1] = new Product(2,

				"Dell Inspiron 15",

				"Dell",

				64990,

				"15 inch laptop suitable for work, study and everyday use",

				"Electronics",

				"Laptops");

		laptops[2] = new Product(3,

				"HP Pavilion 15",

				"HP",

				67990,

				"Powerful laptop with Intel processor and Full HD display",

				"Electronics",

				"Laptops");

		laptops[3] = new Product(4,

				"Lenovo IdeaPad Slim 5",

				"Lenovo",

				62990,

				"Slim laptop designed for productivity and entertainment",

				"Electronics",

				"Laptops");

		laptops[4] = new Product(5,

				"ASUS Vivobook 15",

				"ASUS",

				59990,

				"Slim and lightweight laptop for students and professionals",

				"Electronics",

				"Laptops");

		laptops[5] = new Product(6,

				"Acer Aspire 5",

				"Acer",

				54990,

				"Everyday performance laptop with Full HD display",

				"Electronics",

				"Laptops");

		laptops[6] = new Product(7,

				"MSI Modern 14",

				"MSI",

				67990,

				"Compact performance laptop for work and productivity",

				"Electronics",

				"Laptops");

		laptops[7] = new Product(8,

				"Samsung Galaxy Book 5",

				"Samsung",

				89990,

				"Premium laptop with slim design and high resolution display",

				"Electronics",

				"Laptops");

		laptops[8] = new Product(9,

				"Microsoft Surface Laptop",

				"Microsoft",

				99990,

				"Premium Windows laptop with touchscreen and modern design",

				"Electronics",

				"Laptops");

		laptops[9] = new Product(10,

				"Lenovo LOQ Gaming",

				"Lenovo",

				84990,

				"Gaming laptop with dedicated graphics and high refresh rate display",

				"Electronics",

				"Laptops");

		// lighting
		lighting[0] = new Product(1, "Table Lamp", "Philips", 1299,

				"Compact table lamp suitable for bedrooms and study tables",

				"Home Decor", "Lighting");

		lighting[1] = new Product(2, "LED Floor Lamp", "Wipro", 2499,

				"Modern LED floor lamp for living rooms and bedrooms",

				"Home Decor", "Lighting");

		lighting[2] = new Product(3, "Pendant Light", "Havells", 2999,

				"Stylish pendant light suitable for dining and living areas",

				"Home Decor", "Lighting");

		lighting[3] = new Product(4, "Decorative String Lights", "Homesake", 699,

				"Decorative LED string lights for festive and home decoration",

				"Home Decor", "Lighting");

		lighting[4] = new Product(5, "Bedside Lamp", "Ikea", 1599,

				"Simple bedside lamp with modern minimal design",

				"Home Decor", "Lighting");

		lighting[5] = new Product(6, "Wall Light", "Syska", 999,

				"Modern wall light suitable for bedrooms and hallways",

				"Home Decor", "Lighting");

		lighting[6] = new Product(7, "Decorative Lantern", "Homesake", 899,

				"Elegant decorative lantern for indoor home decoration",

				"Home Decor", "Lighting");

		lighting[7] = new Product(8, "Smart LED Bulb", "Philips", 799,

				"Smart LED bulb with adjustable brightness and color options",

				"Home Decor", "Lighting");

		lighting[8] = new Product(9, "Ceiling Light", "Crompton", 1999,

				"Modern LED ceiling light suitable for living rooms",

				"Home Decor", "Lighting");

		lighting[9] = new Product(10, "Night Lamp", "Wipro", 899,

				"Soft light night lamp suitable for bedrooms",

				"Home Decor", "Lighting");

		// mensClothing
		mensClothing[0] = new Product(1, "Men's Cotton T-Shirt", "Levis", 1499,

				"Comfortable regular fit cotton T-shirt for everyday wear",

				"Clothing", "Men's Clothing");

		mensClothing[1] = new Product(2, "Men's Slim Fit Jeans", "Lee", 2499,

				"Stylish slim fit denim jeans suitable for casual occasions",

				"Clothing", "Men's Clothing");

		mensClothing[2] = new Product(3, "Men's Casual Shirt", "Allen Solly", 1999,

				"Premium casual shirt made from comfortable fabric",

				"Clothing", "Men's Clothing");

		mensClothing[3] = new Product(4, "Men's Formal Shirt", "Van Heusen", 2299,

				"Elegant formal shirt suitable for office and professional wear",

				"Clothing", "Men's Clothing");

		mensClothing[4] = new Product(5, "Men's Polo T-Shirt", "Puma", 1799,

				"Classic polo T-shirt with comfortable fit for casual occasions",

				"Clothing", "Men's Clothing");

		mensClothing[5] = new Product(6, "Men's Chino Pants", "Peter England", 2199,

				"Comfortable chino trousers suitable for casual and semi-formal wear",

				"Clothing", "Men's Clothing");

		mensClothing[6] = new Product(7, "Men's Denim Jacket", "Roadster", 2999,

				"Stylish denim jacket suitable for casual outdoor wear",

				"Clothing", "Men's Clothing");

		mensClothing[7] = new Product(8, "Men's Hoodie", "Adidas", 3499,

				"Warm and comfortable hoodie for casual everyday use",

				"Clothing", "Men's Clothing");

		mensClothing[8] = new Product(9, "Men's Track Pants", "Nike", 2499,

				"Comfortable sports track pants suitable for workouts and casual wear",

				"Clothing", "Men's Clothing");

		mensClothing[9] = new Product(10, "Men's Kurta", "Manyavar", 2999,

				"Traditional men's kurta suitable for festivals and special occasions",

				"Clothing", "Men's Clothing");

		// mobiles
		mobiles[0] = new Product(1,

				"Galaxy S25",

				"Samsung",

				79999,

				"5G Android smartphone with advanced camera and AMOLED display",

				"Electronics",

				"Mobiles");

		mobiles[1] = new Product(2,

				"iPhone 16",

				"Apple",

				79900,

				"Premium smartphone with powerful processor and advanced camera",

				"Electronics",

				"Mobiles");

		mobiles[2] = new Product(3,

				"OnePlus 13",

				"OnePlus",

				69999,

				"High performance Android smartphone with fast charging",

				"Electronics",

				"Mobiles");

		mobiles[3] = new Product(4,

				"Pixel 9",

				"Google",

				74999,

				"Google smartphone with excellent camera and clean Android experience",

				"Electronics",

				"Mobiles");

		mobiles[4] = new Product(5,

				"Xiaomi 15",

				"Xiaomi",

				64999,

				"Powerful Android smartphone with high resolution display",

				"Electronics",

				"Mobiles");

		mobiles[5] = new Product(6,

				"Vivo V40",

				"Vivo",

				34999,

				"Stylish smartphone with AMOLED display and high quality camera",

				"Electronics",

				"Mobiles");

		mobiles[6] = new Product(7,

				"Oppo Reno 13",

				"Oppo",

				37999,

				"Modern smartphone with powerful performance and camera features",

				"Electronics",

				"Mobiles");

		mobiles[7] = new Product(8,

				"Realme GT 7",

				"Realme",

				39999,

				"Performance focused smartphone with fast charging technology",

				"Electronics",

				"Mobiles");

		mobiles[8] = new Product(9,

				"Nothing Phone 3",

				"Nothing",

				44999,

				"Unique smartphone design with smooth display and modern features",

				"Electronics",

				"Mobiles");

		mobiles[9] = new Product(10,

				"Motorola Edge 60",

				"Motorola",

				29999,

				"Premium design smartphone with high quality display and camera",

				"Electronics",

				"Mobiles");

		// riceGrains
		riceGrains[0] = new Product(1, "Basmati Rice 5kg", "India Gate", 699,

				"Premium long grain basmati rice suitable for everyday cooking",

				"Groceries", "Rice & Grains");

		riceGrains[1] = new Product(2, "Sona Masoori Rice 5kg", "Daawat", 499,

				"Premium quality rice suitable for daily meals",

				"Groceries", "Rice & Grains");

		riceGrains[2] = new Product(3, "Brown Rice 1kg", "India Gate", 199,

				"Healthy whole grain brown rice rich in dietary fiber",

				"Groceries", "Rice & Grains");

		riceGrains[3] = new Product(4, "Wheat Flour 5kg", "Aashirvaad", 299,

				"Fresh whole wheat flour suitable for making rotis and chapatis",

				"Groceries", "Rice & Grains");

		riceGrains[4] = new Product(5, "Multigrain Atta 5kg", "Pillsbury", 349,

				"Nutritious multigrain flour made from a blend of grains",

				"Groceries", "Rice & Grains");

		riceGrains[5] = new Product(6, "Toor Dal 1kg", "Tata Sampann", 189,

				"Premium quality pigeon peas suitable for everyday cooking",

				"Groceries", "Rice & Grains");

		riceGrains[6] = new Product(7, "Moong Dal 1kg", "Tata Sampann", 159,

				"High quality yellow moong dal for healthy meals",

				"Groceries", "Rice & Grains");

		riceGrains[7] = new Product(8, "Chana Dal 1kg", "Fortune", 139,

				"Clean and nutritious split chickpeas for everyday cooking",

				"Groceries", "Rice & Grains");

		riceGrains[8] = new Product(9, "Rajma 1kg", "Tata Sampann", 179,

				"Premium red kidney beans suitable for Indian recipes",

				"Groceries", "Rice & Grains");

		riceGrains[9] = new Product(10, "Quinoa 500g", "Organic Tattva", 299,

				"Nutritious quinoa suitable for healthy meals and salads",

				"Groceries", "Rice & Grains");

		// shoes
		shoes[0] = new Product(1, "Men's Running Shoes", "Nike", 3999,

				"Lightweight running shoes designed for daily workouts",

				"Clothing", "Shoes");

		shoes[1] = new Product(2, "Women's Running Shoes", "Adidas", 3499,

				"Comfortable sports shoes suitable for running and walking",

				"Clothing", "Shoes");

		shoes[2] = new Product(3, "Men's Casual Sneakers", "Puma", 2999,

				"Stylish casual sneakers for everyday wear",

				"Clothing", "Shoes");

		shoes[3] = new Product(4, "Women's Casual Sneakers", "Skechers", 3999,

				"Comfortable sneakers with modern design for everyday use",

				"Clothing", "Shoes");

		shoes[4] = new Product(5, "Men's Formal Shoes", "Bata", 2499,

				"Classic formal shoes suitable for office and professional wear",

				"Clothing", "Shoes");

		shoes[5] = new Product(6, "Women's Heels", "Metro", 2799,

				"Elegant high heels suitable for parties and special occasions",

				"Clothing", "Shoes");

		shoes[6] = new Product(7, "Men's Sandals", "Woodland", 1999,

				"Durable sandals suitable for casual outdoor use",

				"Clothing", "Shoes");

		shoes[7] = new Product(8, "Women's Flats", "Liberty", 1499,

				"Comfortable flat footwear suitable for everyday wear",

				"Clothing", "Shoes");

		shoes[8] = new Product(9, "Kids Sports Shoes", "Campus", 1299,

				"Lightweight sports shoes designed for active children",

				"Clothing", "Shoes");

		shoes[9] = new Product(10, "Men's Loafers", "Red Tape", 2299,

				"Stylish slip-on loafers suitable for casual and semi-formal wear",

				"Clothing", "Shoes");

		// showpieces
		showpieces[0] = new Product(1, "Buddha Showpiece", "CraftVatika", 999,

				"Decorative Buddha statue suitable for peaceful home interiors",

				"Home Decor", "Showpieces");

		showpieces[1] = new Product(2, "Elephant Showpiece", "Homesake", 799,

				"Decorative elephant figurine for home decoration",

				"Home Decor", "Showpieces");

		showpieces[2] = new Product(3, "Horse Statue", "CasaCraft", 1499,

				"Elegant horse statue suitable for living room decoration",

				"Home Decor", "Showpieces");

		showpieces[3] = new Product(4, "Abstract Art Sculpture", "Urban Ladder", 1999,

				"Modern abstract sculpture for contemporary interiors",

				"Home Decor", "Showpieces");

		showpieces[4] = new Product(5, "Dancing Couple Statue", "CraftVatika", 1299,

				"Decorative dancing couple statue with artistic design",

				"Home Decor", "Showpieces");

		showpieces[5] = new Product(6, "Owl Decorative Figurine", "Home Centre", 699,

				"Decorative owl figurine suitable for shelves and tables",

				"Home Decor", "Showpieces");

		showpieces[6] = new Product(7, "Ganesha Showpiece", "CraftVatika", 1199,

				"Decorative Ganesha statue suitable for home interiors",

				"Home Decor", "Showpieces");

		showpieces[7] = new Product(8, "Family Figurine Set", "Homesake", 899,

				"Decorative family figurine set for living room shelves",

				"Home Decor", "Showpieces");

		showpieces[8] = new Product(9, "Crystal Tree Showpiece", "CasaCraft", 999,

				"Decorative crystal tree suitable for tables and shelves",

				"Home Decor", "Showpieces");

		showpieces[9] = new Product(10, "Decorative Globe", "AmazonBasics", 1499,

				"Stylish decorative globe suitable for study rooms and offices",

				"Home Decor", "Showpieces");

		// snacks
		snacks[0] = new Product(1, "Potato Chips", "Lay's", 30,

				"Crispy potato chips with delicious seasoning",

				"Groceries", "Snacks");

		snacks[1] = new Product(2, "Aloo Bhujia", "Haldiram's", 85,

				"Crispy and spicy traditional Indian snack",

				"Groceries", "Snacks");

		snacks[2] = new Product(3, "Cream Biscuits", "Britannia", 40,

				"Crunchy biscuits filled with delicious cream",

				"Groceries", "Snacks");

		snacks[3] = new Product(4, "Digestive Biscuits", "McVitie's", 120,

				"Crunchy digestive biscuits suitable for tea time",

				"Groceries", "Snacks");

		snacks[4] = new Product(5, "Chocolate Cookies", "Sunfeast", 50,

				"Crunchy cookies with rich chocolate flavor",

				"Groceries", "Snacks");

		snacks[5] = new Product(6, "Namkeen Mixture", "Bikaji", 90,

				"Traditional Indian namkeen mixture with crunchy texture",

				"Groceries", "Snacks");

		snacks[6] = new Product(7, "Roasted Peanuts", "Haldiram's", 70,

				"Crunchy roasted peanuts with light seasoning",

				"Groceries", "Snacks");

		snacks[7] = new Product(8, "Popcorn", "Act II", 60,

				"Easy to prepare popcorn for movie and snack time",

				"Groceries", "Snacks");

		snacks[8] = new Product(9, "Masala Makhana", "Too Yumm", 110,

				"Roasted fox nuts with delicious masala seasoning",

				"Groceries", "Snacks");

		snacks[9] = new Product(10, "Chocolate Bar", "Cadbury", 50,

				"Creamy milk chocolate bar for a sweet snack",

				"Groceries", "Snacks");

		// sofas
		sofas[0] = new Product(1, "3 Seater Fabric Sofa", "Urban Ladder", 24999,

				"Comfortable three seater sofa with soft fabric upholstery",

				"Furniture", "Sofas");

		sofas[1] = new Product(2, "L Shape Sofa", "Wakefit", 32999,

				"Modern L shaped sofa suitable for living rooms",

				"Furniture", "Sofas");

		sofas[2] = new Product(3, "2 Seater Sofa", "Home Centre", 18999,

				"Compact two seater sofa for small living spaces",

				"Furniture", "Sofas");

		sofas[3] = new Product(4, "Recliner Sofa", "Sleepyhead", 27999,

				"Comfortable reclining sofa designed for relaxation",

				"Furniture", "Sofas");

		sofas[4] = new Product(5, "Leather Sofa", "Durian", 45999,

				"Premium leather sofa with durable construction",

				"Furniture", "Sofas");

		sofas[5] = new Product(6, "Sectional Sofa", "Pepperfry", 39999,

				"Spacious sectional sofa suitable for large living rooms",

				"Furniture", "Sofas");

		sofas[6] = new Product(7, "Wooden Frame Sofa", "Nilkamal", 21999,

				"Strong wooden frame sofa with comfortable cushions",

				"Furniture", "Sofas");

		sofas[7] = new Product(8, "Luxury Velvet Sofa", "CasaCraft", 36999,

				"Elegant velvet sofa with premium modern design",

				"Furniture", "Sofas");

		sofas[8] = new Product(9, "Sofa Cum Bed", "Wakefit", 29999,

				"Multi-purpose sofa that can be converted into a bed",

				"Furniture", "Sofas");

		sofas[9] = new Product(10, "Single Seater Sofa", "Urban Ladder", 12999,

				"Comfortable single seater sofa for reading and relaxation",

				"Furniture", "Sofas");

		// speakers
		speakers[0] = new Product(1,

				"JBL Flip 7",

				"JBL",

				14999,

				"Portable Bluetooth speaker with powerful sound and waterproof design",

				"Electronics",

				"Speakers");

		speakers[1] = new Product(2,

				"Sony SRS-XB100",

				"Sony",

				4990,

				"Compact Bluetooth speaker with clear sound and long battery life",

				"Electronics",

				"Speakers");

		speakers[2] = new Product(3,

				"Bose SoundLink Flex",

				"Bose",

				15900,

				"Portable premium speaker with rich sound and water resistance",

				"Electronics",

				"Speakers");

		speakers[3] = new Product(4,

				"Marshall Emberton III",

				"Marshall",

				17999,

				"Premium wireless speaker with powerful audio and classic design",

				"Electronics",

				"Speakers");

		speakers[4] = new Product(5,

				"Boat Stone 1200",

				"boAt",

				4999,

				"Powerful Bluetooth speaker with deep bass and RGB lights",

				"Electronics",

				"Speakers");

		speakers[5] = new Product(6,

				"Tribit StormBox",

				"Tribit",

				6999,

				"Portable Bluetooth speaker with enhanced bass and long battery life",

				"Electronics",

				"Speakers");

		speakers[6] = new Product(7,

				"Ultimate Ears Wonderboom 4",

				"Ultimate Ears",

				9999,

				"Compact waterproof speaker with 360 degree sound",

				"Electronics",

				"Speakers");

		speakers[7] = new Product(8,

				"Zebronics Zeb-Sound Feast",

				"Zebronics",

				3499,

				"Wireless speaker with powerful audio and attractive design",

				"Electronics",

				"Speakers");

		speakers[8] = new Product(9,

				"Portronics Sound Drum",

				"Portronics",

				2999,

				"Portable Bluetooth speaker with deep bass and rechargeable battery",

				"Electronics",

				"Speakers");

		speakers[9] = new Product(10,

				"Anker Soundcore 3",

				"Anker",

				6999,

				"Bluetooth speaker with strong bass and extended battery backup",

				"Electronics",

				"Speakers");

		// tables
		tables[0] = new Product(1, "4 Seater Dining Table", "Urban Ladder", 18999,

				"Wooden dining table suitable for four people",

				"Furniture", "Tables");

		tables[1] = new Product(2, "6 Seater Dining Table", "Home Centre", 26999,

				"Spacious dining table suitable for family meals",

				"Furniture", "Tables");

		tables[2] = new Product(3, "Study Table", "Wakefit", 9999,

				"Compact study table suitable for home and office use",

				"Furniture", "Tables");

		tables[3] = new Product(4, "Computer Desk", "Pepperfry", 11999,

				"Modern computer desk with storage space",

				"Furniture", "Tables");

		tables[4] = new Product(5, "Coffee Table", "Urban Ladder", 7999,

				"Stylish coffee table suitable for living rooms",

				"Furniture", "Tables");

		tables[5] = new Product(6, "Console Table", "CasaCraft", 13999,

				"Elegant console table for entryways and living rooms",

				"Furniture", "Tables");

		tables[6] = new Product(7, "Side Table", "Nilkamal", 4999,

				"Compact side table suitable for bedrooms and living rooms",

				"Furniture", "Tables");

		tables[7] = new Product(8, "Round Dining Table", "Durian", 15999,

				"Modern round dining table with sturdy construction",

				"Furniture", "Tables");

		tables[8] = new Product(9, "Folding Table", "AmazonBasics", 5999,

				"Portable folding table suitable for home and office use",

				"Furniture", "Tables");

		tables[9] = new Product(10, "Office Work Table", "Wakefit", 12999,

				"Spacious work table designed for office and study use",

				"Furniture", "Tables");

		// vases
		vases[0] = new Product(1, "Ceramic Flower Vase", "Home Centre", 799,

				"Elegant ceramic vase suitable for flowers and home decoration",

				"Home Decor", "Vases");

		vases[1] = new Product(2, "Glass Flower Vase", "Homesake", 699,

				"Transparent glass vase with elegant decorative design",

				"Home Decor", "Vases");

		vases[2] = new Product(3, "Metal Decorative Vase", "CasaCraft", 1299,

				"Modern metal vase suitable for contemporary home interiors",

				"Home Decor", "Vases");

		vases[3] = new Product(4, "Ceramic Bud Vase", "Ikea", 599,

				"Small ceramic vase suitable for single flowers",

				"Home Decor", "Vases");

		vases[4] = new Product(5, "Set of 3 Vases", "Home Centre", 1499,

				"Decorative set of three vases for tables and shelves",

				"Home Decor", "Vases");

		vases[5] = new Product(6, "Golden Decorative Vase", "CraftVatika", 999,

				"Decorative golden finish vase for elegant interiors",

				"Home Decor", "Vases");

		vases[6] = new Product(7, "Wooden Vase", "Homesake", 899,

				"Handcrafted wooden vase with natural finish",

				"Home Decor", "Vases");

		vases[7] = new Product(8, "Tall Floor Vase", "Urban Ladder", 2499,

				"Large decorative floor vase suitable for living rooms",

				"Home Decor", "Vases");

		vases[8] = new Product(9, "Ceramic Blue Vase", "CasaCraft", 1099,

				"Stylish blue ceramic vase for home decoration",

				"Home Decor", "Vases");

		vases[9] = new Product(10, "Decorative Bottle Vase", "Home Centre", 899,

				"Decorative bottle-shaped vase suitable for tables and shelves",

				"Home Decor", "Vases");

		// wallDecor
		wallDecor[0] = new Product(1, "Abstract Wall Painting", "Home Centre", 1499,

				"Modern abstract painting for living room and bedroom walls",

				"Home Decor", "Wall Decor");

		wallDecor[1] = new Product(2, "Family Photo Frame", "AmazonBasics", 799,

				"Elegant multi-photo frame for displaying family memories",

				"Home Decor", "Wall Decor");

		wallDecor[2] = new Product(3, "Decorative Wall Mirror", "Urban Ladder", 2499,

				"Stylish decorative mirror suitable for living room interiors",

				"Home Decor", "Wall Decor");

		wallDecor[3] = new Product(4, "Metal Wall Art", "CasaCraft", 1999,

				"Modern metal wall decoration with artistic design",

				"Home Decor", "Wall Decor");

		wallDecor[4] = new Product(5, "Wooden Wall Shelf", "Wakefit", 1299,

				"Decorative wooden shelf for displaying small items",

				"Home Decor", "Wall Decor");

		wallDecor[5] = new Product(6, "Wall Hanging", "CraftVatika", 699,

				"Handcrafted decorative wall hanging for home interiors",

				"Home Decor", "Wall Decor");

		wallDecor[6] = new Product(7, "Decorative Wall Clock", "Ajanta", 999,

				"Stylish wall clock with modern decorative design",

				"Home Decor", "Wall Decor");

		wallDecor[7] = new Product(8, "Floral Wall Sticker", "HomeTown", 499,

				"Decorative floral wall stickers for bedrooms and living rooms",

				"Home Decor", "Wall Decor");

		wallDecor[8] = new Product(9, "Geometric Wall Decor", "Home Centre", 1199,

				"Modern geometric decoration suitable for contemporary interiors",

				"Home Decor", "Wall Decor");

		wallDecor[9] = new Product(10, "Decorative Photo Collage", "Flipkart SmartBuy", 899,

				"Multi-photo collage frame for displaying memorable photographs",

				"Home Decor", "Wall Decor");

		// wardrobes
		wardrobes[0] = new Product(1, "2 Door Wooden Wardrobe", "Wakefit", 22999,

				"Spacious wooden wardrobe with two doors and storage shelves",

				"Furniture", "Wardrobes");

		wardrobes[1] = new Product(2, "3 Door Wardrobe", "Urban Ladder", 32999,

				"Large wardrobe with multiple shelves and hanging space",

				"Furniture", "Wardrobes");

		wardrobes[2] = new Product(3, "Sliding Door Wardrobe", "Home Centre", 35999,

				"Modern sliding door wardrobe with spacious storage",

				"Furniture", "Wardrobes");

		wardrobes[3] = new Product(4, "Mirror Wardrobe", "Pepperfry", 29999,

				"Stylish wardrobe with full-length mirror and storage space",

				"Furniture", "Wardrobes");

		wardrobes[4] = new Product(5, "Kids Wardrobe", "Nilkamal", 15999,

				"Compact wardrobe designed for children's rooms",

				"Furniture", "Wardrobes");

		wardrobes[5] = new Product(6, "Metal Wardrobe", "Godrej", 18999,

				"Strong metal wardrobe suitable for home and office use",

				"Furniture", "Wardrobes");

		wardrobes[6] = new Product(7, "4 Door Wardrobe", "Durian", 44999,

				"Large four door wardrobe with extensive storage space",

				"Furniture", "Wardrobes");

		wardrobes[7] = new Product(8, "Corner Wardrobe", "CasaCraft", 27999,

				"Space-saving corner wardrobe with modern design",

				"Furniture", "Wardrobes");

		wardrobes[8] = new Product(9, "Compact Wardrobe", "Sleepyhead", 19999,

				"Compact wardrobe suitable for bedrooms with limited space",

				"Furniture", "Wardrobes");

		wardrobes[9] = new Product(10, "Premium Wooden Wardrobe", "Urban Ladder", 49999,

				"Premium wooden wardrobe with multiple storage compartments",

				"Furniture", "Wardrobes");

		// womensClothing
		womensClothing[0] = new Product(1, "Women's Cotton Kurti", "Biba", 1599,

				"Comfortable cotton kurti suitable for everyday wear",

				"Clothing", "Women's Clothing");

		womensClothing[1] = new Product(2, "Women's Saree", "Sangria", 2499,

				"Elegant saree suitable for festivals and special occasions",

				"Clothing", "Women's Clothing");

		womensClothing[2] = new Product(3, "Women's Casual Top", "Only", 1299,

				"Stylish casual top made from comfortable fabric",

				"Clothing", "Women's Clothing");

		womensClothing[3] = new Product(4, "Women's Denim Jeans", "Levis", 2699,

				"Modern slim fit denim jeans for casual everyday wear",

				"Clothing", "Women's Clothing");

		womensClothing[4] = new Product(5, "Women's Dress", "ONLY", 2999,

				"Stylish western dress suitable for casual and party occasions",

				"Clothing", "Women's Clothing");

		womensClothing[5] = new Product(6, "Women's Palazzo Pants", "Libas", 1799,

				"Comfortable wide-leg palazzo pants for casual wear",

				"Clothing", "Women's Clothing");

		womensClothing[6] = new Product(7, "Women's Blazer", "Van Heusen", 3999,

				"Elegant formal blazer suitable for office and professional wear",

				"Clothing", "Women's Clothing");

		womensClothing[7] = new Product(8, "Women's Hoodie", "Puma", 2799,

				"Warm casual hoodie with comfortable fit",

				"Clothing", "Women's Clothing");

		womensClothing[8] = new Product(9, "Women's Lehenga", "Aurelia", 4999,

				"Traditional ethnic lehenga suitable for weddings and celebrations",

				"Clothing", "Women's Clothing");

		womensClothing[9] = new Product(10, "Women's Night Suit", "Clovia", 1499,

				"Soft and comfortable night suit for everyday use",

				"Clothing", "Women's Clothing");

	}

	// =========================================================
	// STEP 1 - MAIN SWING WINDOW
	// =========================================================
	void createMainWindow() {
		setTitle("E-Commerce Application");
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		showHomeScreen();
	}

	void showHomeScreen() {
		mainPanel = new JPanel(new BorderLayout(15, 15));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JPanel topPanel = new JPanel(new BorderLayout());
		JLabel title = new JLabel("E-COMMERCE APPLICATION", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 30));

		cartLabel = new JLabel("Cart: " + cartCount);
		cartLabel.setFont(new Font("Arial", Font.BOLD, 16));

		JButton cartButton = new JButton("View Cart");
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCartScreen();
			}
		});

		JPanel cartPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		cartPanel.add(cartLabel);
		cartPanel.add(cartButton);

		topPanel.add(title, BorderLayout.CENTER);
		topPanel.add(cartPanel, BorderLayout.EAST);

		JPanel categoryPanel = new JPanel(new GridLayout(5, 1, 15, 15));

		addCategoryButton(categoryPanel, "Electronics");
		addCategoryButton(categoryPanel, "Clothing");
		addCategoryButton(categoryPanel, "Furniture");
		addCategoryButton(categoryPanel, "Groceries");
		addCategoryButton(categoryPanel, "Home Decor");

		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(categoryPanel, BorderLayout.CENTER);

		setContentPane(mainPanel);
		revalidate();
		repaint();
	}

	void addCategoryButton(JPanel panel, final String categoryName) {
		JButton button = new JButton(categoryName);
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setPreferredSize(new Dimension(300, 70));

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCategory = categoryName;
				showSubCategoryScreen(categoryName);
			}
		});

		panel.add(button);
	}

	// =========================================================
	// STEP 2 & 3 - CATEGORY / SUBCATEGORY SELECTION
	// =========================================================
	void showSubCategoryScreen(String categoryName) {
		mainPanel = new JPanel(new BorderLayout(15, 15));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JLabel title = new JLabel(categoryName + " - Select Subcategory", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 26));

		JPanel subPanel = new JPanel(new GridLayout(0, 2, 15, 15));
		String[] subs = getSubCategories(categoryName);

		for (int i = 0; i < subs.length; i++) {
			final String sub = subs[i];
			JButton button = new JButton(sub);
			button.setFont(new Font("Arial", Font.BOLD, 18));

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					selectedSubCategory = sub;
					showProductScreen(selectedCategory, selectedSubCategory);
				}
			});

			subPanel.add(button);
		}

		JButton backButton = new JButton("Back to Categories");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showHomeScreen();
			}
		});

		mainPanel.add(title, BorderLayout.NORTH);
		mainPanel.add(new JScrollPane(subPanel), BorderLayout.CENTER);
		mainPanel.add(backButton, BorderLayout.SOUTH);

		setContentPane(mainPanel);
		revalidate();
		repaint();
	}

	String[] getSubCategories(String categoryName) {
		if (categoryName.equals("Electronics")) {
			return electronics.subCategories;
		} else if (categoryName.equals("Clothing")) {
			return clothing.subCategories;
		} else if (categoryName.equals("Furniture")) {
			return furniture.subCategories;
		} else if (categoryName.equals("Groceries")) {
			return groceries.subCategories;
		} else {
			return homeDecor.subCategories;
		}
	}

	// =========================================================
	// STEP 4 - PRODUCT SCREEN
	// =========================================================
	void showProductScreen(String categoryName, String subCategoryName) {
		mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

		JPanel topPanel = new JPanel(new BorderLayout());
		JLabel title = new JLabel(categoryName + " > " + subCategoryName, SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 24));

		JButton cartButton = new JButton("View Cart (" + cartCount + ")");
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCartScreen();
			}
		});

		topPanel.add(title, BorderLayout.CENTER);
		topPanel.add(cartButton, BorderLayout.EAST);

		JPanel productPanel = new JPanel(new GridLayout(0, 2, 12, 12));
		Product[] products = getProducts(categoryName, subCategoryName);

		for (int i = 0; i < products.length; i++) {
			productPanel.add(createProductCard(products[i]));
		}

		JButton backButton = new JButton("Back to Subcategories");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSubCategoryScreen(selectedCategory);
			}
		});

		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(new JScrollPane(productPanel), BorderLayout.CENTER);
		mainPanel.add(backButton, BorderLayout.SOUTH);

		setContentPane(mainPanel);
		revalidate();
		repaint();
	}

	Product[] getProducts(String categoryName, String subCategoryName) {
		if (categoryName.equals("Electronics")) {
			if (subCategoryName.equals("Mobiles"))
				return mobiles;
			if (subCategoryName.equals("Laptops"))
				return laptops;
			if (subCategoryName.equals("Speakers"))
				return speakers;
			if (subCategoryName.equals("Earphones"))
				return earphones;
			return desktops;
		}

		if (categoryName.equals("Clothing")) {
			if (subCategoryName.equals("Men's Clothing"))
				return mensClothing;
			if (subCategoryName.equals("Women's Clothing"))
				return womensClothing;
			if (subCategoryName.equals("Kids Clothing"))
				return kidsClothing;
			if (subCategoryName.equals("Shoes"))
				return shoes;
			return accessories;
		}

		if (categoryName.equals("Furniture")) {
			if (subCategoryName.equals("Sofas"))
				return sofas;
			if (subCategoryName.equals("Beds"))
				return beds;
			if (subCategoryName.equals("Tables"))
				return tables;
			if (subCategoryName.equals("Chairs"))
				return chairs;
			return wardrobes;
		}

		if (categoryName.equals("Groceries")) {
			if (subCategoryName.equals("Rice & Grains"))
				return riceGrains;
			if (subCategoryName.equals("Fruits & Vegetables"))
				return fruitsVegetables;
			if (subCategoryName.equals("Snacks"))
				return snacks;
			if (subCategoryName.equals("Beverages"))
				return beverages;
			return cookingEssentials;
		}

		if (subCategoryName.equals("Wall Decor"))
			return wallDecor;
		if (subCategoryName.equals("Lighting"))
			return lighting;
		if (subCategoryName.equals("Clocks"))
			return clocks;
		if (subCategoryName.equals("Vases"))
			return vases;
		return showpieces;
	}

	JPanel createProductCard(final Product product) {
		JPanel card = new JPanel(new BorderLayout(8, 8));
		card.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		JTextArea details = new JTextArea();
		details.setEditable(false);
		details.setLineWrap(true);
		details.setWrapStyleWord(true);
		details.setFont(new Font("Arial", Font.PLAIN, 14));
		details.setText("Product ID: " + product.id + "\nName: " + product.name + "\nBrand: " + product.brand
				+ "\nPrice: ₹" + String.format("%.2f", product.price) + "\nDescription: " + product.description);

		JButton addButton = new JButton("Add to Cart");
		addButton.setFont(new Font("Arial", Font.BOLD, 14));

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToCart(product);
			}
		});

		card.add(new JScrollPane(details), BorderLayout.CENTER);
		card.add(addButton, BorderLayout.SOUTH);

		return card;
	}

	void addToCart(Product product) {
		if (cartCount < cart.length) {
			cart[cartCount] = product;
			cartCount++;
			updateCartLabel();

			JOptionPane.showMessageDialog(this, product.name + " added to cart!", "Cart",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	void updateCartLabel() {
		if (cartLabel != null) {
			cartLabel.setText("Cart: " + cartCount);
		}
	}

	// =========================================================
	// STEP 5 - CART
	// =========================================================
	void showCartScreen() {
		mainPanel = new JPanel(new BorderLayout(15, 15));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JLabel title = new JLabel("SHOPPING CART", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 26));

		JPanel itemPanel = new JPanel();
		itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));

		double total = 0;

		if (cartCount == 0) {
			JLabel empty = new JLabel("Your cart is empty.", SwingConstants.CENTER);
			empty.setFont(new Font("Arial", Font.BOLD, 18));
			itemPanel.add(empty);
		} else {
			for (int i = 0; i < cartCount; i++) {
				Product p = cart[i];
				JLabel item = new JLabel(
						(i + 1) + ". " + p.name + " | " + p.brand + " | ₹" + String.format("%.2f", p.price));
				item.setFont(new Font("Arial", Font.PLAIN, 16));
				item.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
				itemPanel.add(item);

				total += p.price;
			}
		}

		JLabel totalLabel = new JLabel("Total Amount: ₹" + String.format("%.2f", total));
		totalLabel.setFont(new Font("Arial", Font.BOLD, 20));

		JButton checkoutButton = new JButton("Checkout");
		checkoutButton.setFont(new Font("Arial", Font.BOLD, 16));
		checkoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cartCount == 0) {
					JOptionPane.showMessageDialog(E_Commers.this, "Your cart is empty.", "Checkout",
							JOptionPane.WARNING_MESSAGE);
				} else {
					showPaymentScreen();
				}
			}
		});

		JButton continueButton = new JButton("Continue Shopping");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showHomeScreen();
			}
		});

		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bottomPanel.add(totalLabel);
		bottomPanel.add(continueButton);
		bottomPanel.add(checkoutButton);

		mainPanel.add(title, BorderLayout.NORTH);
		mainPanel.add(new JScrollPane(itemPanel), BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		setContentPane(mainPanel);
		revalidate();
		repaint();
	}

	// =========================================================
	// STEP 6 - DUMMY PAYMENT
	// =========================================================
	void showPaymentScreen() {
		// =========================
		// PAYMENT SCREEN - DESIGN
		// =========================
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBackground(new Color(245, 247, 250));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(25, 80, 25, 80));

		JLabel title = new JLabel("SECURE PAYMENT", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 30));
		title.setForeground(new Color(35, 45, 60));
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

		JPanel paymentCard = new JPanel(new BorderLayout(20, 20));
		paymentCard.setBackground(Color.WHITE);
		paymentCard.setBorder(
				BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(210, 215, 220), 1),
						BorderFactory.createEmptyBorder(25, 35, 25, 35)));

		JLabel info = new JLabel("Enter your payment details below", SwingConstants.CENTER);
		info.setFont(new Font("Arial", Font.PLAIN, 16));
		info.setForeground(new Color(90, 100, 110));

		JPanel form = new JPanel(new GridBagLayout());
		form.setBackground(Color.WHITE);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JLabel nameLabel = new JLabel("Card Holder Name:");
		JTextField nameField = new JTextField();

		JLabel cardLabel = new JLabel("Card Number:");
		JTextField cardField = new JTextField();

		JLabel expiryLabel = new JLabel("Expiry (MM/YY):");
		JTextField expiryField = new JTextField();

		JLabel cvvLabel = new JLabel("CVV:");
		JPasswordField cvvField = new JPasswordField();

		Font labelFont = new Font("Arial", Font.BOLD, 15);
		nameLabel.setFont(labelFont);
		cardLabel.setFont(labelFont);
		expiryLabel.setFont(labelFont);
		cvvLabel.setFont(labelFont);

		Font fieldFont = new Font("Arial", Font.PLAIN, 16);
		nameField.setFont(fieldFont);
		cardField.setFont(fieldFont);
		expiryField.setFont(fieldFont);
		cvvField.setFont(fieldFont);

		Dimension fieldSize = new Dimension(430, 42);
		nameField.setPreferredSize(fieldSize);
		cardField.setPreferredSize(fieldSize);
		expiryField.setPreferredSize(fieldSize);
		cvvField.setPreferredSize(fieldSize);

		// Only allow letters and spaces in Card Holder Name.
		nameField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (!Character.isLetter(ch) && ch != ' ' && ch != '\b') {
					e.consume();
				}
			}
		});

		// Only allow numbers in Card Number.
		cardField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (!Character.isDigit(ch) || cardField.getText().length() >= 16) {
					e.consume();
				}
			}
		});

		// Only allow numbers and maximum 5 characters in expiry (MM/YY).
		expiryField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (!Character.isDigit(ch) && ch != '/') {
					e.consume();
					return;
				}
				if (expiryField.getText().length() >= 5) {
					e.consume();
				}
			}
		});

		// Only allow numbers and exactly 3 digits for CVV.
		cvvField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch = e.getKeyChar();
				if (!Character.isDigit(ch) || cvvField.getPassword().length >= 3) {
					e.consume();
				}
			}
		});

		addFormRow(form, gbc, 0, nameLabel, nameField);
		addFormRow(form, gbc, 1, cardLabel, cardField);
		addFormRow(form, gbc, 2, expiryLabel, expiryField);
		addFormRow(form, gbc, 3, cvvLabel, cvvField);

		JLabel amountLabel = new JLabel("Amount to Pay:");
		amountLabel.setFont(labelFont);

		JLabel amountValue = new JLabel("₹" + String.format("%.2f", getCartTotal()));
		amountValue.setFont(new Font("Arial", Font.BOLD, 22));
		amountValue.setForeground(new Color(20, 110, 70));

		addFormRow(form, gbc, 4, amountLabel, amountValue);

		paymentCard.add(info, BorderLayout.NORTH);
		paymentCard.add(form, BorderLayout.CENTER);

		JButton payButton = new JButton("PAY NOW");
		payButton.setFont(new Font("Arial", Font.BOLD, 17));
		payButton.setPreferredSize(new Dimension(160, 45));
		payButton.setFocusPainted(false);

		JButton backButton = new JButton("BACK TO CART");
		backButton.setFont(new Font("Arial", Font.BOLD, 15));
		backButton.setPreferredSize(new Dimension(160, 45));
		backButton.setFocusPainted(false);

		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText().trim();
				String card = cardField.getText().trim();
				String expiry = expiryField.getText().trim();
				String cvv = new String(cvvField.getPassword()).trim();

				// 1. Card holder name validation
				if (name.length() == 0) {
					showPaymentError("Please enter the card holder name.", nameField);
					return;
				}

				if (!name.matches("[A-Za-z ]+")) {
					showPaymentError("Card Holder Name is not valid.\nPlease enter letters only.", nameField);
					return;
				}

				// 2. Card number validation - exactly 16 digits
				if (!card.matches("[0-9]{16}")) {
					showPaymentError(
							"Card Number is not valid.\nPlease enter exactly 16 digits.\nExample: 1234567890123456",
							cardField);
					return;
				}

				// 3. Expiry validation - MM/YY
				if (!expiry.matches("(0[1-9]|1[0-2])/([0-9]{2})")) {
					showPaymentError("Expiry is not valid.\nPlease enter in MM/YY format.\nExample: 09/28",
							expiryField);
					return;
				}

				// 4. CVV validation - exactly 3 digits
				if (!cvv.matches("[0-9]{3}")) {
					showPaymentError("CVV is not valid.\nPlease enter exactly 3 digits.", cvvField);
					return;
				}

				JOptionPane.showMessageDialog(E_Commers.this, "Payment Successful!\n\nThank you for shopping with us.",
						"Payment Successful", JOptionPane.INFORMATION_MESSAGE);

				dispose();
			}
		});

		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showCartScreen();
			}
		});

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
		buttonPanel.setBackground(new Color(245, 247, 250));
		buttonPanel.add(backButton);
		buttonPanel.add(payButton);

		JPanel outer = new JPanel(new BorderLayout(15, 15));
		outer.setBackground(new Color(245, 247, 250));
		outer.add(paymentCard, BorderLayout.CENTER);
		outer.add(buttonPanel, BorderLayout.SOUTH);

		mainPanel.add(title, BorderLayout.NORTH);
		mainPanel.add(outer, BorderLayout.CENTER);

		setContentPane(mainPanel);
		revalidate();
		repaint();
	}

	// Adds one label + input row to the payment form.
	void addFormRow(JPanel panel, GridBagConstraints gbc, int row, JLabel label, JComponent component) {
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.weightx = 0.3;
		panel.add(label, gbc);

		gbc.gridx = 1;
		gbc.weightx = 0.7;
		panel.add(component, gbc);
	}

	// Shows a clear validation error and puts the cursor back in that field.
	void showPaymentError(String message, JComponent field) {
		JOptionPane.showMessageDialog(E_Commers.this, message, "Payment Error", JOptionPane.ERROR_MESSAGE);
		field.requestFocusInWindow();
	}

	double getCartTotal() {
		double total = 0;
		for (int i = 0; i < cartCount; i++) {
			total += cart[i].price;
		}
		return total;
	}
}

