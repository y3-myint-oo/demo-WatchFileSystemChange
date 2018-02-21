package ymo.demo.WatchFileSystemChange.services;

public class Watcher {
	private static Watcher watcher;
	private static WatcherThread watcherThread;

	public static Watcher createWatchService() {
		if (null == watcher) {
			watcher = new Watcher();
			watcherThread = new WatcherThread();
		}
		return watcher;
	}

	public static void startWatchService() {
		if (!watcherThread.isRunning()) {
			watcherThread.reset();
			watcherThread.start();
		}
	}
}
