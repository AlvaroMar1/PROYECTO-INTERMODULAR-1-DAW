package model;

public class Alumno {
    private int id_alumno;
    private String nia;
    private String nombre;
    private String apellidos;
    private String curso;
    private String grupo;

    public Alumno(){}

        public Alumno(int id_alumno, String nia, String nombre, String apellidos, String curso, String grupo){
            this.id_alumno = id_alumno;
            this.nia = nia;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.curso = curso;
            this.grupo = grupo;
        }

        public int getIdAlumno(){
            return id_alumno;
        }

        public void setIdAlumno(int id_alumno){
            this.id_alumno = id_alumno;
        }

        public String getNia(){
            return nia;
        }

        public void setNia(String nia){
            this.nia = nia;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getApellidos(){
            return apellidos;
        }

        public void setApellidos(String apellidos){
            this.apellidos = apellidos;
        }

        public String getCurso(){
            return curso;
        }

        public void setCurso(String curso){
            this.curso = curso;
        }

        public String getGrupo(){
            return grupo;
        }

        public void setGrupo(String grupo){
            this.grupo = grupo;
        }

    @Override
    public String toString() {
        return "Alumno{" +
                "id_alumno=" + id_alumno +
                ", nia=" + nia +
                ", nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", curso=" + curso +
                ", grupo=" + grupo +
                '}';
    }
}
