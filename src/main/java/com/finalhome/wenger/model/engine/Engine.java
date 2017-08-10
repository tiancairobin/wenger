package com.finalhome.wenger.model.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Engine {

	public void compress(String sourceFile, String compressedFile) {
		try (
			FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(compressedFile)) {
			
			compressFile(fis, fos);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		} 
	}

	protected abstract void compressFile(FileInputStream fis, FileOutputStream fos);
}
