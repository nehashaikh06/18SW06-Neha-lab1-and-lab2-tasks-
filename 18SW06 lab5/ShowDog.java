/*lab5task*/
class Dog{ 
         private String name;
	 private String breed;
	 private int age;
	 public void setDetails(String name,String breed,int age){
         this.name=name;
         this.breed=breed;
         this.age=age;
	 }
	 public void showDetails(){
         if(name!=null && breed!=null && age!=0){
	  System.out.println("Name:"+name+"\n"+"Breed:"+breed+"\n"+"Age:"+age);
      
	 }
       else{
         System.out.println("Details not availabe");
	 }
       
    }
}
  class ShowDog{
	public static void main(String[]args){
	Dog d1=new Dog();
        d1.setDetails("Asian Bull","German mastiff",11);
	d1.showDetails();
	}
}