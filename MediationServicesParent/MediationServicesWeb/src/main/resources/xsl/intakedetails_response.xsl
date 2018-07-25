<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns2="http://getintakedetails_2_1.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns2">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getIntakDetailsResponse
					xmlns:intf="http://AES_GetIntakeDetails_Lib_1_0/com/apria/services/aes/intakedetails/AES_IntakeDetails_Intf">
					<output>
						<CustomerId>
							<xsl:value-of select="//*[local-name()='custID']" />
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
						<CustomerDOB>
							<xsl:value-of select="//*[local-name()='custDOB']" />
						</CustomerDOB>
						<CustomerResidentState>
							<xsl:value-of select="//*[local-name()='custResidentState']" />
						</CustomerResidentState>
						<IntakeStatus>
							<xsl:value-of select="//*[local-name()='intakeStatus']" />
						</IntakeStatus>
						<IntakeBusinessUnit>
							<xsl:value-of select="//*[local-name()='intakeBU']" />
						</IntakeBusinessUnit>
						<IntakeDeliveryType>
							<xsl:value-of select="//*[local-name()='intakeDeliveryType']" />
						</IntakeDeliveryType>
						<IntakeSourceCode>
							<xsl:value-of select="//*[local-name()='intakeSrcCode']" />
						</IntakeSourceCode>
						<DABCCFlag>
							<xsl:value-of select="//*[local-name()='DABCCFlag']" />
						</DABCCFlag>
						<DeliveryAddressCity>
							<xsl:value-of select="//*[local-name()='deliveryAddressCity']" />
						</DeliveryAddressCity>
						<DeliveryAddressState>
							<xsl:value-of select="//*[local-name()='deliveryAddressState']" />
						</DeliveryAddressState>
						<DeliveryDate>
							<xsl:value-of select="//*[local-name()='intakeDeliveryDate']" />
						</DeliveryDate>
						<DeliveryTime>
							<xsl:value-of select="//*[local-name()='intakeDeliveryTime']" />
						</DeliveryTime>

						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getintakedetails_2_1Response/return/intakeEquipment[lineType != '']"/>

						<LineItemOverflow>
							<xsl:value-of select="//*[local-name()='lineItem_Overflow']" />
						</LineItemOverflow>
						<LineItemsRecordCount>
							<xsl:value-of select="//*[local-name()='lineItem_RecCount']" />
						</LineItemsRecordCount>
						<OrderType>
							<xsl:value-of select="//*[local-name()='orderType']" />
						</OrderType>
						<PayorsRecordCount>
							<xsl:value-of select="//*[local-name()='payor_RecCnt']" />
						</PayorsRecordCount>

						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getintakedetails_2_1Response/return/payors[ID != '']"/>

						<PhysicianId>
							<xsl:value-of select="//*[local-name()='physicianID']" />
						</PhysicianId>
						<PhysicianName>
							<xsl:value-of select="//*[local-name()='physicianName']" />
						</PhysicianName>
						<ReferralId>
							<xsl:value-of select="//*[local-name()='referralID']" />
						</ReferralId>
						<ReferralName>
							<xsl:value-of select="//*[local-name()='referralName']" />
						</ReferralName>
						<ServiceDate>
							<xsl:value-of select="//*[local-name()='serviceDate']" />
						</ServiceDate>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
						<GMTOffset>
							<xsl:value-of select="//*[local-name()='intakeDeliveryGMT']" />
						</GMTOffset>
						<DeliveryTimeZone>
							<xsl:value-of
								select="//*[local-name()='intakeDeliveryTimeZone']" />
						</DeliveryTimeZone>
						<DeliveryTimeDSFlag>
							<xsl:value-of
								select="//*[local-name()='intakeDeliveryGMTDST']" />
						</DeliveryTimeDSFlag>
					</output>
				</intf:getIntakDetailsResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
	<xsl:template match="intakeEquipment">
		<LineItems>
			<DeliveryDate>
				<xsl:value-of select="deliveryDate" />
			</DeliveryDate>
			<DeliveryGMT>
				<xsl:value-of select="deliveryGMT" />
			</DeliveryGMT>
			<DeliveryGMTDST>
				<xsl:value-of select="deliveryGMTDST" />
			</DeliveryGMTDST>
			<DeliveryTimeZone>
				<xsl:value-of select="deliveryTimeZone" />
			</DeliveryTimeZone>
			<DeliveryType>
				<xsl:value-of select="deliveryType" />
			</DeliveryType>
			<DiagnosisCode1>
				<xsl:value-of select="diagnosisCode1" />
			</DiagnosisCode1>
			<DiagnosisCode2>
				<xsl:value-of select="diagnosisCode2" />
			</DiagnosisCode2>
			<DiagnosisCode3>
				<xsl:value-of select="diagnosisCode3" />
			</DiagnosisCode3>
			<DiagnosisCode4>
				<xsl:value-of select="diagnosisCode4" />
			</DiagnosisCode4>
			<Hcpc>
				<xsl:value-of select="hcpc" />
			</Hcpc>
			<IntakeChargeable>
				<xsl:value-of select="intakeChargeable" />
			</IntakeChargeable>
			<LineType>
				<xsl:value-of select="lineType" />
			</LineType>
			<OpsClass>
				<xsl:value-of select="opsClass" />
			</OpsClass>
			<PayorId>
				<xsl:value-of select="payorId" />
			</PayorId>
			<productId>
				<xsl:value-of select="productID" />
			</productId>
			<DeliveryTime>
				<xsl:value-of select="intakeEquipmentDeliveryTime" />
			</DeliveryTime>
		</LineItems>
	</xsl:template>
	<xsl:template match="payors">
		<Payors>
			<AgreementID>
				<xsl:value-of select="agreementID" />
			</AgreementID>
			<ID>
				<xsl:value-of select="ID" />
			</ID>
			<Name>
				<xsl:value-of select="name" />
			</Name>
			<PlanType>
				<xsl:value-of select="planType" />
			</PlanType>
			<ReportingID>
				<xsl:value-of select="reportingID" />
			</ReportingID>
			<Tier>
				<xsl:value-of select="tier" />
			</Tier>
		</Payors>
	</xsl:template>
</xsl:stylesheet>