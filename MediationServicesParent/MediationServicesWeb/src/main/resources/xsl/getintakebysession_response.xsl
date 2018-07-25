<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:ns="http://get_intake_by_session_1_0.wsbeans.iseries/"
	exclude-result-prefixes="xs xsi xsl ns">
	<xsl:output method="xml" omit-xml-declaration="no"
		encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
			<soap:Header />
			<soap:Body>
      			<se:getSessionDetailsBySessionIDResponse xmlns:ge="http://AES_GetIntakeBySessionIDv1/com/apria/aes/services/web/getsession" 
      				xmlns:se="http://AES_GetIntakeBySessionIDv1/com/apria/aes/services/web/getsession/AES_GetIntakeBySession">
					<ge:AES_GetSessionResponse>
						<associateId>
							<xsl:value-of select="//*[local-name()='associate_id']" />
						</associateId>
						<customerId>
							<xsl:value-of select="//*[local-name()='customer_ID']" />
						</customerId>
						<intakeNumber>
							<xsl:value-of select="//*[local-name()='intake_number']" />
						</intakeNumber>
						<message>Success</message>
					</ge:AES_GetSessionResponse>
				</se:getSessionDetailsBySessionIDResponse>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>