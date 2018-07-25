<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns="http://assignintakewrkgrp_1_0.wsbeans.iseries/"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8"
		indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
				<intf:assignIntakeWrkGroupResponse
					xmlns:intf="http://AES_AssignIntakeWrkGrp/com/apria/web/services/AES_AssignIntakeWorkGroup" xmlns:se="http://AES_AssignIntakeWrkGrp/com/apria/web/services">
					<se:AES_IntakeResponse>
						<message>
							<xsl:value-of select="//*[local-name()='exception']" />
						</message>
						<result>
							<xsl:value-of select="//*[local-name()='result']" />
						</result>
					</se:AES_IntakeResponse>
				</intf:assignIntakeWrkGroupResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>