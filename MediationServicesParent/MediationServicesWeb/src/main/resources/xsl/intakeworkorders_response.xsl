<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns2="http://getintakeworkorders_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns2">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getIntakeWorkOrdersResponse
					xmlns:intf="http://AES_GetIntakeWorkOrders_Lib_1_0/com/apria/services/aes/intakeworkorders/AES_IntakeWorkOrders_Intf">
					<output>
						<IntakeStatus>
							<xsl:value-of select="//*[local-name()='intakeStatus']" />
						</IntakeStatus>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getintakeworkorders_1_0Response/return/intakeWorkOrders[WONum != '']"/>

						<WorkOrderRecordCount>
							<xsl:value-of select="//*[local-name()='WO_RecCount']" />
						</WorkOrderRecordCount>
						<WorkOrderRecordOverflow>
							<xsl:value-of select="//*[local-name()='WO_RecOverFlow']" />
						</WorkOrderRecordOverflow>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
					</output>
				</intf:getIntakeWorkOrdersResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
	<xsl:template match="intakeWorkOrders">
		<IntakeWorkOrders>
			<WorkOrderBusinessUnit>
				<xsl:value-of select="WOBU" />
			</WorkOrderBusinessUnit>
			<WorkOrderNumber>
				<xsl:value-of select="WONum" />
			</WorkOrderNumber>
			<WorkOrderStatus>
				<xsl:value-of select="WOStatus" />
			</WorkOrderStatus>
		</IntakeWorkOrders>
	</xsl:template>
</xsl:stylesheet>