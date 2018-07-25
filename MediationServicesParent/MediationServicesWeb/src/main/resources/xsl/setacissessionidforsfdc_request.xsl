<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_SetAcisSessionForSfdc/com/apria/aes/services/web/setSfdcAcissession"
	exclude-result-prefixes="xsl aes xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://sndsfdc_orderid_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:sndsfdc_orderid_1_0>
					<arg0>
						<SESSION_ID>
							<xsl:value-of select="//*[local-name()='sessionId']" />
						</SESSION_ID>
						<SFDC_ORDER_ID>
							<xsl:value-of select="//*[local-name()='sfdcOrderId']" />
						</SFDC_ORDER_ID>
						
					</arg0>
				</xsd1:sndsfdc_orderid_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>