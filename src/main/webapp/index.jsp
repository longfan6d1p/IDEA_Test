<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/2 0002
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vue.js"></script>
<script src="js/axios-0.18.0.js"></script>
<html>
<head>
    <title>页面</title>
</head>
<body>
<h1>主页！！！！</h1>
<a href="/account/findAll">查询所有账户</a>
<div id="app">
    <form>
        <input type="text" name="name" v-model="formData.name"><br/>
        <input type="text" name="money" v-model="formData.money"><br/>
        <input type="button" name="提交" @click="send()">
    </form>
</div>
<script>
    var v = new Vue({
        el:"#app",
        data:{
            formData:{
                name:"",
                money:0
            }
        },
        methods:{
            send(){
                axios.post("/account/add",this.formData).then(response=>{
                    alert(response.data.msg)
                })
            }
        }
    })
</script>
</body>
</html>
