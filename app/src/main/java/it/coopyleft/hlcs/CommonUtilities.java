package it.coopyleft.hlcs;

public final class CommonUtilities {
    // Home della WebApp
    static final String HOME_URL = "https://hlcs.it";
    // Titolo notifica
    static final String TITOLO_NOTIFICA = "Hacklab Cosenza - news:";

    // give your server registration url here
    static final String SERVER_URL = "https://hlcs.it/wp-content/plugins/wp_gcm_push/newuser.php";
    //static final String SERVER_URL = "http://www.vincenzobruno.it/wp-content/plugins/wp_gcm_push/newuser.php";
    // Google project id
    static final String SENDER_ID = "757247540307"; // Add your GOOGLE API GCM SENDER ID here

    /**
     * Tag used on log messages.
     */
    static final String TAG = "HLCS-GCM";

    static final String EXTRA_MESSAGE = "message";
}
