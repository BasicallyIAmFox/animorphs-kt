package basicallyiamfox.ani.util;

@FunctionalInterface
public interface Func<P1, P2, R> {
    R apply(P1 p1, P2 p2);
}