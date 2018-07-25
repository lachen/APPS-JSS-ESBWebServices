<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns="http://crtintakefollowupcd_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:createIntakeFollowUpCodeResponse
					xmlns:intf="http://AES_CRT_Intake_FollowUpCodeV1/com/apria/web/services/intake/followcode/AES_CRTIntakeFollowUpCode">
					<output1>
						<Result>
							<xsl:value-of select="//*[local-name()='result']" />
						</Result>
						<message>
							<xsl:value-of select="//*[local-name()='exception']" />
						</message>
					</output1>
				</intf:createIntakeFollowUpCodeResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>