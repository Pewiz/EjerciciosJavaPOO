package model;
import java.util.ArrayList;
import java.util.List;

public class CatModel {
    private List<String> catImages;

    public CatModel() {
        this.catImages = new ArrayList<>();
        catImages.add("https://i.pinimg.com/564x/82/3d/3a/823d3a03229306549074f7889c1074d4.jpg");
        catImages.add("https://i.pinimg.com/564x/61/c9/fc/61c9fc16751f1a9ae1189512beecf6c5.jpg");
        catImages.add("https://i.pinimg.com/564x/e1/ec/92/e1ec9214f81b3133621c5c43a3fb9757.jpg");
        catImages.add("https://i.pinimg.com/736x/c6/44/fc/c644fc85a1fcad538073924f36ce8b35.jpg");
        catImages.add("https://i.pinimg.com/564x/5e/8c/f1/5e8cf11588181ee45ef1eb42c7dab63e.jpg");
        catImages.add("https://i.pinimg.com/564x/58/9e/14/589e1409b4bc80e0b5ba99538251d66c.jpg");
        catImages.add("https://i.pinimg.com/564x/ea/5f/c9/ea5fc9680cec81756dcd5f12d63dc3f5.jpg");
        catImages.add("https://i.pinimg.com/564x/15/ab/cd/15abcd3ac99e8fb78be2e1ea79fecda2.jpg");
        catImages.add("https://i.pinimg.com/564x/61/eb/be/61ebbeab5646561f588fee7421beb583.jpg");
        catImages.add("https://i.pinimg.com/564x/b3/dc/43/b3dc435599917344fe13793d51f3f166.jpg");
        catImages.add("https://i.pinimg.com/564x/70/99/27/709927488ffdf538018c2bb99acb8034.jpg");
        catImages.add("https://i.pinimg.com/564x/d0/62/fe/d062fe38eb01517ac802d80dbcd25e49.jpg");
        catImages.add("https://i.pinimg.com/564x/44/12/cf/4412cfbb4fcb29ef2dd3787873196481.jpg");
        catImages.add("https://i.pinimg.com/736x/58/6a/91/586a912d51ee749a6af2029e307cbd59.jpg");
        catImages.add("https://i.pinimg.com/736x/1b/ff/4c/1bff4cdbf8a2c7424445e187431812f2.jpg");
        catImages.add("https://i.pinimg.com/736x/34/44/11/34441133daa2b1e24f1626ea77b00508.jpg");
        catImages.add("https://i.pinimg.com/736x/ba/df/9b/badf9b5e6876534c2eef3580ca499b67.jpg");
        catImages.add("https://i.pinimg.com/736x/8f/ae/f4/8faef41b9b73a2662376b986c3a29fd5.jpg");
        catImages.add("https://i.pinimg.com/736x/34/08/99/340899d141db95f4f79656f874ff263d.jpg");
        catImages.add("https://i.pinimg.com/736x/86/da/b9/86dab97871f4e4fe4de3df7a17aafe2f.jpg");
    }

    public List<String> getCatImages() {
        return catImages;
    }
}
