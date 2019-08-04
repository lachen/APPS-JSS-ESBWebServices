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

package com.apria.web.services.ecm;

import com.apria.web.services.ecm.util.MultipageTiffConverter;
import com.apria.web.services.ecm.util.TiffPdfUtil;
import com.apria.web.services.ecm.vo.DocRequest;
import com.apria.web.services.ecm.vo.DocResponse;
import com.apria.web.services.ecm.wsclient.ECMWebServiceHelper;

public class DocumentManagerImpl implements DocumentManger {

	private static final String PDFFORMAT = "application/pdf";
	private static final String PNGFORMAT = "image/png";
	private static final String TIFFFORMAT = "image/tiff";

	@Override
	public DocResponse getEcmDocument(DocRequest request) throws Exception {
		String documentId = request.getDocumentId();
		String itemType = request.getItemType();
		String convert = request.getConvertType();

		ECMWebServiceHelper helper = new ECMWebServiceHelper();
		DocResponse imageData = helper
			.getFaxImageByItemID(documentId, itemType);
		byte[] imageBytes = imageData.getImageBytes();

		String mimeType = imageData.getMimeType();
		if (TIFFFORMAT.equals(mimeType)) {

			/* convert tiff to Jpeg or Pdf */
			if ("png".equals(convert)) {
				mimeType = PNGFORMAT;
				imageBytes = MultipageTiffConverter.convertImage(imageBytes);
			} else {
				mimeType = PDFFORMAT;
				imageBytes = TiffPdfUtil.convertTiffToPdf(imageBytes);
			}
			imageData.setImageBytes(imageBytes);
		}
		return imageData;
	}

}
