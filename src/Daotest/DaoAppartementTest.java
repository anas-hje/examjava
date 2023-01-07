package Daotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Dao.DaoFactory;
import Dao.IDao;
import Dao.TypeDao;
import entities.Appartement;

class DaoAppartementTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void getAlltest() {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> ents = dao.getAll();
		
		assertNotNull(ents);
		assertEquals(ents.size(), 16);
	}
	
	@Test
	void getOnetest_1() {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement app = (Appartement) dao.getOne(3);

		assertEquals(app.getLettre_appartement(), "jdshfkdh");
		assertEquals(app.getNb_pieces_total(), 30);
		
		
	}
	
	@Test
	void getOnetest_2() {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement ent = (Appartement) dao.getOne(3000);

		assertNull(ent);
	}
	
	@Test
	void savetest() {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> apps_before = dao.getAll();
		Appartement e = new Appartement( "dljshflkjs",300);
		dao.save(e);
		List<Appartement> apps_after = dao.getAll();
		assertEquals(apps_before.size()+1, apps_after.size());
	}

}
