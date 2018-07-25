<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_GetIntakeWorkOrders_Lib_1_0/com/apria/services/aes/intakeworkorders/AES_IntakeWorkOrders_Intf"
	exclude-result-prefixes="xsl aes xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://getintakeworkorders_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:getintakeworkorders_1_0>
					<arg0>
						<intakeAssociate>
							<xsl:value-of select="//*[local-name()='IntakeAssociate']" />
						</intakeAssociate>
						<intakeNum>
							<xsl:value-of select="//*[local-name()='IntakeNumber']" />
						</intakeNum>
						<workOrders_StartSeq>
							<xsl:value-of select="//*[local-name()='WorkOrdersStartSequence']" />
						</workOrders_StartSeq>
					</arg0>
				</xsd1:getintakeworkorders_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>