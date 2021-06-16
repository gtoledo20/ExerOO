import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void testProfNome() {
        Professor professor = new Professor();
        professor.setNome("Marco Araújo");
        assertEquals("Marco Araújo", professor.getNome());
    }

    @Test
    void testProfT() {
        Professor professor = new Professor();
        professor.setTitulacao("Doutorado");
        assertEquals("Doutorado", professor.getTitulacao());
    }
}