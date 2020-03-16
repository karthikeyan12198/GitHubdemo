Feature: Product_Store
@Tc01_SignUp
Scenario: 
	
	Sign Up to Product store 
	Given the user launched the chrome browser 
	When the user opens product store  homepage 
	Then the user enters username and password 
	Then  the user clicks signup
	And the user close the application 
	
@Tc02_Login
Scenario: 
	
	Login to Product store 
	Given  user launched the chrome browser no
	When  user opens product store  homepage 
	Then  user enters username and password 
	Then   user clicks login

@Tc03_Add_to_cart
Scenario: 
	
	To add a product to cart 
	Given  user launched the chrome Browser
	When  user opens product store  Homepage 
	Then  user clicks on product and add to cart 
	@Tc04_Contact
Scenario: 
	
	To contact 
	Given  user launched the Chrome Browser
	When  user opens Product store  Homepage 
	Then  user clicks contact
	Then  user enters contact details
	Then  user clicks send message
	@Tc05_clickproduct
Scenario: 
	To select a product 
	Given  user launched the Chrome_Browser
	When  user opens Product Store  Homepage 
	Then  user clicks next
	Then  user selects product
	@Tc06_DeleteCart
Scenario: 
	To delete a product
	Given  user launched the Chrome_browser
	When  user opens Product store homepage 
	Then  user clicks cart
	Then  delete the product in cart 
	@Tc07_SelectLaptop
Scenario: 
	To get price of a specific laptop
	Given  User launched the chrome_browser
	When  User opens Product store homepage 
	Then  User clicks laptop tab
@Tc08_To_check_phone_number
Scenario: 
	To check phone no
	Given The User launched the Chrome_Browser
	When  User opens product Store homepage 
	Then  User checks if the number is valid.
	Then  User selects a laptop and gets price of specific laptop
@Tc09_To_get_description
Scenario: 
	To get the  product description
	Given The User launched the Chrome_browser
	When  The User opens product Store homepage 
	Then  User gets the description of the specific product  
@Tc10_To_add_two_product
Scenario: 
	To add more than one  product to cart
	Given The User launch the Chrome_browser
	When  The User open product Store homepage 
	Then  user need to add more than one products in cart
	