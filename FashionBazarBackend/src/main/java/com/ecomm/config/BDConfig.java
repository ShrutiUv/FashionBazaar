package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.Model.Category;
import com.ecomm.Model.Product;
//import com.ecomm.Model.Product;
import com.ecomm.Model.Supplier;
//import com.ecomm.Model.UserDetails;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class BDConfig {
	
	//Create data source Bean
	@Bean(name="dataSource")
	public DataSource getMYSQLDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/fashionDB");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		System.out.println("----DataSource Bean is Created----");
		return dataSource;
		}
	
	//Create SessionFactory Bean
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties properties=new Properties();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");         
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");

		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getMYSQLDataSource());
        factory.addProperties(properties);
        factory.scanPackages("com.ecomm.Model");       //automatically add annotated class
                                                       //No need to add following annotations
        
       /* factory.addAnnotatedClass(Category.class);
        factory.addAnnotatedClass(Supplier.class);
        factory.addAnnotatedClass(Product.class);
        factory.addAnnotatedClass(UserDetails.class);
        */
        
	
        System.out.println("----SessioFactory Bean is created----");
	    SessionFactory sessionFactory=factory.buildSessionFactory();
		return factory.buildSessionFactory();
	}
	
	//Create HIbernateTransaction Beam
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("----Transaction Manager Beam is created----");
		return new HibernateTransactionManager(sessionFactory);
	}
	

}
