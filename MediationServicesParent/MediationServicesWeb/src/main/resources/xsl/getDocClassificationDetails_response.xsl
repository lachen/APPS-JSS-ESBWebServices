<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:ns2="http://get_docclassificationdetails_by_trn_1_0.wsbeans.iseries/"
	xmlns:ns="http://get_docclassificationdetails_by_trn_1_0.wsbeans.iseries/xsd"
	exclude-result-prefixes="xs xsi xsl ns2">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
			<soapenv:Header />
			<soapenv:Body>
				<ns:get_docclassificationdetails_by_trn_1_0Response
					xmlns:ns="http://get_docclassificationdetails_by_trn_1_0.wsbeans.iseries/xsd">
					<ns:return>
						<xsl:apply-templates select="soap:Envelope/soap:Body/ns2:get_docclassificationdetails_by_trn_1_0Response/return/documentStrings"/>
					</ns:return>
				</ns:get_docclassificationdetails_by_trn_1_0Response>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
	<xsl:template match="documentStrings">
		<ns:_DocumentStrings>
			<ns:_DocumentIdentifier>
				<xsl:value-of select="documentIdentifier" />
			</ns:_DocumentIdentifier>
		</ns:_DocumentStrings>
	</xsl:template>
</xsl:stylesheet>