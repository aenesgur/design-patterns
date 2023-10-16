package singleton;

import singleton.Log.EagerLogger;
import singleton.Log.EnumLogger;
import singleton.Log.LazyDoubleCheckedLogger;
import singleton.Log.LazySafeLogger;

public class Main {
    public static void main(String[] args) {

        //region EagerLogger

        EagerLogger eagerLogger = EagerLogger.getInstance();
        eagerLogger.log("Uygulama başladı.");
        eagerLogger.log("Bu bir log mesajıdır.");
        eagerLogger.log("Uygulama sonlandı.");

        EagerLogger eagerLogger2 = EagerLogger.getInstance();
        eagerLogger2.log("2Uygulama başladı.");
        eagerLogger2.log("2Bu bir log mesajıdır.");
        eagerLogger2.log("2Uygulama sonlandı.");
        eagerLogger2.close();

        //endregion

        //region LazySafeLogger

        LazySafeLogger lazySafeLogger = LazySafeLogger.getInstance();

        lazySafeLogger.log("Uygulama başladı.");
        lazySafeLogger.log("Bu bir log mesajıdır.");
        lazySafeLogger.log("Uygulama sonlandı.");

        LazySafeLogger lazySafeLogger2 = LazySafeLogger.getInstance();

        lazySafeLogger2.log("2Uygulama başladı.");
        lazySafeLogger2.log("2Bu bir log mesajıdır.");
        lazySafeLogger2.log("2Uygulama sonlandı.");


        lazySafeLogger2.close();

        //endregion

        //region LazySafeLogger

        LazyDoubleCheckedLogger lazyDoubleCheckedLogger = LazyDoubleCheckedLogger.getInstance();

        lazyDoubleCheckedLogger.log("Uygulama başladı.");
        lazyDoubleCheckedLogger.log("Bu bir log mesajıdır.");
        lazyDoubleCheckedLogger.log("Uygulama sonlandı.");

        LazyDoubleCheckedLogger lazyDoubleCheckedLogger2 = LazyDoubleCheckedLogger.getInstance();

        lazyDoubleCheckedLogger2.log("2Uygulama başladı.");
        lazyDoubleCheckedLogger2.log("2Bu bir log mesajıdır.");
        lazyDoubleCheckedLogger2.log("2Uygulama sonlandı.");

        lazyDoubleCheckedLogger2.close();

        //endregion

        //region EnumLogger

        EnumLogger enumLogger = EnumLogger.INSTANCE;

        enumLogger.log("Uygulama başladı.");
        enumLogger.log("Bu bir log mesajıdır.");
        enumLogger.log("Uygulama sonlandı.");

        EnumLogger enumLogger2 = EnumLogger.INSTANCE;

        enumLogger2.log("2Uygulama başladı.");
        enumLogger2.log("2Bu bir log mesajıdır.");
        enumLogger2.log("2Uygulama sonlandı.");

        enumLogger.close();

        //endregion
    }
}