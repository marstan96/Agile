package newdeliverman;

import java.io.Serializable;
/**
 *
 * @author JunWeng
 */
public class deliverMan implements Serializable{
    private static int dmID = 1;
    private int ID;
    private String name;
    private String IC;
    private String address;
    private String contactNo;
    private String emergencyNo;
    private String email;
    private String gender;
    private int status;

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getEmergencyNo() {
        return emergencyNo;
    }

    public void setEmergencyNo(String emergencyNo) {
        this.emergencyNo = emergencyNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    

   
    
    public deliverMan (int ID){
        this.ID = ID;
    }
    
    public deliverMan (String name, String IC, String address, String contactNo, String emergencyNo, String email, String gender, int status){
        this.name=name;
        this.IC=IC;
        this.address=address;
        this.contactNo=contactNo;
        this.emergencyNo=emergencyNo;
        this.email=email;
        this.gender=gender;
        this.status=status;
        this.ID = dmID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public static int getDmID() {
        return dmID;
    }

    public static void setDmID(int dmID) {
        deliverMan.dmID = dmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
   @Override
  public String toString() {
    return String.format("%-10d %-50s\n", ID, name);
  }
    
}
