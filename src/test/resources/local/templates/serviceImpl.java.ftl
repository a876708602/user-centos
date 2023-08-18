package ${package.ServiceImpl};

import ${package.Service}.${table.serviceName};
import org.springframework.stereotype.Service;
import ${package.Service}.${table.serviceName};

/**
* <p>
* ${table.comment!} 服务实现类
* </p>
*
* @author ${author}
* @since ${date}
*/
@Service
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}><#if table.serviceInterface> implements ${table.serviceName}</#if> {

}
