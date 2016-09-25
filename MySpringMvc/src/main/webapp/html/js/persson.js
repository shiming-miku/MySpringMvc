/**
 * Created by shiming-kirino on 2016/7/22.
 */
//外部控制器引用
var app=angular.module("myApp",[]);

app.service('service1',function () {
    this.myFun=function (x) {
        return x.toString(16);
    }
});

app.filter('myFormat',['service1',function (service1) {
    return function (x) {
        return service1.myFun(x);
    }
}]);

app.controller("perssonController",function ($scope,$http,$timeout,$interval,service1) {
    // $http.get("test.html").then(function (response) {
    //     $scope.httpname=response.data;
    // })
    $http.get("data.html").success(function (response) {
        alert(response);
       $scope.firstName=response.records;
    });
    $scope.firstName="one";
    $scope.lastName="last";
    $scope.users=[
        {name:'miku',guojia:'りほう',age:16 },
        {name:'saber',guojia:'english',age:300},
        {name:'shiming',guojia:'中国',age:24}
    ];
    $scope.nums=[7,89,90,9000,567];
    $scope.options= {
        guojia1: {name: '中国', value: 'zhongguo'},
        guojia2: {name: '日本', value: 'riben'},
        guojia3: {name: '美国', value: 'meiguo'}
    };
    $scope.theTime= new Date().toLocaleTimeString();
    $timeout(function () {
        $scope.firstName="shiming";
    },2000);
    $interval(function () {
        $scope.theTime=new Date().toLocaleTimeString();
        $scope.servicevalue=service1.myFun(255);
    },1000);

});