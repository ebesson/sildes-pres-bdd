'use strict';

angularBookApp.controller('bookController',function ($scope,$location, Book){

	Book.fetch().success(function(resp){
    	$scope.books = resp;
    });

    $scope.books = [{"id":1,"title":"test","description":"zazaza","releaseYear":1999},{"id":2,"title":"aa","description":"desc","releaseYear":2000}];
    $scope.user = {"name":"John","firstname":"Doe","role":"manager"};

    $scope.isManager = 'manager' == $scope.user.role;

    $scope.gotoNewBookPage = function(){
    	$location.path("/book/new");
    };

    $scope.gotoListBookPage = function(){
       	$location.path("/book/list");
    };
});