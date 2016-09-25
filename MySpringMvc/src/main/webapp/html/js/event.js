/**
 * Created by shiming-kirino on 2016/8/10.
 */
var app=angular.module("event",[]);

app.controller("myEventController",function ($scope) {
    $scope.count=0;
    $scope.myname="nishi";
    $scope.myvar=true;
    $scope.showfun=function () {
        $scope.myvar=!$scope.myvar;
    }
});