package edu.bsu.Model;

import java.util.ArrayList;

public class WikiRevFormatter {

    public String PrintFormatterArrayList(ArrayList<WikiRevision> revisions){
        String formattedRevisions = "";
        for (int i = 0; i < revisions.size(); i++){
            WikiRevision revisionOne = revisions.get(i);
            String author = revisionOne.getAuthor();
            String timeStamp = revisionOne.getTimestamp();

            String revisionInfo = String.format("%s %s \n", timeStamp, author);
            formattedRevisions += revisionInfo;
        }
        return formattedRevisions;
    }
}
