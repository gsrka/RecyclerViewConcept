package com.remotetiger.viewpager_tabs_week2;

/**
 * Created by Abhimanyu on 9/26/2017.
 */

public class ViewData {
    private int imagesm;
    private String titlesm;
    private String descriptionsm;

    public static final ViewData[] newData = {
            new ViewData("Title1", "Desciption1", R.drawable.carrick),
            new ViewData("Title2", "Desciption2", R.drawable.costa),
            new ViewData("Title3", "Desciption3", R.drawable.degea),
            new ViewData("Title4", "Desciption4", R.drawable.oscar),
            new ViewData("Title5", "Desciption5", R.drawable.herera),
            new ViewData("Title6", "Desciption6", R.drawable.carrick),
            new ViewData("Title7", "Desciption7", R.drawable.oscar),
            new ViewData("Title8", "Desciption8", R.drawable.costa),
            new ViewData("Title9", "Desciption9", R.drawable.degea)

    };

    public ViewData(String titlesm, String descriptionsm, int imagesm) {
        this.imagesm = imagesm;
        this.titlesm = titlesm;
        this.descriptionsm = descriptionsm;
    }

    public int getImagesm() {
        return imagesm;
    }

    public String getTitlesm() {
        return titlesm;
    }

    public String getDescriptionsm() {
        return descriptionsm;
    }

}
