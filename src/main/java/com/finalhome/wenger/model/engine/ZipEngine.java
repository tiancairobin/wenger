package com.finalhome.wenger.model.engine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipOutputStream;

public class ZipEngine extends Engine {

	@Override
	protected void compressFile(FileInputStream fis, FileOutputStream fos) {
		try (ZipOutputStream zos = new ZipOutputStream(fos)) {
			byte[] buffer = new byte[1024];
			int len;
			while((len = fis.read(buffer)) != -1) {
				zos.write(buffer, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void decompressFile(FileInputStream fis, FileOutputStream fos) {
		try (GZIPInputStream gzipIS = new GZIPInputStream(fis)) {
			byte[] buffer = new byte[1024];
			int len;
			while((len = gzipIS.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
