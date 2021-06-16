import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    @Test
    void returnAlunoEnsinoMedio() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Gabriel");
        assertEquals("Gabriel", aluno.getNome());
    }

    @Test
    void returnAlunoEnsinoMedioMatricula() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setMatricula(201976004);
        assertEquals(201976004, aluno.getMatricula());
    }

    @Test
    void returnAlunoEnsinoMedioReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaEnsinoMedio1(1.3f);
        aluno.setNotaEnsinoMedio2(6.9f);
        assertEquals("Reprovado", aluno.calcularNota());
    }

    @Test
    void returnAlunoEnsinoMedioAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNotaEnsinoMedio1(7.0f);
        aluno.setNotaEnsinoMedio2(9.4f);
        assertEquals("Aprovado", aluno.calcularNota());
    }
}