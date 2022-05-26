<?php
require_once("account.php");
class User extends Account{
    public function __construct($name, $document, $email, $password){
        parent::__construct($name, $document, $email, $password);
    }

    public function printDataUser(){
        echo("\nName User:  .$this->name  Document User:  .$this->document 
         Email User:  .$this->email  Password User: " .$this->password);
    }
}
?>
