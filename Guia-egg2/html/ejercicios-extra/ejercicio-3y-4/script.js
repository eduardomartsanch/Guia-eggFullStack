const mostrarMensajeBtn = document.getElementById("mostrarMensajeBtn");

  // Agregar un evento click al botón
  mostrarMensajeBtn.addEventListener("click", function() {
    // Define el mensaje que deseas mostrar
    const mensaje = "¡Hola! Este es un mensaje a elección.";

    // Muestra el mensaje en una ventana emergente
    alert(mensaje);
  });