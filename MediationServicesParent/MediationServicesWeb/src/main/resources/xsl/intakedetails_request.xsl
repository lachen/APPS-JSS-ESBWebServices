<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_GetIntakeDetails_Lib_1_0/com/apria/services/aes/intakedetails/AES_IntakeDetails_Intf"
	exclude-result-prefixes="xsl aes xs xsi">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://getintakedetails_2_1.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:getintakedetails_2_1>
					<arg0>
						<intakeAssociate>
							<xsl:value-of select="//*[local-name()='IntakeAssociate']" />
						</intakeAssociate>
						<intakeLineItemStartSeq>
							<xsl:value-of select="//*[local-name()='IntakeLineItemStartSequence']" />
						</intakeLineItemStartSeq>
						<intakeNum>
							<xsl:value-of select="//*[local-name()='IntakeNumber']" />
						</intakeNum>
					</arg0>
				</xsd1:getintakedetails_2_1>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>