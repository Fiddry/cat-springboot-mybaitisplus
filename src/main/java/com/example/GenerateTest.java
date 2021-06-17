package com.example;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class GenerateTest {

    public static void main(String[] args) {
        //create generator
        AutoGenerator autoGenerator = new AutoGenerator();


        //datasoure
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.SQL_SERVER);
        dataSourceConfig.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSourceConfig.setUsername("sa");
        dataSourceConfig.setPassword("88888888");
        dataSourceConfig.setUrl("jdbc:sqlserver://localhost:49696;DatabaseName=test");
        autoGenerator.setDataSource(dataSourceConfig);
        //quan ju pei zhi
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("Fiddry");
        globalConfig.setOpen(false);
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        //bao xin xi
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.example");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);
        //ce lue pei zhi
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("Admin","Cat", "Admission", "CashierOrder", "CatHealthChecklist", "CatApparel", "CatCategory", "CatDietManagement", "CatDressingTable", "CatFood", "CatIitemDisinfectionRecord", "CatProducts", "CatStatusRecord", "CatToys", "Consumer", "ConsumerAppointment", "Drinks", "Employ", "goods", "ItemLeale", "LossItem", "MerchandisePurchase", "RawMaterial", "SaleGoods", "StoreItems", "VIP");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        autoGenerator.setStrategy(strategyConfig);
        //yun xing
        autoGenerator.execute();

    }
}
