package nLayered.core;

import nLayered.google.googleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void add(String message) {
		googleManager googlemanager=new googleManager();
		googlemanager.signUp();
	}

}
