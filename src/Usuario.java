/**
 * La clase Usuario representa a un usuario en el sistema.
 */
public class Usuario {

    private String nombreUsuario;
    private String contraseña;
    private String gmail;
    private String coordenadas;
    private Pedido pedido=null;

    /**
     * Crea una nueva instancia de la clase Usuario.
     *
     * @param nombreUsuario el nombre de usuario del usuario.
     * @param contraseña la contraseña del usuario.
     * @param gmail la dirección de correo electrónico del usuario.
     * @param coordenadas las coordenadas del usuario.
     */
    public Usuario(String nombreUsuario, String contraseña, String gmail, String coordenadas){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.gmail = gmail;
        this.coordenadas = coordenadas;
    }

    /**
     * Crea un nuevo pedido con las coordenadas especificadas.
     *
     * @param coordenadas las coordenadas del pedido.
     * @return el pedido creado.
     */
    public Pedido crearPedido(String coordenadas){
        insertarCoordenadas(coordenadas);
        Pedido pedido = new Pedido();
        this.pedido = pedido;
        return pedido;
    }

    /**
     * Recupera la contraseña del usuario utilizando la dirección de correo electrónico especificada.
     *
     * @param gmail la dirección de correo electrónico para recuperar la contraseña.
     * @return true si el correo electrónico coincide con el registrado en el usuario, false en caso contrario.
     */
    public boolean recuperarContraseña(String gmail){
        if (gmail.equals(this.gmail)){
            enviarGmail();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Envía un correo electrónico al propietario del usuario.
     */
    private void enviarGmail(){
        //aquí se envía el correo electrónico al propietario
    }

    /**
     * Inserta las coordenadas especificadas para el usuario.
     *
     * @param coordenadas las nuevas coordenadas del usuario.
     */
    public void insertarCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Obtiene el estado actual del pedido.
     *
     * @param pedido el pedido del cual se desea obtener el estado.
     * @return el estado actual del pedido.
     */
    public String estadoDelPedido(Pedido pedido){
        return pedido.getEstadoDelPedido;
    }
}