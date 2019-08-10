package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CardElasticAttribute
{
    ID("id", FieldType.NORMAL),
    NAME("name", FieldType.NORMAL),
    LEVEL("level", FieldType.NORMAL),
    ATTRIBUTE("attribute", FieldType.NORMAL),
    TYPE("type", FieldType.NORMAL),
    ATTACK("attack", FieldType.NORMAL),
    DEFENSE("defense", FieldType.NORMAL),
    CARD_TYPE("cardType", FieldType.NORMAL),
    CARD_SUB_TYPE("cardSubType", FieldType.NORMAL),
    RARITY("rarity", FieldType.NORMAL),
    LIMIT_TYPE("limitType", FieldType.NORMAL);

    @Getter
    private String name;

    @Getter
    private FieldType type;

    public static CardElasticAttribute fromString(String label)
    {
        CardElasticAttribute attribute = null;

        for(CardElasticAttribute currentAttribute: CardElasticAttribute.values())
        {
            if(currentAttribute.name.equals(label))
            {
                attribute = currentAttribute;
                break;
            }
        }

        return attribute;
    }
}