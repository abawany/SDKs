<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="GetExpressCheckoutDetails.aspx.cs" Inherits="PayPalAPISample.APICalls.GetExpressCheckoutDetails" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head id="Head1" runat="server">
    <title>PayPal SDK - GetExpressCheckoutDetails</title>
    <link href="sdk.css" type="text/css" rel="stylesheet" />
</head>
<body>
    <div id="wrapper">
    <div id="header">
        <h3>GetExpressCheckoutDetails</h3>
        <div id="apidetails">Obtains information about an Express Checkout transaction. Call this API 
        when the buyer returns to your site after reviewing the payment details on the PayPal site.</div>
    </div>
    <form id="form1" runat="server">
        <div id="request_form">
            <div class="param_name">Express Checkout Token *</div>
            <div class="param_value">
                <input type="text" name="token" id="token" value="" runat="server" />
            </div>
        
            <div class="submit">
                <input id="submit" type="submit" name="submit" value="Submit" runat="server" onserverclick="Submit_Click"/>
            </div>            
        </div>
    </form>
    <div id="relatedcalls"> 
    </div>
    </div>
</body>
</html>