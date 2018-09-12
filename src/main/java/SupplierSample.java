import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample {
    public static void main(String[] args) {
        List<BigDecimal> items = new ArrayList<BigDecimal>();
        items.add(new BigDecimal(145709865927452.897));
        items.add(new BigDecimal(520869857487543.842));
        items.add(new BigDecimal(874536732366475.842));

        Supplier<Stream<BigDecimal>> streamSupplier = () -> items.stream();
        streamSupplier.get().forEach(item -> System.out.println(item));

        Double average = streamSupplier.get().mapToDouble(item -> item.doubleValue()).average().getAsDouble();
        System.out.println("Average:" + average);
    }
}
