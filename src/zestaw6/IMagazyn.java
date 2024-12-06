package zestaw6;

import java.util.List;
import java.util.Optional;

public interface IMagazyn {

    List<Produkt> getProdukty();

    void setProdukty(List<Produkt> produkty);

    default Optional<Produkt> getFirst() {
        if (getProdukty().isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(getProdukty().getFirst());
    }
}
