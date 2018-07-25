<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	exclude-result-prefixes="xsl xs xsi" >
	<xsl:output method="xml" omit-xml-declaration="no" encoding="UTF-8" indent="yes" />
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd1="http://updinsinf_frm_eeresp_1_0.wsbeans.iseries/">
			<soap:Header />
			<soap:Body>
				<xsd1:updinsinf_frm_eeresp_1_0>
					<arg0>
						<deductableAmt>
							<xsl:value-of select="//*[local-name()='_DeductableAmt']" />
						</deductableAmt>
						<deductableAmtMet>
							<xsl:value-of select="//*[local-name()='_DeductableAmtMet']" />
						</deductableAmtMet>
						<EEPlanName>
							<xsl:value-of select="//*[local-name()='_EEPlanName']" />
						</EEPlanName>
						<insEffDate>
							<xsl:value-of select="//*[local-name()='_InsEffDate']" />
						</insEffDate>
						<OOPMax>
							<xsl:value-of select="//*[local-name()='_OOPMax']" />
						</OOPMax>
						<OOPMaxMet>
							<xsl:value-of select="//*[local-name()='_OOPMaxMet']" />
						</OOPMaxMet>
						<patientID>
							<xsl:value-of select="//*[local-name()='_PatientID']" />
						</patientID>
						<payorID>
							<xsl:value-of select="//*[local-name()='_PayorID']" />
						</payorID>
						<planCoverPercnt>
							<xsl:value-of select="//*[local-name()='_PlanCoverPercnt']" />
						</planCoverPercnt>
						<planID>
							<xsl:value-of select="//*[local-name()='_PlanID']" />
						</planID>
					</arg0>
				</xsd1:updinsinf_frm_eeresp_1_0>
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>