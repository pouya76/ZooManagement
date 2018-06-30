public abstract class LiveCreature {
    
    public String name;
    private static long idcount=1000;
    private long ID;
    
    public LiveCreature(String name) {
        
        ID = idcount++;
        this.name = name;
        
    }
    
    
    
    abstract String getName();
 
}
