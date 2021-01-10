public class LicenseKeyFormatting2 {
    
    public static void main(String[] args){

        int k = 4;
        String licenseKey1 = "8F3Z-2e-9-w";
        String licenseKey2 = "8-5g-3-J";

        solve(k, licenseKey1);
        solve(k, licenseKey2);

    }

    public static String solve(int k, String licenseKey){
        String newStr = licenseKey.replace("-", "").toUpperCase();

        int leng = newStr.length();

        StringBuilder sb = new StringBuilder();

        sb.append(newStr);

        for(int i=k; i<leng; i+=k){
            sb.insert(leng-i, "-");
        }

        System.out.println("result : " + sb.toString());

        return sb.toString();
    }

}
