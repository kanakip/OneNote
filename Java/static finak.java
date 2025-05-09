	While both "static final" and "constant" indicate a value that cannot be changed, the key difference lies in the scope: "static final" refers to a variable that is shared across all instances of a class (class-level), whereas a "constant" can be defined at a more local level within a function or object, depending on the language; essentially, "static final" is a specific type of constant accessible through the class itself, not individual objects. 
	Key points:
• Static:
When a variable is declared as "static," it belongs to the class itself, meaning there's only one copy of that variable shared among all instances of the class.
• Final:
The "final" keyword indicates that a variable can be assigned a value only once and cannot be changed later. 
	Example (Java):
	class MyClass {
	    static final double PI = 3.14159; // A constant shared across all MyClass instances
	
	    public void someMethod() {
	        final int MAX_VALUE = 100; // A constant within the method scope 
	    }
	}
	In summary:
	• Constant: A general term for a value that cannot be changed.
	• Static Final: A specific type of constant that is accessible through the class itself and is shared by all instances of that class. 

From <https://www.google.com/search?q=static+final+and+constant+differance&sca_esv=23a6d0305129b91a&source=hp&ei=WE-cZ6b7HOuaseMPuvyf6Ao&iflsig=ACkRmUkAAAAAZ5xdaFx8IZsAIon0Vlkr1VQ2ks6D66Aa&ved=0ahUKEwimh9_NjZ-LAxVrTWwGHTr-B60Q4dUDCBA&uact=5&oq=static+final+and+constant+differance&gs_lp=Egdnd3Mtd2l6IiRzdGF0aWMgZmluYWwgYW5kIGNvbnN0YW50IGRpZmZlcmFuY2UyCBAAGAgYDRgeMgsQABiABBiGAxiKBTILEAAYgAQYhgMYigUyCxAAGIAEGIYDGIoFMgsQABiABBiGAxiKBTIIEAAYgAQYogQyCBAAGKIEGIkFMgUQABjvBUi8B1AAWABwAHgAkAEAmAG7AaABuwGqAQMwLjG4AQPIAQD4AQL4AQGYAgGgAsIBmAMAkgcDMC4xoAeaBw&sclient=gws-wiz> 

