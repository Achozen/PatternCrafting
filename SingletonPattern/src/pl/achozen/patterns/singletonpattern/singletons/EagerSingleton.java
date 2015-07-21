package pl.achozen.patterns.singletonpattern.singletons;

public class EagerSingleton {

    // there should be a private modifier for static instance of singleton, but
    // on
    // Demo purposes e id public so I can see when instance is created.
    public static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
	return instance;

    }
}
