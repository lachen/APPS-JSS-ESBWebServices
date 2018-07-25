<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:aes="http://AES_GetWorkOrderDetails_Lib_1_0/com/apria/services/aes/workorderdetails/AES_WorkOrderDetails_Intf"
	exclude-result-prefixes="xsl aes xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://getworkorderstatus_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:getworkorderstatus_1_0>
					<arg0>
						<WONum>
							<xsl:value-of select="//*[local-name()='WorkOrderNumber']" />
						</WONum>
						<WOBU>
							<xsl:value-of select="//*[local-name()='WorkOrderBusinessUnit']" />
						</WOBU>
						<intakeCode_StartSeq>
							<xsl:value-of select="//*[local-name()='IntakeCodeStartSequence']" />
						</intakeCode_StartSeq>
					</arg0>
				</xsd1:getworkorderstatus_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>