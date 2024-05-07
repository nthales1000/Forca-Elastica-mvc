public class ForcaElastica {
    double constanteElastica;
    double deformacao;
    
    public ForcaElastica() {
        this.constanteElastica = 0;
        this.deformacao = 0;
    }
    
    /**
     * Construtor para objetos da classe ForcaElastica
     */
    public ForcaElastica(double constanteElastica, double deformacao) {
        this.constanteElastica = constanteElastica;  
        this.deformacao = deformacao;
    }

    /**
     * Calcula a força elástica
     * 
     * @return     o valor da força elástica, dado por: constanteElastica * deformacao
     */
    public double calcularForca() {
        return this.constanteElastica * this.deformacao;
    }
}
