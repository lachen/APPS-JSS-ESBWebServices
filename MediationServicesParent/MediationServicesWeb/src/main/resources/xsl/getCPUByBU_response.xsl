<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://getbusunit_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getCPUByBUResponse
					xmlns:intf="http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf">
					<output>
						<BusinessUnitName>
							<xsl:value-of select="//*[local-name()='businessUnitName']" />
						</BusinessUnitName>
						<CPUName>
							<xsl:value-of select="//*[local-name()='hostName']" />
						</CPUName>
						<RecCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecCount>
					</output>
				</intf:getCPUByBUResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>