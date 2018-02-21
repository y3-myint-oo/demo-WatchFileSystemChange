package ymo.demo.WatchFileSystemChange.services;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class WatcherThread extends Service<String> {
	private WatcherTask watcher;

	@Override
	protected Task<String> createTask() {
		watcher = new WatcherTask();
		return watcher;
	}

}
