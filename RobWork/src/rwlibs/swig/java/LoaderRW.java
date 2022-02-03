package org.robwork;

/**
 * Automatically class generated by CMake for convenient loading of the native RobWork libraries.
 * Before invoking any functions in the Java API, the static load function in this class should be called.
 */
public class LoaderRW {
	
	/**
	 * Load the native library required for the Java API by using the classpath.
	 * @param shortName the name of the native library to load.
	 */
	public static void load(String shortName){
		System.loadLibrary(shortName + "_jni");
	}
	
	/**
	 * Load the native library required for the Java API located at specific path.
	 * @param path the path where the library can be found.
	 * @param shortName the name of the native library to load.
	 */
	public static void load(String path, String shortName){
		System.load(path + "/" + getFullName(shortName));
	}

	/**
	 * Get the platform-dependent name of the native library without path.
	 * @param shortName the name of the native library to load.
	 * @return the name of the native library.
	 */
	public static String getFullName(String shortName) {
		return System.mapLibraryName(shortName);
	}
}