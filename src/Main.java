import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso javascript.");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria Java.");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso2);
        // System.out.println(curso1);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Caamila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdoos Concluídos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("Conteúdoos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("XP: "+ devCamila.calcularTotalXP());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdoos Concluídos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("Conteúdoos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("XP: "+ devCamila.calcularTotalXP());

        System.out.println("##### #####");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Concluídos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());
    }
}
