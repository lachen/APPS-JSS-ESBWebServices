SELECT
RTRIM(A.BBJPDC) AS Agent_Id,
A.BBWGDZ AS Effective_Date,
A.BBWHDZ AS End_Date,
RTRIM(A.BBBOT5) AS Product,
RTRIM(A.BBCAT5) AS Vendor,
RTRIM(A.BBNJCT) AS Model,
RTRIM(A.BBNZCT) AS Ops_Class,
RTRIM(A.BBBXT5) AS Notes
FROM DTAPDBRC.BAPPPRP A
WHERE (A.BBWHDZ = '0001-01-01' OR A.BBWHDZ >= CURRENT_DATE) AND A.BBAGTS = 'A'
[CONDITION]
ORDER BY A.BBJPDC, A.BBWGDZ DESC
FETCH FIRST 200 ROWS ONLY WITH UR

