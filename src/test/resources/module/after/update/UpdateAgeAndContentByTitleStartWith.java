package template;
import org.apache.ibatis.annotations.Param;

public interface TipMapper {
    int updateAgeAndContentByTitleStartWith(@Param("age") Integer age, @Param("content") String content, @Param("title") String title);
}
