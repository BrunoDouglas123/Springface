import React from "react";
import "./Cadastro.css";

function Cadastro() {
  return (
    <div className="container">
      <div className="formulario">
        <form action="">
          <input type="text" placeholder="Nome" required />
          <br></br>
          <br></br>
          <input type="email" placeholder="Email" required />
          <br></br>
          <br></br>
          <input type="password" placeholder="Senha" required />
          <br></br>
          <br></br>
          <input className="login" type="submit" placeholder="LOGIN" />
        </form>
      </div>
    </div>
  );
}

export default Cadastro;
