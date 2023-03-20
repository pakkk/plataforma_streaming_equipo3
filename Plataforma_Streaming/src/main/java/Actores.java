public class Actores {
    String nombre;
    String apellido;
    String sexo;
    int edad;
    String nacionalidad;
    double altura;
    double peso;

    public Actores(String nombre, String apellido, String sexo, int edad, String nacionalidad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Actores{" + "Nombre= " + nombre + ", apellido= " + apellido + ", sexo= " + sexo + ", edad= " + edad + ", nacionalidad= " + nacionalidad + ", altura= " + altura + ", peso= " + peso + '}';
    }
}