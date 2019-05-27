var formApp = angular.module('formApp', ['ngMessages'])

var url = "http://localhost:8080/form/create";

formApp.controller("AppController", ['$scope', '$http', function ($scope, $http) {

    $scope.isSubmited = false;
    $scope.options = [
        { name: 'A' },
        { name: 'B' },
        { name: 'C' }
    ];

    $scope.clear = function () {
        $scope.data = {
            risco: null,
            nomeCliente: null,
            limiteCredito: null,
            taxaJuros: null
        };

    }

    $scope.clear();

    $scope.submitForm = function (valid) {
        if (valid) {
            $scope.data.risco = $scope.data.risco.name;
            $http.post(url, $scope.data, { headers: { 'Content-Type': 'application/json; charset=UTF-8' } }).then(
                function (response) {
                    alert("Dados Registrados");
                    $scope.clear();
                    $scope.isSubmited = false;
                    return response;
                },
                function (response) {
                    alert("Dados Nao Registrados: Error in server");
                    console.log(response);
                    $scope.userForm.$setUntouched();
                    $scope.isSubmited = false;
                    throw response;
                });
        } else {
            $scope.userForm.$touched = true;
            $scope.isSubmited = true;
        }
    };

    $scope.reset = function () {
        $scope.clear();
        $scope.userForm.$setUntouched();
    }
}]);