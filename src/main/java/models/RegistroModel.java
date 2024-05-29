package models;

public class RegistroModel {
    public RegistroModel(String userNameExcel, String passWordExcel) {
        this.userNameExcel = userNameExcel;
        this.passWordExcel = passWordExcel;
    }

    private String userNameExcel;
    private String passWordExcel;

    public RegistroModel(){
    }

    public  void setUserNameExcel(String userNameExcel) {this.userNameExcel= userNameExcel;}
    public void setpassWordExcel (String passWordExcel) {this.passWordExcel= passWordExcel;}
    public   String getUserNameExcel() {return  userNameExcel;}
    public   String getPassWordExcel() {return  passWordExcel;}
}

