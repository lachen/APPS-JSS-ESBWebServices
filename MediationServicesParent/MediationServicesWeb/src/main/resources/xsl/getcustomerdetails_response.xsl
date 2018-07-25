<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://getcustomer_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getCustomerDetailsByIdResponse
					xmlns:intf="http://AES_GetCustomer_Lib_1_0/com/apria/services/aes/customerdetails/AES_CustomerDetails_Intf">
					<output>
						<FirstName>
							<xsl:value-of select="//*[local-name()='custFirstName']" />
						</FirstName>
						<LastName>
							<xsl:value-of select="//*[local-name()='custLastName']" />
						</LastName>
						<MiddleInitial>
							<xsl:value-of select="//*[local-name()='custMiddleInitial']" />
						</MiddleInitial>
						<DateOfBirth>
							<xsl:value-of select="//*[local-name()='DOB']" />
						</DateOfBirth>
						<Gender>
							<xsl:value-of select="//*[local-name()='gender']" />
						</Gender>
						<RecordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</RecordCount>
						<RecordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</RecordStatus>
						<Type>
							<xsl:value-of select="//*[local-name()='type']" />
						</Type>
					</output>
				</intf:getCustomerDetailsByIdResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>