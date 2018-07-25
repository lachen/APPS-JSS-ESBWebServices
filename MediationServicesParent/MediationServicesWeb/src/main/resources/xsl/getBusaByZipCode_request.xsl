<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf"
	exclude-result-prefixes="xsl aes xs xsi">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://getbusa_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:getbusa_1_0>
					<arg0>
						<zipCode>
							<xsl:value-of select="//*[local-name()='ZipCode']" />
						</zipCode>
						<tradingPartner>
							<xsl:value-of select="//*[local-name()='TradingPartner']" />
						</tradingPartner>
					</arg0>
				</xsd1:getbusa_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>