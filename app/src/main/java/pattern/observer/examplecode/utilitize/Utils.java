package pattern.observer.examplecode.utilitize;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

public class Utils {

    public static boolean checkPermissionWriteExternalStorage(Activity activity) {
        return ActivityCompat.checkSelfPermission(activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED;
    }

    public static void settingPermissionWriteExternalStorage(Activity activity, int permission) {
        ActivityCompat.requestPermissions(activity,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, permission);
    }

}
