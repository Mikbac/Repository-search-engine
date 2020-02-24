package pl.MikBac.searchEngine.spring.converter;

import pl.MikBac.searchEngine.data.Data;
import pl.MikBac.searchEngine.model.Model;

/**
 * Created by MikBac on 24.02.2020
 */

public interface Converter<D extends Data, M extends Model> {

    D convert(M model);

    M inverseConvert(D data);

}
