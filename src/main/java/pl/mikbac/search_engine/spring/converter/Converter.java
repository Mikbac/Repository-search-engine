package pl.mikbac.search_engine.spring.converter;

import pl.mikbac.search_engine.data.Data;
import pl.mikbac.search_engine.model.Model;

/**
 * Created by MikBac on 24.02.2020
 */

public interface Converter<D extends Data, M extends Model> {

    D convert(M model);

    M inverseConvert(D data);

}
