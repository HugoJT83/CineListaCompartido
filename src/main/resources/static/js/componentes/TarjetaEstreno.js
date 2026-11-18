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
 *  - titulo        (string) Título del estreno.
 *  - fechaEstreno  (string) Fecha programada del estreno.
 *  - genero        (string) Género cinematográfico o temático.
 *  - plataforma    (string) Plataforma de emisión (opcional, por defecto "Por confirmar").
 *
 * Evento:
 *  - Botón "Marcar interés": Alterna el estado local de interés del usuario mostrando
 *    un icono de estrella llena (★) si está marcado o vacía (☆) en caso contrario.
 *
 * Ejemplo de uso:
 *   <TarjetaEstreno
 *       titulo="Nebula Roja"
 *       fechaEstreno="2026-06-15"
 *       genero="Ciencia Ficción"
 *       plataforma="Streaming X"
 *   />
 */


function TarjetaEstreno({ titulo, fechaEstreno, genero, plataforma = "Por confirmar" }) {
    const [interesado, setInteresado] = React.useState(false);

    return (
        <div className="tarjeta-estreno">
            <h3>{titulo}</h3>
            <p>Fecha de estreno: {fechaEstreno}</p>
            <p>Genero: {genero}</p>
            <p>Plataforma: {plataforma}</p>
            <button
                type="button"
                className="btn-interes"
                onClick={() => setInteresado(!interesado)}
            >
                Marcar Interés {interesado ? "★" : "☆"}
            </button>
        </div>
    );
}