package top.codezx.medicalsystem_admin.tool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName ResultMap
 * @Description :
 * @Author: CodeDrawing
 * @CreateDate:2021/7/1 10:15
 * @Version: 1.0
 * @Error:
 * @Function:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultMap {
    private Integer code;
    private String msg;
    private Object data;
    private Integer count;
}
