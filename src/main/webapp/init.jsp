<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + request.getContextPath()
            + "/";
    session.setAttribute("path", path);
%>
<html>
<head>
    <title>银联信用卡支付</title>
    <script type="text/javascript" src="${path}js/jquery-1.7.2.min.js"></script>
    <link href="${path}pay_files/pay.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="cashier_desk pay_ment">
    <div class="bd">
        <ul class="payment">
            <li>
                <form action="${path}/pay/do_pay" method="post">
                    <label><B>银联信用卡产品测试<B></label><br/>
                    <table>
                        <tr>
                            <td>
                                业务类型：
                            </td>
                            <td>
                                <input type="text" name="tradeType" value="PAY" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                支付方式：
                            </td>
                            <td>
                                <input type="text" name="payWay" value="UNIONPAY" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                支付类型：
                            </td>
                            <td>
                                <input type="text" name="payType" value="UNIONPAY_EXPRESSPAY" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                商户ID：
                            </td>
                            <td>
                                <input type="text" name="merchantId" value="${pay.merchantId }" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                商户名称：
                            </td>
                            <td>
                                <input type="text" name="merchantName" value="${pay.merchantName}" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                订单号：
                            </td>
                            <td>
                                <input type="text" name="orderNo" value="${pay.orderNo }" ><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                订单金额：
                            </td>
                            <td>
                                <input type="text" name="amount" value="${pay.amount}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                手续费：
                            </td>
                            <td>
                                <input type="text" name="fee" value="${pay.fee}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                币种：
                            </td>
                            <td>
                                <input type="text" name="currency" value="${pay.currency.name()}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                商户支付key：
                            </td>
                            <td>
                                <input type="text" name="payKey" value="${pay.payKey}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                持卡人名：
                            </td>
                            <td>
                                <input type="text" name="firstName" value="${pay.firstName}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                持卡人姓：
                            </td>
                            <td>
                                <input type="text" name="lastName" value="${pay.lastName}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                身份证：
                            </td>
                            <td>
                                <input type="text" name="idNo" value="${pay.idNo}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                手机号：
                            </td>
                            <td>
                                <input type="text" name="mobile" value="${pay.mobile}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                cardNum：
                            </td>
                            <td>
                                <input type="text" name="cardNum" value="${pay.cardNum}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                cvv：
                            </td>
                            <td>
                                <input type="text" name="cvv" value="${pay.cvv}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                卡有效年：
                            </td>
                            <td>
                                <input type="text" name="expireYear" value="${pay.expireYear}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                卡有效月：
                            </td>
                            <td>
                                <input type="text" name="expireMonth" value="${pay.expireMonth}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                所属国家或地区：
                            </td>
                            <td>
                                <input type="text" name="addressContry" value="${pay.addressContry}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                卡所属的邮箱：
                            </td>
                            <td>
                                <input type="text" name="email" value="${pay.email}"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                商品名称：
                            </td>
                            <td>
                                <input type="text" name="transName" value="矿泉水"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                商品数量：
                            </td>
                            <td>
                                <input type="text" name="quantity" value="5"><span style="color: red">*</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                门店ID：
                            </td>
                            <td>
                                <input type="text" name="storeId" value="101">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                销售员ID：
                            </td>
                            <td>
                                <input type="text" name="seller" value="1010">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                通知地址：
                            </td>
                            <td>
                                <input type="text" name="callBackUrl" value="${pay.callBackUrl}">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                备注：
                            </td>
                            <td>
                                <input type="text" name="remark" value="银联信用产品测试">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                扩展字段1：
                            </td>
                            <td>
                                <input type="text" name="field1" value="银">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                扩展字段2：
                            </td>
                            <td>
                                <input type="text" name="field2" value="联">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                扩展字段3：
                            </td>
                            <td>
                                <input type="text" name="field3" value="信">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                扩展字段4：
                            </td>
                            <td>
                                <input type="text" name="field4" value="用">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                扩展字段5：
                            </td>
                            <td>
                                <input type="text" name="field5" value="卡">
                            </td>
                        </tr>
                    </table>
                    <p class="pay_btn">
                        <input type="submit" value="支付体验"/>
                    </p>
                </form>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
<script>
    $(function () {
        $("#footer").text("Copyright © 2015-" + new Date().getFullYear() + " 微服务知否版权所有")
    })
</script>