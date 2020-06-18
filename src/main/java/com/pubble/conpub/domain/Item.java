package com.pubble.conpub.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@SequenceGenerator(
        name = "ITEM_SEQ_GEN",
        sequenceName = "ITEM_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Item {

    @Id
    @Column(name = "item_no")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ITEM_SEQ_GEN"
    )
    private Long id;

    private String itemName;

    @Column(precision = 12, scale = 1)
    private BigDecimal itemBasePrice;

    private String itemImage1;

    private String itemImage2;

    private String itemImage3;

    private String itemInfo;

    private String itemRecommend;

    private String itemDelivery;

    @OneToMany(mappedBy = "item")
    private List<SelectedOption> selectedOptions = new ArrayList<>();

    @OneToMany(mappedBy = "reviewItem")
    private List<Review> reviews = new ArrayList<Review>();
    @Enumerated(EnumType.STRING)
    private YesNo sizeCheck;
    @Enumerated(EnumType.STRING)
    private YesNo paperCheck;
    @Enumerated(EnumType.STRING)
    private YesNo pageCheck;
    @Enumerated(EnumType.STRING)
    private YesNo bindingCheck;
    @Enumerated(EnumType.STRING)
    private YesNo bindingDirectionCheck;
    @Enumerated(EnumType.STRING)
    private YesNo coverColorCheck;
    @Enumerated(EnumType.STRING)
    private YesNo coverSideCheck;
    @Enumerated(EnumType.STRING)
    private YesNo coverTypeCheck;
    @Enumerated(EnumType.STRING)
    private YesNo coverCoatingCheck;
    @Enumerated(EnumType.STRING)
    private YesNo textColorCheck;
    @Enumerated(EnumType.STRING)
    private YesNo textBothSidesCheck;
    @Enumerated(EnumType.STRING)
    private YesNo annalsCoverColorCheck;
    @Enumerated(EnumType.STRING)
    private YesNo hardGoldCheck;
    @Enumerated(EnumType.STRING)
    private YesNo signaturePageCheck;
    @Enumerated(EnumType.STRING)
    private YesNo amountCheck;

}

