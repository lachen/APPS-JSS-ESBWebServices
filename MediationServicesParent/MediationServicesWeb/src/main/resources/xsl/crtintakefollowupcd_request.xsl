<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_CRT_Intake_FollowUpCodeV1/com/apria/web/services/intake/followcode/AES_CRTIntakeFollowUpCode"
	exclude-result-prefixes="xsl aes xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://crtintakefollowupcd_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:crtintakefollowupcd_1_0>
					<arg0>
						<intakeAssociate>
							<xsl:value-of select="//*[local-name()='intakeAssociate']" />
						</intakeAssociate>
						<intakeFollowupCd>
							<xsl:value-of select="//*[local-name()='followupCodeList']" />
						</intakeFollowupCd>
						<intakeFollowupText>
							<xsl:value-of select="//*[local-name()='intakeFollowupText']" />
						</intakeFollowupText>
						<intakeNum>
							<xsl:value-of select="//*[local-name()='intakeNumber']" />
						</intakeNum>
						<recStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</recStatus>
						<workOrder>
							<xsl:value-of select="//*[local-name()='workOrder']" />
						</workOrder>
					</arg0>
				</xsd1:crtintakefollowupcd_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>