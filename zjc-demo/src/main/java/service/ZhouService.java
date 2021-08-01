package service;
import java.util.List;

/**
 * (Zhou)表服务接口
 *
 * @author makejava
 * @since 2021-07-21 21:21:57
 */
public interface ZhouService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    ZhouService queryById();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ZhouService> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param zhou 实例对象
     * @return 实例对象
     */
    ZhouService insert(ZhouService zhou);

    /**
     * 修改数据
     *
     * @param zhou 实例对象
     * @return 实例对象
     */
    ZhouService update(ZhouService zhou);

    /**
     * 通过主键删除数据
     *
     * @param zhou 主键
     * @return 是否成功
     */
    boolean deleteById();

}
