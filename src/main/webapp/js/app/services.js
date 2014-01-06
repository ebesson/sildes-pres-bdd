'use strict';

angularBookApp.factory("Book", function ($http) {
    var API_URI = 'rest/book';

    return {

        fetch : function() {
            return $http.get(API_URI);
        },

        create : function(book) {
            return  $http.post(API_URI, book);
        },

        remove  : function(id) {
            return $http.delete(API_URI + '/' + id);
        },

        fetchOne : function(id) {
            return $http.get(API_URI + '/' + id);
        },

        update : function(book) {
             return $http.put(API_URI, book);
        }
    };
});