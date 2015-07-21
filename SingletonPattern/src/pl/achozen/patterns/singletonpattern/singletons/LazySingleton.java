package pl.achozen.patterns.singletonpattern.singletons;

public class LazySingleton {

    // there should be a private modifier for static instance of singleton, but
    // on
    // Demo purposes e id public so I can see when instance is created.
    public static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
	if (instance == null)
	    instance = new LazySingleton();
	return instance;

    }
}
