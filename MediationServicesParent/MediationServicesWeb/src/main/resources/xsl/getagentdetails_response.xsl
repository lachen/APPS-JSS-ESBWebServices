<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://getagentdetails_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getAgentDetailsByIdResponse
					xmlns:intf="http://AES_GetAgentDetails_Lib_1_0/com/apria/services/aes/agentdetails/AES_AgentDetails_Intf">
					<output>
						<AgentName>
							<xsl:value-of select="//*[local-name()='agentName']" />
						</AgentName>
						<ContactName>
							<xsl:value-of select="//*[local-name()='contactName']" />
						</ContactName>
						<FaxNumber>
							<xsl:value-of select="//*[local-name()='faxNum']" />
						</FaxNumber>
						<PhoneNumber>
							<xsl:value-of select="//*[local-name()='phoneNum']" />
						</PhoneNumber>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
						<deliveryCommitment>
							<xsl:value-of select="//*[local-name()='agtProfDeliv']" />
						</deliveryCommitment>
						<productPreference>
							<xsl:value-of select="//*[local-name()='agtProfProd']" />
						</productPreference>
						<contactInfoProfile>
							<xsl:value-of select="//*[local-name()='agtProfContact']" />
						</contactInfoProfile>
					</output>
				</intf:getAgentDetailsByIdResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>