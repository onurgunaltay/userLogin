
import java.util.Scanner;


public class userLogin {
    public static void main(String[] args) {
         /*
        Kullanıcıdan kullanıcı adı ve şifre bilgilerini alalım.

        Şifre yalnış ise şifreyi sıfırlamak isteyip istemediğini soralım.

        Yeni girilen şifre hatalı girdiği ve unuttuğu şifre ile aynı ise sifre oluşturulamadı yazdıralım.
         */
        String userName,password,newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        password = input.nextLine();
        newPassword=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!:");
        }else {
            System.out.print("Bilgileriniz yanlış.Şifrenizi sıfırlamak istiyor musunuz?\n1-evet\n2-hayır\nseçiminiz:");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    input.nextLine();
                    System.out.print("Yeni şifenizi giriniz:");
                    if (newPassword.equals("java123")) {
                        System.out.print("Şifreniz oluşturulamadı. Lütfen başka şifre ile tekrar deneyiniz:");

                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Giriş başarısız. Tekrar deneyiniz.");
                    break;
                default:
                    System.out.print("Hatalı giriş yaptınız. Tekrar denayiniz.");
            }
            }
    }
}
