package day1.principle.singleresponsibility;

public class Method {

    private void updateUserInfo(String userName,String address){
        userName = "srx";
        address = "xxxxxxxxxx";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "srx";
//        address = "xxxxxxxxxx";
    }
    private void updateUserName(String userName){
        userName = "srx";
    }

    private void updateUserAddress(String address){
        address = "xxxxxxxxxx";
    }
}
