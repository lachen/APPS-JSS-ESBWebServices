<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://checkproductcoverage_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:getProductEligibilityResponse
					xmlns:intf="http://AES_GetProductEligibility_Svcs_1_0/com/apria/services/aes/producteligibility/ProductEligibility">
					<output>
						<coveredBenefit>
							<xsl:value-of select="//*[local-name()='coveredBenefit']" />
						</coveredBenefit>
						<procedureCode>
							<xsl:value-of select="//*[local-name()='procedureCode']" />
						</procedureCode>
						<recordCount>
							<xsl:value-of select="//*[local-name()='recCount']" />
						</recordCount>
						<recordStatus>
							<xsl:value-of select="//*[local-name()='recStatus']" />
						</recordStatus>
						<tranTypeOut>
							<xsl:value-of select="//*[local-name()='tranTypeOut']" />
						</tranTypeOut>
					</output>
				</intf:getProductEligibilityResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>