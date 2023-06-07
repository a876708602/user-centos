package com.zjq;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Collections;

/**
 * 2023/6/7 11:29
 */
public class MySQLGenerator {
    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/user_centos?serverTimezone=Asia/Shanghai", "root", "123456")
            .dbQuery(new MySqlQuery())
            .typeConvert(new MySqlTypeConvert())
            .keyWordsHandler(new MySqlKeyWordsHandler())
            .build();


    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .outputDir("F:\\generator")
                .author("zhangjianqi")
                .enableSwagger()
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .build();
        generator.global(globalConfig);

        // 包配置
        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent("com.zjq")
                .moduleName("users")
                .entity("entity")
                .service("service")
                .serviceImpl("service.impl")
                .mapper("mapper")
                .xml("mapper.xml")
                .controller("api")
                .pathInfo(Collections.singletonMap(OutputFile.xml, "F:\\generator"))
                .build();
        generator.packageInfo(packageConfig);

        // 模板配置
        TemplateConfig templateConfig = new TemplateConfig.Builder()
                .entity("/local/templates/entity.java")
                .service("/local/templates/service.java")
                .serviceImpl("/local/templates/serviceImpl.java")
                .mapper("/local/templates/mapper.java")
                .xml("/local/templates/mapper.xml")
                .controller("/local/templates/controller.java")
                .build();
        generator.template(templateConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .addTablePrefix("t_", "c_")
                .addFieldSuffix("_flag")
                .entityBuilder()
                .enableFileOverride()
                .controllerBuilder()
                .enableFileOverride()
                .mapperBuilder()
                .enableFileOverride()
                .serviceBuilder()
                .enableFileOverride()
                .build();
        generator.strategy(strategyConfig);

        generator.execute(new FreemarkerTemplateEngine());
    }
}
