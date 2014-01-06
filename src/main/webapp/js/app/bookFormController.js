'use strict';

angularBookApp.controller('bookFormController',function ($scope,$location, Book){

    $scope.addBook = function(book){
    	Book.create(book);
    	$location.path("/book/list");
    };
});