<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<pur:getPurchaseOrderInfoResponse xmlns:pur="http://com.apria.ap/purchaseorderlookup/">
					<xsl:copy-of select="."/>
				</pur:getPurchaseOrderInfoResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>