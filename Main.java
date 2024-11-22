public class Main {
    public static void main (String[]args){
        Invitation invitation = new Invitation("Anne", "123 ABC street");
        System.out.println(invitation.getAddress() + invitation.getHostName());
        invitation.setAddress("12 BCD street");
        invitation.setName("Marcus");
        System.out.println(invitation.createInvitation("Mary"));
        Invitation invitation2 = new Invitation("ABC street");
        System.out.println(invitation2.getAddress() + invitation2.getHostName());
    }
}
