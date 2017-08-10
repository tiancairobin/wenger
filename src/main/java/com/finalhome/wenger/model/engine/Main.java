package com.finalhome.wenger.model.engine;

public class Main {

	public static void main(String[] args) {
		GzipEngine gzip = new GzipEngine();
		gzip.compress("files/test.dmg", "files/test.gz");
	}
	
	
}
