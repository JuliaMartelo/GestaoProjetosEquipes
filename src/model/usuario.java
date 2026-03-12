package model;

public class usuario {
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private String perfil;

    //Modo construtor

    public usuario(String nomeCompleto, String cpf, String email, String cargo, String login, String senha, String perfil){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    //Getters e Setters

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public void setNomeCompleto(){
        this.nomeCompleto = nomeCompleto;
    }


    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }


    public String getEmail(){
        return this.email;
    }

    public void setEmail(){
        this.email = email;
    }


    public String getCargo(){
        return this.cargo;
    }

    public String getLogin(){
        return this.login;
    }


    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter pelo menos 6 caracteres!");
        }
    }


    public String getPerfil(){
        return this.perfil;
    }
}
