'use strict';

var angularBookApp = angular.module('bookshopApp', ['ngRoute']);

angularBookApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.
	when('/book/list', {templateUrl : 'views/book-list.html',   controller : 'bookController'}).
	when('/book/new',  {templateUrl : 'views/book-new.html',    controller : 'bookFormController'}).
    when('/book/:id',  {templateUrl : 'views/book-detail.html', controller : 'bookFormController'}).
	otherwise({redirectTo : '/book/list'	});
} ]);
