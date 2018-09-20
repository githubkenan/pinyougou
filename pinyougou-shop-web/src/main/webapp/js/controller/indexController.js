app.controller('indexController', function ($scope, $controller, loginService) {

    //读取登录名称
    $scope.showName = function () {
        loginService.logName().success(
            function (response) {
            $scope.logName=response.logName;
        });
    }
});
