package com.gyh.lightrxlivedata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/**
 * Created by  yahuigao
 * Date: 2019-05-11
 * Time: 17:25
 * Description:
 */
public class AndroidHandlers {
    private static final Handler MAIN_THREAD_HANDLER;

    private static final Handler IO_THREAD_HANDLER;

    private static final Handler COMPUTE_THREAD_HANDLER;

    static {
        MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper());

        HandlerThread ioThread = new HandlerThread("io");
        ioThread.start();
        IO_THREAD_HANDLER = new Handler(ioThread.getLooper());

        HandlerThread computeThread = new HandlerThread("compute");
        computeThread.start();
        COMPUTE_THREAD_HANDLER = new Handler(computeThread.getLooper());
    }

    public static Handler mainThreadHandler() {
        return MAIN_THREAD_HANDLER;
    }

    public static Handler ioThreadHandler() {
        return IO_THREAD_HANDLER;
    }

    public static Handler computeThreadHandler() {
        return COMPUTE_THREAD_HANDLER;
    }

    public static Handler newThreadHandler(String name) {
        HandlerThread handlerThread = new HandlerThread(name);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
