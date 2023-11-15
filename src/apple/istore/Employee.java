package apple.istore;

public class Employee {
    private String EmployeeID;
    private String FullName;
    private String Username;
    private String Password;
    
    public String getEmployeeID(){
        return EmployeeID;        
    }
    public void setEmployeeID(String employeeid) {
        this.EmployeeID = employeeid;
    }
    public String getFullName(){
        return FullName;
    }
    public void setFullName(String fullname) {
        this.FullName = fullname;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    
    public void SAVE(Employee obj)
    {
        String itemString = obj.getEmployeeID() + "  " + obj.getFullName() +  "  " + 
                obj.getUsername() + "  " + obj.getPassword();
        SmartPhoneLab con = new SmartPhoneLab ();
        con.makeconnection2(itemString,"SmartPhoneLab.txt");
    }
}
