public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a){
        hostName = n;
        address = a;
    }

    public Invitation(String a){
        hostName = "Host";
        address = a;
    }
    
    public String getHostName(){
        return hostName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String a){
        address = a;
    }
    public void setName(String n){
        hostName = n;
    }

    public String createInvitation(String name){
        return "Dear "+name+", please attend my event at "+address+". See you then, "+hostName+".";
    }
}