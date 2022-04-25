package java8.interfaceenhancement.predicates;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
}
