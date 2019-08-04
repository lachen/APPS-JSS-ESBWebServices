/*******************************************************************************
 * Copyright (c) 2013 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.ecm.util;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.media.jai.NullOpImage;
import javax.media.jai.OpImage;
import javax.media.jai.PlanarImage;

import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageDecoder;
import com.sun.media.jai.codec.ImageEncoder;
import com.sun.media.jai.codec.PNGEncodeParam;

public class MultipageTiffConverter {

	public static byte[] convertImage(byte[] imageBytes) {

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		processImage(new ByteArrayInputStream(imageBytes), os);
		return os.toByteArray();
	}

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
				"C:/balaji/DIA/split_issue/1.tif");
			FileOutputStream fos = new FileOutputStream("C:/balaji/test.jpg");
			MultipageTiffConverter.processImage(fis, fos);
		} catch (FileNotFoundException ex) {

		}
	}

	public static void processImage(InputStream inputStream,
		OutputStream outputStream) {

		try {

			ImageDecoder dec = ImageCodec.createImageDecoder("tiff",
				inputStream, null);
			int numPages = dec.getNumPages();

			RenderedImage r0 = dec.decodeAsRenderedImage(0);
			PlanarImage op0 = new NullOpImage(r0, null, null,
				OpImage.OP_IO_BOUND);
			BufferedImage bufferedImage0 = op0.getAsBufferedImage();
			int chunkWidth = bufferedImage0.getWidth();
			int finalHeight = numPages * bufferedImage0.getHeight();

			// Initializing the final image
			BufferedImage finalImg = new BufferedImage(chunkWidth, finalHeight,
				bufferedImage0.getType());

			for (int i = 0; i < numPages; i++) {

				RenderedImage ri = dec.decodeAsRenderedImage(i);
				PlanarImage op = new NullOpImage(ri, null, null,
					OpImage.OP_IO_BOUND);
				BufferedImage bufferedImage = op.getAsBufferedImage();
				int chunkHeight = bufferedImage.getHeight();
				finalImg.createGraphics().drawImage(bufferedImage, 0,
					chunkHeight * i, null);
			}

			PNGEncodeParam params = new PNGEncodeParam.Gray();
			ImageEncoder encoder = ImageCodec.createImageEncoder("png",
				outputStream, params);
			encoder.encode(finalImg);
		} catch (IOException ex) {

		}
	}
}
