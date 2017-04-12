package cn.thactclub.fxtz.base;

import android.os.Environment;

/**
 * Auther：xzj
 * Date： 2017/4/12.
 */

public class Constant {
    public static class Files {
        public static final String APP_PATH = Environment.getExternalStorageDirectory().getAbsolutePath()
                + java.io.File.separator + "FXTZ";
        public static final String APP_FILES_PATH = Environment.getExternalStorageDirectory().getAbsolutePath()
                + java.io.File.separator + "FXTZ"
                + java.io.File.separator + "files";

        public static final String CRASH_LOG_PATH = APP_PATH + java.io.File.separator + "crashlog";
        public static final String CRASH_LOG_FILE_PATH = CRASH_LOG_PATH + java.io.File.separator + "crash_log.txt";
    }
}
