public class Main {
    public static void main (String[]args){
        //Run Invitation
        Invitation invitation = new Invitation("Anne", "123 ABC street");
        System.out.println(invitation.getAddress() + " " + invitation.getHostName());
        invitation.setAddress("12 BCD street");
        invitation.setName("Marcus");
        System.out.println(invitation.createInvitation("Mary"));
        Invitation invitation2 = new Invitation("ABC street");
        System.out.println(invitation2.getAddress() + " " + invitation2.getHostName());
        //Run password gererator
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
