<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns2="http://getcustomer_2_0.wsbeans.iseries/"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns2">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getCustomerDetailsByIdResponse
					xmlns:intf="http://AES_GetCustomer_Lib_2_0/com/apria/services/aes/customerdetails/AES_CustomerDetails_Intf">
					<output>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getcustomer_2_0Response/return/billingAddress"/>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getcustomer_2_0Response/return/customer"/>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getcustomer_2_0Response/return/deliveryAddress"/>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:getcustomer_2_0Response/return/permanentAddress"/>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
					</output>
				</intf:getCustomerDetailsByIdResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
	<xsl:template match="billingAddress">
		<BillingAddress>
			<AddressLine1>
				<xsl:value-of select="addressLine1" />
			</AddressLine1>
			<AddressLine2>
				<xsl:value-of select="addressLine2" />
			</AddressLine2>
			<City>
				<xsl:value-of select="city" />
			</City>
			<State>
				<xsl:value-of select="state" />
			</State>
			<Zip>
				<xsl:value-of select="zip" />
			</Zip>
		</BillingAddress>
	</xsl:template>
	<xsl:template match="customer">
		<Customer>
			<CustEmail>
				<xsl:value-of select="custEmail" />
			</CustEmail>
			<CustType>
				<xsl:value-of select="custType" />
			</CustType>
			<DOB>
				<xsl:value-of select="DOB_ISO" />
			</DOB>
			<FirstName>
				<xsl:value-of select="firstName" />
			</FirstName>
			<Gender>
				<xsl:value-of select="gender" />
			</Gender>
			<LastName>
				<xsl:value-of select="lastName" />
			</LastName>
			<MiddleInitial>
				<xsl:value-of select="middleInitial" />
			</MiddleInitial>
		</Customer>
	</xsl:template>
	<xsl:template match="deliveryAddress">
		<DeliveryAddress>
			<AddressLine1>
				<xsl:value-of select="addressLine1" />
			</AddressLine1>
			<AddressLine2>
				<xsl:value-of select="addressLine2" />
			</AddressLine2>
			<City>
				<xsl:value-of select="city" />
			</City>
			<State>
				<xsl:value-of select="state" />
			</State>
			<Zip>
				<xsl:value-of select="zip" />
			</Zip>
		</DeliveryAddress>
	</xsl:template>
	<xsl:template match="permanentAddress">
		<PermanentAddress>
			<AddressLine1>
				<xsl:value-of select="addressLine1" />
			</AddressLine1>
			<AddressLine2>
				<xsl:value-of select="addressLine2" />
			</AddressLine2>
			<City>
				<xsl:value-of select="city" />
			</City>
			<State>
				<xsl:value-of select="state" />
			</State>
			<Zip>
				<xsl:value-of select="zip" />
			</Zip>
		</PermanentAddress>
	</xsl:template>
</xsl:stylesheet>