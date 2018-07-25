<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_IntakeFollowUp/com/apria/web/services/AES_IntakeFollowUp_Interface"
	exclude-result-prefixes="xsl aes xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://updateintakefollowups_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:updateintakefollowups_1_0>
					<arg0>
						<action>
							<xsl:value-of select="//*[local-name()='action']" />
						</action>
						<associateID>
							<xsl:value-of select="//*[local-name()='associateId']" />
						</associateID>
						<followUpCode>
							<xsl:value-of select="//*[local-name()='followUpCode']" />
						</followUpCode>
						<followUpNote>
							<xsl:value-of select="//*[local-name()='followUpNote']" />
						</followUpNote>
						<intakeNumber>
							<xsl:value-of select="//*[local-name()='intakeNo']" />
						</intakeNumber>
						<performer>
							<xsl:value-of select="//*[local-name()='performer']" />
						</performer>
						<workOrderNumber>
							<xsl:value-of select="//*[local-name()='workOrderNo']" />
						</workOrderNumber>
					</arg0>
				</xsd1:updateintakefollowups_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>