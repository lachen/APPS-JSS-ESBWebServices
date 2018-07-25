<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns2="http://getworkorderstatus_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns2">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getWorkOrderDetailsResponse
					xmlns:intf="http://AES_GetWorkOrderDetails_Lib_1_0/com/apria/services/aes/workorderdetails/AES_WorkOrderDetails_Intf">
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
						<WorkOrderStatus>
							<xsl:value-of select="//*[local-name()='WOStatus']" />
						</WorkOrderStatus>
						<DeliveryDate>
							<xsl:value-of select="//*[local-name()='deliveryDate']" />
						</DeliveryDate>
						<DeliveryGMT>
							<xsl:value-of select="//*[local-name()='deliveryGMT']" />
						</DeliveryGMT>
						<DeliveryGMTDST>
							<xsl:value-of select="//*[local-name()='deliveryGMTDST']" />
						</DeliveryGMTDST>
						<DeliveryTime>
							<xsl:value-of select="//*[local-name()='deliveryTime']" />
						</DeliveryTime>
						<DeliveryTimeZone>
							<xsl:value-of select="//*[local-name()='deliveryTimeZone']" />
						</DeliveryTimeZone>

						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getworkorderstatus_1_0Response/return/followupCode[recStatus = 'A']"/>

						<IntakeCodeRecordCount>
							<xsl:value-of select="//*[local-name()='intakeCode_RecCount']" />
						</IntakeCodeRecordCount>
						<IntakeCodeRecordOverflow>
							<xsl:value-of select="//*[local-name()='intakeCode_RecOverFlow']" />
						</IntakeCodeRecordOverflow>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="soap:Envelope/soap:Body/ns2:getworkorderstatus_1_0Response/return/recStatus" />
						</RecordStatus>
						<intakeNumber>
							<xsl:value-of select="//*[local-name()='intakeNum']" />
						</intakeNumber>
						<intakeAssociate>
							<xsl:value-of select="//*[local-name()='intakeAssociate']" />
						</intakeAssociate>
					</output>
				</intf:getWorkOrderDetailsResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
	<xsl:template match="followupCode">
		<FollowupCode>
			<Code>
				<xsl:value-of select="code" />
			</Code>
			<Status>
				<xsl:value-of select="recStatus" />
			</Status>
		</FollowupCode>
	</xsl:template>
</xsl:stylesheet>