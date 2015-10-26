class Chick implements Animal 
{     
	private int age;
    private String myType;     
    private String mySound;      
    public Chick(String type, String sound, String sound2){    
    	age = (int)(Math.random()*2) ;     
        myType = type;    
        if(age == 0){mySound = sound;}  
        else{mySound = sound2; }   
        
           
    }     
    public Chick(){         
         myType = "unknown";  
         mySound = "unknown";     
    }      
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
}