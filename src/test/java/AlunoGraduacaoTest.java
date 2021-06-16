import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {
    @Test
    void returnAlunoGraduacaoNome() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Gabriel");
        assertEquals("Gabriel", aluno.getNome());
    }

    @Test
    void returnAlunoGraduacaoMatricula() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setMatricula(201976004);
        assertEquals(201976004, aluno.getMatricula());
    }

    @Test
    void alunoGraduacaoRep() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaGraduacao1(1.0f);
        aluno.setNotaGraduacao2(5.5f);
        assertEquals("Reprovado", aluno.calcularNota());
    }

    @Test
    void alunoGraduacaoA() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaGraduacao1(8.8f);
        aluno.setNotaGraduacao2(7.5f);
        assertEquals("Aprovado", aluno.calcularNota());
    }
}