package day4.creational.prototype;

public class Mail implements Cloneable{
    private String Name;
    private String emailAddress;
    private String content;
    public Mail(){
        System.out.println("Mail constructor!");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clone Mail object!");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "Name='" + Name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
