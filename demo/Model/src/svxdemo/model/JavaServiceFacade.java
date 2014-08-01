package svxdemo.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("model")
public class JavaServiceFacade {
    private final EntityManager em;

    public JavaServiceFacade() {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Model-1");
        em = emf.createEntityManager();
    }

    /**
     * All changes that have been made to the managed entities in the
     * persistence context are applied to the database and committed.
     */
    public void commitTransaction() {
        final EntityTransaction entityTransaction = em.getTransaction();
        if (!entityTransaction.isActive()) {
            entityTransaction.begin();
        }
        entityTransaction.commit();
    }

    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        commitTransaction();
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        entity = em.merge(entity);
        commitTransaction();
        return entity;
    }

    public SvxDocument persistSvxDocument(SvxDocument svxDocument) {
        em.persist(svxDocument);
        commitTransaction();
        return svxDocument;
    }

    public SvxDocument mergeSvxDocument(SvxDocument svxDocument) {
        SvxDocument entity = null;
        entity = em.merge(svxDocument);
        commitTransaction();
        return entity;
    }

    public void removeSvxDocument(SvxDocument svxDocument) {
        svxDocument = em.find(SvxDocument.class, svxDocument.getDocId());
        em.remove(svxDocument);
        commitTransaction();
    }

    /** <code>select o from SvxDocument o</code> */
    @GET
    @Produces(value = { "application/json", "application/xml" })
    @Path("/getsvxdocfindall")
    public List<SvxDocument> getSvxDocumentFindAll() {
        return em.createNamedQuery("SvxDocument.findAll", SvxDocument.class).getResultList();
    }
}
