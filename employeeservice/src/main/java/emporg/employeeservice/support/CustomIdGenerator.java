package emporg.employeeservice.support;

import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.EventType;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.type.descriptor.java.spi.JavaTypeBasicAdaptor;
import org.hibernate.type.descriptor.jdbc.NumericJdbcType;
import org.hibernate.type.internal.NamedBasicTypeImpl;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.util.Properties;

public class CustomIdGenerator extends SequenceStyleGenerator{
    public final String INCREMENT_PARAM = "increment_size";

    public final int DEFAULT_INCREMENT_SIZE = 1;
    
    @Override
    public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue, EventType eventType) {
		  return "EMP" + String.format("%05d", super.generate( session, owner ));
	  }

    @Override
    public void configure( Type type, Properties parameters, ServiceRegistry serviceRegistry ) throws MappingException {
      parameters.put( INCREMENT_PARAM, DEFAULT_INCREMENT_SIZE );
      Type idType = new NamedBasicTypeImpl<>( new JavaTypeBasicAdaptor<>( Long.class ), NumericJdbcType.INSTANCE, "long" );
      super.configure( idType, parameters, serviceRegistry );
    }
}
