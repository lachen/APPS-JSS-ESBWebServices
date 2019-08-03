<html>
  <head>
    <title>DB Test</title>
  </head>
  <body>

	  <%
    com.apria.ws.payersvcs.DBTest tst = new com.apria.ws.payersvcs.DBTest();
    tst.init();
  %>

  <h2>Results</h2>
    Foo <%= tst.getFoo() %><br/>
    Bar <%= tst.getBar() %>

  </body>
</html>
