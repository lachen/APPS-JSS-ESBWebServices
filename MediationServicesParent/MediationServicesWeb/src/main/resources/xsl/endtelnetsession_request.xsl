<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_EndTelnetSession_Lib_1_0/com/apria/services/aes/endtelnetsession/AES_EndTelnetSession_Intf"
	exclude-result-prefixes="xsl aes xs xsi">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://endtelnetsession.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:endtelnetsession>
					<arg0>
						<deviceName>
							<xsl:value-of select="//*[local-name()='sessionId']" />
						</deviceName>
						<userID>
							<xsl:value-of select="//*[local-name()='userId']" />
						</userID>
					</arg0>
				</xsd1:endtelnetsession>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>