<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns="http://sndsfdc_orderid_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:setAcisSessionIdForSfdcResponse
					xmlns:intf="http://AES_SetAcisSessionForSfdc/com/apria/aes/services/web/setSfdcAcissession">
						<message>
							<xsl:value-of select="//*[local-name()='RESPONSE_MSG']" />
						</message>
				</intf:setAcisSessionIdForSfdcResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>