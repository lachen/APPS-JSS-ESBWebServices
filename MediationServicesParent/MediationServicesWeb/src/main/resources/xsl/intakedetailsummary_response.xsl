<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://getintakestatus_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getIntakeDetailsSummaryResponse
					xmlns:intf="http://AES_IntakeStatus_Lib_1_0/com/apria/services/aes/intakestatus/AES_GetIntakeStatus_Intf">
					<output>
						<CustomerId>
							<xsl:value-of select="//*[local-name()='customerID']" />
						</CustomerId>
						<CustomerFirstName>
							<xsl:value-of select="//*[local-name()='custFirstName']" />
						</CustomerFirstName>
						<CustomerLastName>
							<xsl:value-of select="//*[local-name()='custLastName']" />
						</CustomerLastName>
						<CustomerMiddleInitial>
							<xsl:value-of select="//*[local-name()='custMiddleInitial']" />
						</CustomerMiddleInitial>
						<IntakeStatus>
							<xsl:value-of select="//*[local-name()='intakeStatus']" />
						</IntakeStatus>
						<IntakeBusinessUnit>
							<xsl:value-of select="//*[local-name()='intakeBU']" />
						</IntakeBusinessUnit>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
						<physicianId>
							<xsl:value-of select="//*[local-name()='physicianID']" />
						</physicianId>
						<referralId>
							<xsl:value-of select="//*[local-name()='referralID']" />
						</referralId>
					</output>
				</intf:getIntakeDetailsSummaryResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>