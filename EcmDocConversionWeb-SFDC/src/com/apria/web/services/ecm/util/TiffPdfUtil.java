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

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import com.itextpdf.text.pdf.codec.TiffImage;

public class TiffPdfUtil {
	public static byte[] convertTiffToPdf(byte[] content) throws Exception {

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		RandomAccessFileOrArray ra = new RandomAccessFileOrArray(
			new RandomAccessSourceFactory().createSource(content));
		createPdf(os, ra);
		return os.toByteArray();
	}

	public static void convertTiffToPdf(String fileStr) throws Exception {

		String pdf = fileStr.substring(0, fileStr.lastIndexOf('.') + 1) + "pdf";

		RandomAccessFileOrArray ra = new RandomAccessFileOrArray(
			new RandomAccessSourceFactory().createBestSource(fileStr));
		createPdf(new FileOutputStream(pdf), ra);
	}

	public static void main(String[] args) throws Exception {

		String tiff = "C:/balaji/DIA/split_issue/15mb.tif";
		convertTiffToPdf(tiff);
	}

	private static void createPdf(OutputStream os, RandomAccessFileOrArray ra)
		throws Exception {

		Document document = new Document(PageSize.LETTER, 0, 0, 0, 0);
		PdfWriter writer = PdfWriter.getInstance(document, os);
		document.open();
		PdfContentByte cb = writer.getDirectContent();
		int numOfPages = TiffImage.getNumberOfPages(ra);

		for (int c = 0; c < numOfPages; ++c) {

			Image img = TiffImage.getTiffImage(ra, c + 1);
			if (img != null) {
				img.scalePercent(7200f / img.getDpiX(), 7200f / img.getDpiY());
				document.setPageSize(new Rectangle(img.getScaledWidth(), img
					.getScaledHeight()));
				img.setAbsolutePosition(0, 0);
				cb.addImage(img);
				document.newPage();
			}
		}

		ra.close();
		document.close();
	}
}