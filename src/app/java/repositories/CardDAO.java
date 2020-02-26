package app.java.repositories;

import app.java.models.Card;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class CardDAO {

    private CardRepository cardRepository;
    private XMLParser loadDoc = new XMLParser();

    public CardDAO() {
        this.cardRepository = new CardRepository();
    }

    public CardRepository getCardRepository() {
        return cardRepository;
    }

    public void collectAnswers() {
        parse();
    }

    public void parse() {
        loadDoc.loadXmlDocument("careBears.xml");

        NodeList nList = loadDoc.doc.getDocumentElement().getChildNodes();

        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            Node nNode = nList.item(i);
            Element eElement = (Element) nNode;

            String factId = eElement.getAttribute("id");

            Card card = new Card(factId);

            NodeList statsList = eElement.getElementsByTagName("Stats").item(0).getChildNodes();

            for (int j = 0; j < statsList.getLength(); j++) {
                if (statsList.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                Node statNode = statsList.item(j);
                String statId = statNode.getAttributes().getNamedItem("id").getTextContent();
                Integer statValue = Integer.valueOf(statNode.getTextContent());

                card.addStat(statId, statValue);
            }
            cardRepository.addCard(card);
        }
    }

    public CardRepository getFactRepository() {
        return cardRepository;
    }
}
