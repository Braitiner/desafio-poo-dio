package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java 8");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcampo Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBbraitiner = new Dev();
        devBbraitiner.setNome("Braitiner");
        devBbraitiner.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Braitiner: " + devBbraitiner.getConteudosInscritos());
        devBbraitiner.progredir();
        devBbraitiner.progredir();
        devBbraitiner.progredir();
        System.out.println("Conteudos incritos Braitiner: " + devBbraitiner.getConteudosInscritos());
        System.out.println("Condeudos concluidos Braitiner: " + devBbraitiner.getConteudosConluidos());
        System.out.println("XP: " + devBbraitiner.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Condeudos incritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Condeudos incritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Condeudos concluidos Camila: " + devCamila.getConteudosConluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());







    }
}
