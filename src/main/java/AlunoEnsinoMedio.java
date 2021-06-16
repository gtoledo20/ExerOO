public class AlunoEnsinoMedio extends Aluno {
    private float notaEnsinoMedio1;
    private float notaEnsinoMedio2;

    public float getNotaEnsinoMedio1() {
        return notaEnsinoMedio1;
    }

    public void setNotaEnsinoMedio1(float notaEnsinoMedio1) {
        this.notaEnsinoMedio1 = notaEnsinoMedio1;
    }

    public float getNotaEnsinoMedio2() {
        return notaEnsinoMedio2;
    }

    public void setNotaEnsinoMedio2(float notaEnsinoMedio2) {
        this.notaEnsinoMedio2 = notaEnsinoMedio2;
    }

    public String calcularNota() {
        float media = (notaEnsinoMedio1 + notaEnsinoMedio2) / 2;

        if (media < 6) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }
    }
}