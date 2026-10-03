
public class Day32 {
    public static void main(String[] args) {
        String username = "adi";
        String password = "java123";
        int umur = 20;
        boolean akunAktif = true;

        boolean usernameValid = username == "adi";
        boolean passwordValid = password != "";
        boolean umurValid = umur >= 18 && umur <= 60;

        boolean bisaLogin = usernameValid
                && passwordValid
                && umurValid
                && akunAktif;

        boolean loginDitolak = !bisaLogin;

        System.out.println("Username valid: " + usernameValid);
        System.out.println("Password valid: " + passwordValid);
        System.out.println("Umur valid: " + umurValid);
        System.out.println("Bisa login: " + bisaLogin);
        System.out.println("Login ditolak: " + loginDitolak);
    }
}
