/**
 * TarjetaEstreno
 * ---------------
 * Componente de React (sin build, cargado via Babel Standalone) que
 * muestra un estreno como una tarjeta simple.
 *
 * Se guarda en static/js/componentes/TarjetaEstreno.js y se carga desde
 * templates/estrenos.html con:
 *   <script type="text/babel" src="/js/componentes/TarjetaEstreno.js"></script>
 *
 * Props que debe recibir:
 *  - titulo        (string) Titulo del estreno.
*     TODO doc
 *
 * Evento:
 *  - Boton "Marcar interes": TODO doc
 *
 * Ejemplo de uso:
 *   <TarjetaEstreno
 *       titulo="Nebula Roja"
 *       TODO doc
 *   />
 */

// TODO 1: declara la funcion TarjetaEstreno y recibe las props con
//         desestructuracion: { titulo, fechaEstreno, genero, plataforma }.
//         Dale a "plataforma" el valor por defecto "Por confirmar".
function TarjetaEstreno() {

    // TODO 2: crea el estado local "interesado" (false por defecto) con
    //         React.useState y guarda tambien su funcion "setInteresado".


    // TODO 3: devuelve (return) el JSX de la tarjeta. La raiz debe ser un
    //         <li> con className="tarjeta-estreno" (ojo: en JSX se escribe
    //         className, no class), porque la tarjeta se pinta dentro del
    //         <ul id="lista-estrenos"> de estrenos.html. Dentro:
    //           - <h3> con el titulo
    //           - <p> "Fecha de estreno: ..." con la fecha
    //           - <p> "Genero: ..." con el genero
    //           - <p> "Plataforma: ..." con la plataforma
    //           - <button type="button" className="btn-interes"> con el
    //             texto "Marcar interes" precedido del icono:
    //               ★ si interesado es true, ☆ si es false
    //             (usa un operador ternario dentro de llaves { }).
    //
    // TODO 4: al boton anadele onClick para invertir el estado:
    //           onClick={() => setInteresado(!interesado)}
    //
    // Mientras no lo completes, la tarjeta no pinta nada:
    return null;
}