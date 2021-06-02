package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Pessoa {
    private String cpf;
    private String nome;

    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public static boolean validarCPF(String cpf){
        String semtraco = cpf.replace("-", "");
        String semponto = semtraco.replace(".", "");
        Integer total = 0;
        Integer resto = 0;
        Integer totaldois = 0;
        Integer c = 0;
        Integer segundoresto = 0;
        
        if(semponto.length() == 11){
            //CALCULAR O PRIMEIRO DÍGITO VERIFICADOR.
            for(int t = 0; t < 9; t++){
                total+= Integer.parseInt(semponto.substring(t, t+1)) * (t+1);
                //System.out.println("1 Caracteres. " + total);
            }
            
            //CALCULAR RESTO DE UMA DIVISÃO
            resto = total%11;
            
            if(resto == 10){
                resto = 0;
            }
            
            //VERIFICANDO PRIMEIRO DÍGITO
            if(Integer.parseInt(semponto.substring(9, 10)) != resto){
                return false;
            }
            
            //CALCULAR O SEGUNDO DÍGITO VERIFICADOR.
            for(int t = 11; t > 1; t--){
                totaldois += Integer.parseInt(semponto.substring(c, c+1)) * t;
                c++;
            }
            
            totaldois = totaldois * 10;
            
            segundoresto = totaldois%11;
            
            if(segundoresto == 10){
                segundoresto = 0;
            }
            
            if(Integer.parseInt(semponto.substring(10, 11)) != segundoresto){
                return false;
            }
            
            return true;
        }else{
            System.out.println("não tem Onze Caracteres. " + semponto);
            return false;
        }
    }
    
    
}
