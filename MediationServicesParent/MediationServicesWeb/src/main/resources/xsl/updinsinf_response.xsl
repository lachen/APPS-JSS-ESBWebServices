<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns="http://updinsinf_frm_eeresp_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://updinsinf_frm_eeresp_1_0.wsbeans.iseries/xsd">
			<soap:Header />
			<soap:Body>
			      <xsd:updinsinf_frm_eeresp_1_0Response>
			         <xsd:return>
			            <xsd:_Exception><xsl:value-of select="//*[local-name()='exception']" /></xsd:_Exception>
			            <xsd:_ExceptonDes><xsl:value-of select="//*[local-name()='exceptonDes']" /></xsd:_ExceptonDes>
			         </xsd:return>
			      </xsd:updinsinf_frm_eeresp_1_0Response>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>