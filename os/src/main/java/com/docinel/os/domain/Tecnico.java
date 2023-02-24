package com.docinel.os.domain;

@Entity
public class Tecnico extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy = "tecnico")
    private List<OS> list = new ArrayList<>();
    
    public Tecnico() {
        super();
    }

    public Tecnico(Integer id, String nome, String cpf, String telefone) {
        super(id, nome, cpf, telefone);
    }

    public List<OS> getList() {
        return list;
    }

    public void setList(List<OS> list) {
        this.list = list;
    }
    
    

}
