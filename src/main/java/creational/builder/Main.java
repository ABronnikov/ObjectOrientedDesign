package creational.builder;

/**
 * Порождающие шаблоны помогают создавать объекты удобнее и обеспечивают гибкость этого процесса.
 * Паттерн "Строитель" (Builder) позволяет создавать сложные объекты пошагово. В Java самый известный пример — StringBuilder.
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(',');
        builder.append("World!");
        System.out.println(builder);
    }
}
