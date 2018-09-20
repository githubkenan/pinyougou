//登录服务层
app.service("loginService",function ($http) {

    //读取登录名
    this.logName=function () {
       return  $http.get('../login/name.do');
    }
})
    

