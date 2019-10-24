<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmail_functionProxyid" scope="session" class="email_webservice.Email_functionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmail_functionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmail_functionProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmail_functionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        email_webservice.Email_function getEmail_function10mtemp = sampleEmail_functionProxyid.getEmail_function();
if(getEmail_function10mtemp == null){
%>
<%=getEmail_function10mtemp %>
<%
}else{
        if(getEmail_function10mtemp!= null){
        String tempreturnp11 = getEmail_function10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String _url_1id=  request.getParameter("_url16");
            java.lang.String _url_1idTemp = null;
        if(!_url_1id.equals("")){
         _url_1idTemp  = _url_1id;
        }
        java.lang.String validateEmailAddress13mtemp = sampleEmail_functionProxyid.validateEmailAddress(_url_1idTemp);
if(validateEmailAddress13mtemp == null){
%>
<%=validateEmailAddress13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(validateEmailAddress13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String _url_2id=  request.getParameter("_url21");
            java.lang.String _url_2idTemp = null;
        if(!_url_2id.equals("")){
         _url_2idTemp  = _url_2id;
        }
        String _payload_3id=  request.getParameter("_payload23");
            java.lang.String _payload_3idTemp = null;
        if(!_payload_3id.equals("")){
         _payload_3idTemp  = _payload_3id;
        }
        sampleEmail_functionProxyid.sendEmail(_url_2idTemp,_payload_3idTemp);
break;
case 25:
        gotMethod = true;
        String url_4id=  request.getParameter("url28");
            java.lang.String url_4idTemp = null;
        if(!url_4id.equals("")){
         url_4idTemp  = url_4id;
        }
        String _payload_5id=  request.getParameter("_payload30");
            java.lang.String _payload_5idTemp = null;
        if(!_payload_5id.equals("")){
         _payload_5idTemp  = _payload_5id;
        }
        sampleEmail_functionProxyid.sendEmailBatch(url_4idTemp,_payload_5idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>