package vue.common;

import java.util.List;

/**
 * Created by sam on 2016. 11. 19..
 */
public interface GenericController<T, K> {

    /**
     * 모델정보 Insert
     *
     * @param object
     * @return
     */
    public boolean create(T object);

    /**
     * K 정보 가져오기
     *
     * @param id
     * @return
     */
    public T findOne(K id);

    /**
     * 모델정보 업데이트
     *
     * @param object
     * @return
     */
    public boolean update(T object);

    /**
     * 모델정보 삭제
     *
     * @param id
     * @return
     */
    public boolean delete(K id);
}

