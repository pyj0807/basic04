package beans;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * mybatis �� ���ؼ� DB ó���� �Ҷ���, Connection ��� �������Ѵ�.
 * mybatis ���ü�� ���� ����ϸ� �ȴ�.
 */
public class SampleDao {
	SqlSessionFactory factory;
	
	// throws �� �޼��忡�� �߻��ϴ� exception ó�� ���ϰڴ�.
	public SampleDao() throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		factory = builder.build(is);
	}
	
	
	public List<Map> getAllResult() {
		SqlSession sql =factory.openSession();	// JDBC �� Connect����
		try {
			// select statement�� �ΰ��� ������� ȣ���� �Ѵ�.
			// selectOne (����ϴ� �����Ͱ� �ְų� ���ų�), ==> resultType 
			// selectList (����ϴ� �������� ������ ������) ==> List<resultType>
			List<Map> p = sql.selectList("baseresult.getAllDataUsingMap");
				// selectList �� ���� ��쿣, �̰� �����Ͱ� ���ٸ� size 0¥�� List�� ��ȯ��.
			return p;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Map getOneResult(String s) {
		SqlSession sql =factory.openSession();	// JDBC �� Connect����
		try {
			// select statement�� �ΰ��� ������� ȣ���� �Ѵ�.
			// selectOne (����ϴ� �����Ͱ� �ְų� ���ų�), ==> resultType 
			// selectList (����ϴ� �������� ������ ������) ==> List<resultType>
			Map p = sql.selectOne("baseresult.getOneDataUsingMap", s);
			// selectOne �� ���, �����Ͱ� ������ null�� ��ȯ��.
			return p;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	public int addTrash(String data) {
		SqlSession sql =factory.openSession();	// JDBC �� Connect����
		try {
			int r =sql.insert("baseresult.addTrash", data);
			if(r==1)
				sql.commit();
			return r;
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public int addBaseResult(Map param) {
		SqlSession sql =factory.openSession();	// JDBC �� Connect����
		try {
			int r =sql.insert("baseresult.addDataUsingMap", param);
			if(r==1)
				sql.commit();
			return r;
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
