SELECT
    C.BEI8DC AS BU,
	RTRIM(P.C6JPDC) AS PATIENT_ID,
	RTRIM(P.C6HNXT) AS FIRST_NM,
	RTRIM(P.C6HOXT) AS MIDDLE_NM,
	RTRIM(P.C6HPXT) AS LAST_NM,
	P.C6C2TD AS DOB,
	RTRIM(A.BPC6XT) AS ADDR_1,
	RTRIM(A.BPC7XT) AS ADDR_2,
	RTRIM(A.BPC5XT) AS City,
	RTRIM(A.BPE7DC) AS State,
	A.BPDMBN AS Zip_Code,
    CASE WHEN C.BEEHCN = A.BPFCBN THEN 'Y' ELSE 'N' END PERMANENT_FLG,
	A.BPHUTS AS PRIMARY_ADDR_FLG,
	A.BPP1TS AS BILLING_ADDR_FLG,
	A.BPP2TS AS DELIVERY_ADDR_FLG,
	A.BPKSBN || '-' || A.BPKTBN || '-'||A.BPKUBN AS PHONE
FROM DTAPDBRC.BCSTMRP C -- CUST
	JOIN DTAPDBRC.BCSTPAP P -- CUST_PATIENT
		ON C.BEJPDC = P.C6JPDC 
	JOIN DTAPDBRC.BCSTADP A -- CUST_ADDR
		ON P.C6JPDC = A.BPJPDC
WHERE 1 = 1
[CONDITION]
FETCH FIRST 500 ROWS ONLY WITH UR
