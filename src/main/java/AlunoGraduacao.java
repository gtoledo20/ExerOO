public class AlunoGraduacao extends Aluno{
    private float notaGraduacao1;
    private float notaGraduacao2;

    public float getNotaGraduacao1() {
        return notaGraduacao1;
    }

    public void setNotaGraduacao1(float notaGraduacao1) {
        this.notaGraduacao1 = notaGraduacao1;
    }

    public float getNotaGraduacao2() {
        return notaGraduacao2;
    }

    public void setNotaGraduacao2(float notaGraduacao2) {
        this.notaGraduacao2 = notaGraduacao2;
    }

    public String calcularNota() {
        float media = (notaGraduacao1 + notaGraduacao2) / 2;

        if (media < 7) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}
