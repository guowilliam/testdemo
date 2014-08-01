package svxdemo.model;

import java.util.List;

public class JavaServiceFacadeClient {
    public static void main(String[] args) {
        try {
            final JavaServiceFacade javaServiceFacade = new JavaServiceFacade();
            for (SvxDocument svxdocument : (List<SvxDocument>) javaServiceFacade.getSvxDocumentFindAll()) {
                printSvxDocument(svxdocument);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printSvxDocument(SvxDocument svxdocument) {
        System.out.println("adviserUploaded = " + svxdocument.getAdviserUploaded());
        System.out.println("adviserViewable = " + svxdocument.getAdviserViewable());
        System.out.println("category = " + svxdocument.getCategory());
        System.out.println("clientId = " + svxdocument.getClientId());
        System.out.println("comment1 = " + svxdocument.getComment1());
        System.out.println("comment10 = " + svxdocument.getComment10());
        System.out.println("comment2 = " + svxdocument.getComment2());
        System.out.println("comment3 = " + svxdocument.getComment3());
        System.out.println("comment4 = " + svxdocument.getComment4());
        System.out.println("comment5 = " + svxdocument.getComment5());
        System.out.println("comment6 = " + svxdocument.getComment6());
        System.out.println("comment7 = " + svxdocument.getComment7());
        System.out.println("comment8 = " + svxdocument.getComment8());
        System.out.println("comment9 = " + svxdocument.getComment9());
        System.out.println("contentType = " + svxdocument.getContentType());
        System.out.println("creator = " + svxdocument.getCreator());
        System.out.println("docId = " + svxdocument.getDocId());
        System.out.println("filename = " + svxdocument.getFilename());
        System.out.println("typeId = " + svxdocument.getTypeId());
        System.out.println("uploaddate = " + svxdocument.getUploaddate());
        System.out.println("viewed = " + svxdocument.getViewed());
    }
}
