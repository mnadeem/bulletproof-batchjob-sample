package com.nadeem.app.batch.support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;

import org.springframework.batch.item.file.BufferedReaderFactory;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

public class GZipBufferedReaderFactory implements BufferedReaderFactory {

	public BufferedReader create(Resource resource, String encoding) throws UnsupportedEncodingException, IOException {
		InputStream sourceStream = null;
		if ((StringUtils.hasText(resource.getFilename()))) {
			if (resource.getFilename().endsWith(".gz")
					|| resource.getFilename().endsWith(".gzip")) {
				sourceStream = new GZIPInputStream(resource.getInputStream());
			} else {
				throw new IOException("Invalid file extension");
			}

		} else {
			sourceStream = resource.getInputStream();
		}
		return new BufferedReader(new InputStreamReader(sourceStream, encoding));
	}
}
