package pl.mikbac.searchengine.spring.converter;

import pl.mikbac.searchengine.data.Data;
import pl.mikbac.searchengine.model.Model;

/**
 * Created by MikBac on 24.02.2020
 */

public interface Converter<D extends Data, M extends Model> {

    D convert(M model);

    M inverseConvert(D data);

}
