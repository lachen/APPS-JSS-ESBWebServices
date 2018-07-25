<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	exclude-result-prefixes="xsl xs xsi">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://get_docclassificationdetails_by_trn_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:get_docclassificationdetails_by_trn_1_0>
					<arg0>
						<CPU>
							<xsl:value-of select="//*[local-name()='_CPU']" />
						</CPU>
						<custID>
							<xsl:value-of select="//*[local-name()='_CustID']" />
						</custID>
						<docType>
							<xsl:value-of select="//*[local-name()='_DocType']" />
						</docType>
					</arg0>
				</xsd1:get_docclassificationdetails_by_trn_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>