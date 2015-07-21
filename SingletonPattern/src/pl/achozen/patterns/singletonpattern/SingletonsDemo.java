package pl.achozen.patterns.singletonpattern;

import pl.achozen.patterns.singletonpattern.singletons.EagerSingleton;
import pl.achozen.patterns.singletonpattern.singletons.LazySingleton;

public class SingletonsDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Lazy singleton before get Instance is " + LazySingleton.instance);
	System.out.println("Eager singleton before get Instance is " + EagerSingleton.instance);

	// singleton is created when .getInstance() is called
	LazySingleton lazySingleton = LazySingleton.getInstance();

	// singleton is created when application starts
	EagerSingleton eagerSingleton = EagerSingleton.getInstance();

	System.out.println("Lazy singleton after get Instance is " + LazySingleton.instance);
	// singleton is created after application starts
	System.out.println("Eager singleton after get Instance is " + EagerSingleton.instance);
    }

}
