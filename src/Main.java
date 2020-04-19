import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Main {
    public static void main(String[] argv) throws Exception {
        String algorithm = "DSA";

        // Generate a 1024-bit Digital Signature Algorithm (DSA) key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance ( algorithm );

        keyGen.initialize ( 1024 );

        KeyPair keypair = keyGen.genKeyPair ( );

        PrivateKey privateKey = keypair.getPrivate ( );

        PublicKey publicKey = keypair.getPublic ( );

        System.out.println ( privateKey );
        System.out.println ( publicKey );

        byte[] privateKeyBytes = privateKey.getEncoded ( );
        byte[] publicKeyBytes = publicKey.getEncoded ( );

        for (int i = 0; i < privateKeyBytes.length; i++) {
            System.out.print ( privateKeyBytes[i] + " ");
        }

        System.out.printf("%n");

        for (int j = 0; j < publicKeyBytes.length; j++) {
            System.out.print ( publicKeyBytes[j] + " " );
        }
    }
}