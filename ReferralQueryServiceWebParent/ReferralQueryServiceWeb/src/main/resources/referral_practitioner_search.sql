SELECT T.SRC_CUST_ID RFRL_ID, AD.ZIP_CD,AD.ST_CD, C.CITY_NM,
       MP.LAST_NM || ', ' || MP.FIRST_NM || ' ' || MP.MID_NM as RFRL_NM, ACCT_VAL_CD,
       Trim(Upper(RFRL_SUB_TYPE_NM)) as RFRL_SUB_TYPE_NM, D.VALID_RFRL_SRC_IN
 FROM  ODS.T_CUST_XREF T, ODS.O_CUST D, ODS.O_CUST_ADDR AD, ODS.O_MDCL_PROF MP,
       ODS.O_ACCT_VAL A, ODS.O_CITY C, ODS.O_RFRL_SUB_TYPE TYP
 WHERE T.SRC_CD='ACIS' AND T.SRC_CUST_SEQ_NR = 1  
   AND D.CUST_UNQ_SK=T.CUST_UNQ_SK  AND AD.CUST_UNQ_SK=D.CUST_UNQ_SK 
   AND AD.CURR_IN='Y' AND D.CURR_IN='Y' AND T.SRC_CUST_TYPE_CD='MP' 
   AND MP.MDCL_PROF_SK=D.CUST_SK AND MP.REC_STS_CD='A' 
   AND A.ACCT_VAL_SK=D.ACCT_VAL_SK
   AND C.CITY_SK=AD.CITY_SK
   AND TYP.RFRL_SUB_TYPE_SK=D.RFRL_SUB_TYPE_SK
   [CONDITION2]

ORDER BY RFRL_NM, CITY_NM

FETCH FIRST 101 ROWS ONLY OPTIMIZE FOR 101 ROWS WITH UR
