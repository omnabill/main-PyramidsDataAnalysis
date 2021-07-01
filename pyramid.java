public class pyramid {
    private Double height;
    private String modern_name;
    private String pharoph;
    private String site;
    public pyramid(String pharoph,String modern_name,String site,String height){
        this.pharoph=pharoph;
        this.modern_name=modern_name;
        this.site=site;
        if("".equals(height)){
            height="0";
        }
        this.height=Double.parseDouble(height);
    }
    
    public Double getHeight(){
        return this.height;
    }
    public String getmodern_name(){
        return this.modern_name;
    }
    public String getsite(){
        return this.site;
    }
    public String getpharoph(){
        return this.pharoph;
    }
    public void setHeight(Double height){
        this.height=height;
    }
    public void setModern_name(String modern_name){
        this.modern_name=modern_name;
    }
    
    public void setPharoph(String pharoph){
        this.pharoph=pharoph;
    }
    
    public void setSite(String site){
        this.site=site;
    }
    
    public String toString(){
        return("The Pharoph :"+pharoph+'\n'+"The Modern name: "+modern_name+'\n'+"The Site : "+site+'\n'+"The Height :"+height);
    }
    
    public static void main(String[] args)throws Exception {
 
    }
}
