Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
	declare class variables/attributes as private
	provide public get and set methods to access and update the value of a private variable

From <https://www.w3schools.com/java/java_encapsulation.asp> 

public class Person {
  private String name; // private = restricted access
// Getter
  public String getName() {
    return name;
  }
// Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

From <https://www.w3schools.com/java/java_encapsulation.asp> 


Encapsulation is bundling data (attributes) and methods that operate on that data within a single unit (class), hiding internal details using access modifiers.

From <https://highlight-chat-frontend.vercel.app/> 
