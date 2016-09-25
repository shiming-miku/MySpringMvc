/**
 * Created by shiming-kirino on 2016/7/31.
 */

var app=angular.module("table",[]);

app.controller("myTableController",function ($scope,$http) {
    $scope.names=[
        {name:"shiming",age:24},
        {name:"shixing",age:24}
    ];
    //本地用不了
    /*$http.get("http://www.runoob.com/try/angularjs/data/Customers_JSON.php").success(function (response) {
        alert(response.records);
        $scope.names=response.records;
    });*/
});