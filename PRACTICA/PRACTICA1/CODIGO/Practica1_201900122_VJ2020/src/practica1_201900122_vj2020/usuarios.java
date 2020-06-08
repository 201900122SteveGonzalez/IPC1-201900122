package practica1_201900122_vj2020;
/**
 *
 * @author Steve González 201900122
 */

public class usuarios {

    public Object REGISTRO[];
    public Object[] numeros;
    public Object[] nicknames;
    public Object[] estados;
    public Object[] intentos;
    public Object[] hundidos;

    public usuarios() {
        this.REGISTRO = new Object[5];
        this.numeros = new Object[100];
        this.nicknames = new Object[100];
        this.estados = new Object[100];
        this.intentos = new Object[100];
        this.hundidos = new Object[100];
        //0. para el numero de usuario
        //1. para el NICKNAME
        //2. para ESTADO
        //3. para INTENTOS
        //4 para BARCOS HUNDIDOS
    }

    public void almacenar_numero_usuario(int numero_usuario) {
        this.REGISTRO[0] = numero_usuario;
        //posicion 0 = nombre 1
        //posicion 1 = nombre 2
    }

    public void almacenar_nickname(String Nickname) {
        this.REGISTRO[1] = Nickname;
        //posicion 0 = nombre 1
        //posicion 1 = nombre 2
    }

    public void almacenar_estado(String estado) {
        this.REGISTRO[2] = estado;
    }

    public void almacenar_intentos(int intentos) {
        this.REGISTRO[3] = intentos;
    }

    public void almacenar_barcos_hundidos(int destruidos) {
        this.REGISTRO[4] = destruidos;
    }

    public void registrar_info_usuario() {
        this.numeros[(int) this.REGISTRO[0]] = (int) this.REGISTRO[0];
        this.nicknames[(int) this.REGISTRO[0]] = String.valueOf(this.REGISTRO[1]);
        this.estados[(int) this.REGISTRO[0]] = String.valueOf(this.REGISTRO[2]);
        this.intentos[(int) this.REGISTRO[0]] = (int) this.REGISTRO[3];
        this.hundidos[(int) this.REGISTRO[0]] = (int) this.REGISTRO[4];
        if (this.numeros[(int) this.REGISTRO[0]] == null) {
            this.numeros[(int) this.REGISTRO[0]] = 0;
        }
        if (this.nicknames[(int) this.REGISTRO[0]] == null) {
            this.nicknames[(int) this.REGISTRO[0]] = "";
        }
        if (this.estados[(int) this.REGISTRO[0]] == null) {
            this.estados[(int) this.REGISTRO[0]] = "";
        }
        if (this.intentos[(int) this.REGISTRO[0]] == null) {
            this.intentos[(int) this.REGISTRO[0]] = 0;
        }
        if (this.hundidos[(int) this.REGISTRO[0]] == null) {
            this.hundidos[(int) this.REGISTRO[0]] = 0;
        }
    }

    public void imprimir_info_ultimo_usuario() {
        System.out.println("############# GAME OVER #############");
        System.out.println("SE REGISTRO LA SIGUIENTE INFORMACION");
        System.out.println("-----------------------------------------------");
        System.out.println("Usuario No. " + (int) this.REGISTRO[0] + 1);
        System.out.println("NICKNAME : " + String.valueOf(this.REGISTRO[1]));
        System.out.println("ESTADO : " + String.valueOf(this.REGISTRO[2]));
        System.out.println("INTENTOS : " + (int) this.REGISTRO[3]);
        System.out.println("BARCOS : " + (int) this.REGISTRO[4]);
        System.out.println("-----------------------------------------------");
    }

    public void imprimir_reporte_completo() {
        System.out.println("          No." + "         NICKNAME" + "            ESTADO  " + "         INTENTOS" + "         BARCOS HUNDIDOS");
        if (this.REGISTRO[0] == null) {
            this.REGISTRO[0] = 0;
        }
        for (int i = 0; i <= (int) this.REGISTRO[0]; i++) {
            if (this.numeros[(int) this.REGISTRO[i]] == null) {
                this.numeros[(int) this.REGISTRO[i]] = 0;
            }
            if (this.nicknames[(int) this.REGISTRO[i]] == null) {
                this.nicknames[(int) this.REGISTRO[i]] = "DESCONOCIDO";
            }
            if (this.estados[(int) this.REGISTRO[i]] == null) {
                this.estados[(int) this.REGISTRO[i]] = "DESCINICUDI";
            }
            if (this.intentos[(int) this.REGISTRO[i]] == null) {
                this.intentos[(int) this.REGISTRO[i]] = 0;
            }
            if (this.hundidos[(int) this.REGISTRO[i]] == null) {
                this.hundidos[(int) this.REGISTRO[i]] = 0;
            }
            System.out.println("           " + this.numeros[i] + "         " + this.nicknames[i] + "            " + this.estados[i] + "           " + this.intentos[i] + "       " + this.hundidos[i]);
        }
    }

}
