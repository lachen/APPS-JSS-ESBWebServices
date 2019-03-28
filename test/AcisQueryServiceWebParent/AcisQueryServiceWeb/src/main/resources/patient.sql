SELECT
A.C6JPDC as Patient_ID, 
A.C6HNXT AS Patient_FirstName,
A.C6HOXT AS Patient_MiddleName,
A.C6HPXT as Patient_LastName,
A.C6C2TD as Date_Of_Birth, 
B.BPDMBN as Zip_Code 
FROM 
DTAPDBRC.BCSTPAP a, DTAPDBRC.BCSTADP b  
WHERE 
A.C6JPDC=B.BPJPDC AND       
A.C6JPDC = ? 
WITH UR
