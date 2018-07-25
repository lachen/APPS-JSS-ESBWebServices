<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://endtelnetsession.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:endAcisSessionResponse
					xmlns:intf="http://AES_EndTelnetSession_Lib_1_0/com/apria/services/aes/endtelnetsession/AES_EndTelnetSession_Intf">
					<output>
						<errorText>
							<xsl:value-of select="//*[local-name()='errorText']" />
						</errorText>
					</output>
				</intf:endAcisSessionResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>