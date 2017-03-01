import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class KeyTest {

	public static void main(String[] args) {
		
		try {
			CertificateFactory fact = CertificateFactory.getInstance("X.509");
			FileInputStream is = new FileInputStream("..//test.pem");
			X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
			PublicKey key = cer.getPublicKey();
			System.out.println(key);
			System.out.println(key.getEncoded());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
