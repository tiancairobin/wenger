package com.finalhome.wenger.model.engine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GzipEngine extends Engine{

	@Override
	protected void compressFile(FileInputStream fis, FileOutputStream fos) {
		try (GZIPOutputStream gzipOS = new GZIPOutputStream(fos)){
			byte[] buffer = new byte[1024];
			int len;
			while((len = fis.read(buffer)) != -1) {
				gzipOS.write(buffer, 0, len);
			}
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	

}
