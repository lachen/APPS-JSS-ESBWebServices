<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns="http://updateintakefollowups_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:intakeFollowUpResponse
					xmlns:intf="http://AES_IntakeFollowUp/com/apria/web/services/AES_IntakeFollowUp_Interface">
					<followUpResponse>
						<message>
							<xsl:value-of select="//*[local-name()='exception']" />
						</message>
						<result>
							<xsl:value-of select="//*[local-name()='result']" />
						</result>
					</followUpResponse>
				</intf:intakeFollowUpResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>