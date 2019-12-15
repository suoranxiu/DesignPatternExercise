package day4.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for(int i =0;i<10;i++){
            Mail mailTemp =(Mail)mail.clone();//并没有调用构造器
            mailTemp.setName("Name"+i);
            mailTemp.setEmailAddress("Name"+i+"@qq.com");
            mailTemp.setContent("Congratulations!");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
