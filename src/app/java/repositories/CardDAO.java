package app.java.repositories;

import app.java.models.Card;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class CardDAO{
    private XMLParser parser = new XMLParser();
    private CardRepository cardRepository;

    public CardDAO() {
        this.cardRepository = cardRepository;
    }

    public void parse() {
        parser.loadXmlDocument("careBears.xml");

        NodeList nList = parser.doc.getElementsByTagName("Card");



        for (int i = 0; i < nList.getLength(); i++) {
            Node nodeCard = nList.item(i);
            Element card = (Element) nodeCard;

            String cardId = card.getAttribute("id");

            NodeList nodeStats = nodeCard.getChildNodes().item(1).getChildNodes();

            List<Integer> statsList = new ArrayList<>();
            for (int j = 1; j < nodeStats.getLength(); j = j + 2) {
                Node nodestat = nodeStats.item(j);
                Element stat = (Element) nodestat;

                String statId = stat.getAttribute("id");
                int statValue = Integer.parseInt(nodestat.getTextContent());
                statsList.add(statValue);

                Card cardToAdd = new Card(cardId, statsList.get(0), statsList.get(1), statsList.get(2));
                cardToAdd.addStats(cardId, statValue);
            }


        }

    }

    public CardRepository getCardRepository() {
        return cardRepository;
    }
}
