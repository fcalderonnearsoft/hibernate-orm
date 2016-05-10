package org.hibernate.test.schemafilter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "the_entity_1", schema = "the_schema_1")
public class Schema1Entity1 {

	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId( long id ) {
		this.id = id;
	}
}
