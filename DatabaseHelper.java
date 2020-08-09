package com.example.smartrecipe;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "recipeList.db";
    private static final String CREATE_TBL_USERS = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT ,%s TEXT ,%s TEXT,%s TEXT)",
            DatabaseContract.details.TABLE_NAME + "("
                    + DatabaseContract.details.COL_ID, DatabaseContract.details.COL_NAME, DatabaseContract.details.COL_INGREDIENT, DatabaseContract.details.COL_METHOD, DatabaseContract.details.COL_TIME);

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TBL_USERS);

        setvalues(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void setvalues(SQLiteDatabase db) {
        ContentValues v = new ContentValues();
        v.put(DatabaseContract.details.COL_ID, "Khastaroti");
        v.put(DatabaseContract.details.COL_NAME, "Khasta Roti");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Table salt – to taste\n" +
                "Sugar – 1 teaspoon\n" +
                "Water – ¼ cup\n" +
                "Maida (refined flour) – 1 cup\n" +
                "Suji (semolina) – 2 tablespoons\n" +
                "Pure ghee – 4 tablespoons\n" +
                "Ajwain (carom seeds) – ½ teaspoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Place the sugar and salt in a small bowl, add ¼ cup (50 ml) water and stir till they dissolve.\n" +
                "Place the refined flour, semolina, ghee, carom seeds, salt and sugar solution in a bowl and knead into a stiff dough.  Cover with a damp cloth and set aside for 15  minutes.\n" +
                "Divide the dough into 8 equal portions and shape into balls.\n" +
                "Flatten each ball and roll out into a 6 inch diameter roti.\n" +
                "Place a non stick pan on medium heat. Let it heat for 2 minutes then place a roti and cook, turning sides till both the sides are cooked and crisp.  Similarly make the remaining rotis.\n" +
                "Serve hot.\n");
        v.put(DatabaseContract.details.COL_TIME, "25 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "naan");
        v.put(DatabaseContract.details.COL_NAME, "Naan");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Dry active Yeast – 2 teaspoons\n" +
                "Sugar – 1 teaspoon\n" +
                "Water – ½ cup\n" +
                "Flour – 2 ½ -3 cups\n" +
                "Salt – ½ teaspoon\n" +
                "Olive oil – ¼ cup\n" +
                "Plain yogurt – 1/3 cup\n" +
                "Egg – 1 large\n");
        v.put(DatabaseContract.details.COL_METHOD, "In a small bowl, combine the yeast, sugar and water. Stir to dissolve then let sit for a few minutes or until it is frothy on top. Once frothy, whisk in the oil, yogurt, and egg until evenly combined.\n" +
                "In a separate medium bowl, combine 1 cup of the flour with the salt. Next, pour the bowl of wet ingredients to the flour/salt mixture and stir until well combined. Continue adding flour, a half cup at a time, until you can no longer stir it with a spoon (about 1 to 1.5 cups later).\n" +
                "At that point, turn the ball of dough out onto a lightly floured surface and knead the ball of dough for about 3 minutes, adding small amounts of flour as necessary to keep the dough from sticking. You'll end up using between 2.5 to 3 cups flour total. The dough should be smooth and very soft but not sticky. Avoid adding excessive amounts of flour as you knead, as this can make the dough too dry and stiff.\n" +
                "Loosely cover the dough and let it rise until double in size (about 1 hour). After it rises, gently flatten the dough into a disc and cut it into 8 equal pieces. Shape each piece into a small ball.\n" +
                "Heat a large, heavy bottomed skillet over medium heat. Working with one ball at a time, roll it out until it is about 1/4 inch thick or approximately 6 inches in diameter. Place the rolled out dough onto the hot skillet and cook until the bottom is golden brown and large bubbles have formed on the surface (see photos below). Flip the dough and cook the other side until golden brown as well. Stack the cooked flat bread on a plate and cover with a towel to keep warm as you cook the remaining pieces. Serve plain or brushed with melted butter and sprinkled with herbs!\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour and 30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);

        v.put(DatabaseContract.details.COL_ID, "garlicnaan");
        v.put(DatabaseContract.details.COL_NAME, "Garlic Naan");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Maida (refined flour) – 2 cups\n" +
                "Baking powder – ½ teaspoon\n" +
                "Baking soda – ¼ teaspoon\n" +
                "Table salt – ½ teaspoon\n" +
                "Garlic cloves – 30 no\n" +
                "Powdered sugar – 1 teaspoon\n" +
                "Milk – ¾ cup\n" +
                "Plain yogurt – 1 tablespoon\n" +
                "Fresh cilantro leaves, finely chopped – 1 tablespoon\n" +
                "Vegetable oil – 1 tablespoon\n" +
                "Butter – 3 tablespoons\n");
        v.put(DatabaseContract.details.COL_METHOD, "Sieve the refined flour, leaving some aside for dusting, with baking powder, baking soda and salt into a deep bowl.\n" +
                "Place 20 garlic cloves in a blender and blend to a fine paste with 1 tablespoon (15 ml) water. Chop the remaining 10 garlic cloves finely and set aside.\n" +
                "To the sieved flour add sugar, milk, garlic paste, yogurt, half the chopped garlic, cilantro leaves and knead into a medium soft dough. Apply the oil over the surface, cover with a damp cloth and set aside for at least 1 hour.\n" +
                "Punch the dough with your hands to make it soft and pliable and divide into 8 equal portions. Cover the dough with a damp cloth and let it rest for 1 hour more.\n" +
                "Place a non stick saucepan on medium heat and add the butter and allow it to melt. Take the pan off the stove top.\n" +
                "Flatten each dough ball between your palms, apply a little melted butter and dust with the reserved flour. Roll into a ball again and keep it covered for 15 minutes.\n" +
                "Preheat oven to 250°C / 480°\n" +
                "Roll each dough ball on a floured surface into a 5-6 inch diameter disc. Pull it from one end to get the elongated shape of a naan. Sprinkle the remaining chopped garlic on the nans before cooking.\n" +
                "Cook in the preheated oven for 7 minutes. You can also cook in a tandoor till brown spots appear on the surface of the naan.\n" +
                "Remove and serve hot drizzled with melted butter.\n");
        v.put(DatabaseContract.details.COL_TIME, "3 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "Image1");
        v.put(DatabaseContract.details.COL_NAME, "Cheese Naan Bread");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Dry yeast – 2 teaspoon\n" +
                "Granulated sugar – 1 teaspoon\n" +
                "Milk (160 ml), warm – 2/3 cup\n" +
                "Bread flour (260 gr) – 2 cup\n" +
                "Plain yogurt – 2 tablespoon\n" +
                "Olive oil – 2 tablespoon\n" +
                "Salt – 1 teaspoon\n" +
                "Some chopped chives\n" +
                "Some chopped coriander\n" +
                "Some shredded mozzarella\n" +
                "Some garlic powder\n");
        v.put(DatabaseContract.details.COL_METHOD, "Add sugar into warm milk and stir. Then sprinkle dry yeast and give it a stir also. Set aside for it to get foamy for around 5 minutes.\n" +
                "In a standing mixer bowl, add in flour, yogurt, olive oil, salt and yeast mixture. Mix to incorporate everything and then knead for 10 minutes. Form the dough into a ball and place it in an oiled bowl. Coat the dough with some oil to prevent crust forming on it.\n" +
                "Cover the bowl tightly with cling film and leave it in a warm and draft free place until the dough rises double its size.\n" +
                "Flour the working surface and place the risen dough on it. Lightly knead it into a log and cut it into 4 equal pieces. Form each piece into a ball.\n" +
                "Take 1 ball and roll it into a round disk. Put some chopped chives in the center followed by shredded mozzarella and some garlic powder. Wrap the filling with the edges of the dough and pinch the seams together.\n" +
                "Lightly wet the top surface of the ball with some water and then dip it in a plate containing chopped coriander leaves. Place the ball on the working surface again, seam side down. Roll it into an oval shape of 5x8 inch (13x20 cm). Place the rolled dough on a lightly floured baking tray while you continue with the rest of the balls.\n" +
                "Heat an iron cast skillet on high medium heat until it's smoking. Place the rolled dough coriander side down onto the pan and cook for 1 1/2 minutes per each side or until fully cooked. Transfer to a plate and paint it with some oil or melted butter. Cover with a kitchen cloth to maintain it warm while you continue cooking the rest. Best served warm, enjoy!\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour and 25 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "tandooriroti");
        v.put(DatabaseContract.details.COL_NAME, "Tandoori Roti");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Flour – ½ cup\n" +
                "Wheat Flour – 1½  cup \n" +
                "Curd – 2 tablespoon\n" +
                "Salt – 1 teaspoon\n" +
                "Vegetable Oil – 1 tablespoon\n" +
                "Sugar – 1 teaspoon\n" +
                "Baking Powder – ½ teaspoon\n" +
                "Ghee – 1 tablespoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Mix all the ingredients in a bowl.\n" +
                "Add water and knead of make a slightly stiff dough.\n" +
                "Cover the dough and keep aside for 1 hour.\n" +
                "Drizzle 1 tsp oil on the dough and knead for 2-3 minutes.\n" +
                "Divide the dough into 8 equal parts.\n" +
                "Make balls from each part.\n" +
                "Dust and roll the dough ball to make a 5 inch circle.\n" +
                "Heat a tawa (Griddle).\n" +
                "Apple water on one side of the roti.\n" +
                "Transfer the roti on the hot griddle with the water side down.\n" +
                "Let it cook for 30 seconds.\n" +
                "Invert the tawa and cook the roti on direct heat until brown spots appear.\n" +
                "Turn the tawa back and cook the roti for another 30 seconds. Remove the roti from the tawa.\n" +
                "Apply ghee on top and serve hot.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "rumalinaan");
        v.put(DatabaseContract.details.COL_NAME, "Rumali Naan");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Whole wheat flour – 1 cup\n" +
                "All Purpose flour – 1 1/2 cups\n" +
                "Salt – 1 tablespoon\n" +
                "Oil – 2 tablespoon + 1 tablespoon\n" +
                "Water – as needed to make the dough\n");
        v.put(DatabaseContract.details.COL_METHOD, "Add the flours, salt and oil in a mixing bowl and add water slowly to make a very soft and slightly sticky dough.\n" +
                "I used my stand mixer to make the dough. Knead the dough until it is elastic. The dough has to be slightly sticky as that will help in rolling it out thin.\n" +
                "Grease the dough with the remaining 1 TBSP of oil and let it rest for at least 30 minutes. If you can let it rest longer, it is even better.\n" +
                "When ready to cook, make even sized 10 to 12 balls from the dough. If you have a large wok to work with, then the dough ball cab be slightly larger. If your cooking surface is smaller, make smaller balls so you can make smaller Roomali roti.\n" +
                "Dust the dough balls with flour and roll it as thin as possible. If the dough retracts back too much when rolling, let it rest for 5 minutes and then roll again.\n" +
                "In the meantime, heat a wok or any wide wok shaped pan inverted on the flame. We will be cooking these Roomali Rotis on the outer side of the pan.\n" +
                "When the pan is nice and hot, place one of the thinly rolled roti on the pan and cook until bubbles appear.\n" +
                "Flip it once and let it cook on the other side as well. Fold the cooked roti on the pan and then place in between layers of kitchen towel to keep it warm and soft until we make the rest.\n" +
                "Serve warm with some rich Subzi.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "bajraroti");
        v.put(DatabaseContract.details.COL_NAME, "Bajra Roti");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Bajra flour / pearl millet flour – 2 cups\n" +
                "Salt – 1 teaspoon\n" +
                "Ghee – 2 tablespoon \n" +
                "Jaggery (gud), to serve – 2 tablespoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Take Bajra flour in a bowl and mix in salt. Add hot water little by little and mix together with a spoon till all the flour is incorporated and you get a thick dough consistency. \n" +
                "Leave it for 5 minutes till the bajra dough is cool enough to knead by hand. Knead it till it gets soft. If the dough is too sticky, that means there is more water than needed so add a little more flour. Likewise if it is too dry, add a little water. Like regular wheat dough, kneading the millet flour dough takes a bit of practice, so start with a small batch.\n" +
                "Heat a tawa or flat pan on medium-low heat.\n" +
                "Divide the dough into small balls (1.5”-2” diameter) and cover with a damp cloth.\n" +
                "For each bajre ki roti, take one ball of dough and roll it out gently, between two sheets of food grade plastic, to as round a shape as you can get! \n" +
                "Carefully transfer the chapati to a hot tawa/ pan and cook on both sides till it is cooked through (has brown spots on both sides).\n" +
                "Smear with ghee and serve with jaggery.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "samorice");
        v.put(DatabaseContract.details.COL_NAME, "Samo Rice Poori");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Samo rice - 3/4 cup (125 grams)\n" +
                "Sendha Salt - 1/3 teaspoon\n" +
                "Black pepper - 1/4 teaspoon (freshly grounded)\n" +
                "Oil - 1 teaspoon\n" +
                "Oil - for frying\n");
        v.put(DatabaseContract.details.COL_METHOD, "Wash the samo rice and soak them in water for 2 hours. Drain out the excess water and grind the rice finely, without adding water. If needed, add 1 to 2 tsp water to grind. \n" +
                "Place a pan over flame and add the rice paste into it. Stir constantly for 1 to 2 minutes on medium flame and roast well. Cook the dough until it gets thick in consistency. \n" +
                "Take out the flour in a bowl and allow it to cool down slightly. Now add 1 tsp oil, sendha salt, black pepper and knead the dough until smooth and soft. Dough for making pooris is now ready. \n" +
                "Make small lumps from the dough and cover them, so that they don't dry up. Heat enough oil in a wok for frying the pooris. Meanwhile, take one lumps, grease your hands with some oil and roll giving it a round shape. Place the dough ball over a polythene sheet and  roll out very gently in round shape. Now lift this poori and place it in the oil for frying. \n" +
                "Fry the pooris on high flame. Press the poori with a ladle so that it puffs up. Fry until poori turns golden brown in color and take out the fried ones in a plate. Similarly, make pooris from rest of the lumps as well. Samo rice poori for fast is ready. Serve piping hot samo rice poori with aloo sabzi, coconut chutney prepared especially for fasts and raita or curd and relish eating. \n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "aloobhatura");
        v.put(DatabaseContract.details.COL_NAME, "Aloo Bhatura");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Wheat flour – 4 cups\n" +
                "Salt – 1 teaspoon\n" +
                "Potatoes – 2 \n" +
                "Refined oil – 2 cups\n" +
                "All purpose flour – 2 cups\n" +
                "Sugar – 2 teaspoons\n" +
                "Baking soda – 1 teaspoon\n" +
                "Yoghurt (curd) – 1 cup\n");
        v.put(DatabaseContract.details.COL_METHOD, "Wheat flour – 4 cups\n" +
                "Salt – 1 teaspoon\n" +
                "Potatoes – 2 \n" +
                "Refined oil – 2 cups\n" +
                "All purpose flour – 2 cups\n" +
                "Sugar – 2 teaspoons\n" +
                "Baking soda – 1 teaspoon\n" +
                "Yoghurt (curd) – 1 cup\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "deepfriedicecream");
        v.put(DatabaseContract.details.COL_NAME, "Deep-fried Ice cream");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Vanilla ice-cream – 750 ml\n" +
                "Digestive biscuits – 250 grams\n" +
                "Eggs – 2 \n" +
                "Milk – 1 tablespoon\n" +
                "Sunflower oil\n" +
                "Icing sugar, to serve\n" +
                "Maple syrup, to serve\n");
        v.put(DatabaseContract.details.COL_METHOD, "Working quickly, scoop ice cream (see related recipe) into 6 round balls and place on a paper-lined tray in the freezer. Freeze for about 2 hours until very firm. Crush a pack of biscuits to fine crumbs and place in a shallow bowl. Again working quickly, roll frozen balls in crumbs to coat, then freeze for 1 hour. Lightly beat eggs with milk in another bowl. Again working quickly, coat each ball first in egg mixture, shaking off excess, followed by a second coat of crumbs. Return balls to freezer for another 1 hour.\n" +
                "Half-fill a deep-fryer or large saucepan with sunflower oil and heat to 190°C. (If you don't have a deep-fryer thermometer, a cube of bread will turn golden in 30 seconds when oil is hot enough.) In 2 batches, fry ice cream balls for 10-15 seconds until golden.\n" +
                "Remove with a slotted spoon, drain briefly on paper towel, then serve immediately dusted with icing sugar and drizzled with maple syrup.\n");
        v.put(DatabaseContract.details.COL_TIME, "4 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mangoicecream");
        v.put(DatabaseContract.details.COL_NAME, "Mango Ice cream");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Heavy cream or whipping cream – 200 grams\n" +
                "Ripe mango pure – 4 cup\n" +
                "Granulated white sugar – ½ cup\n");
        v.put(DatabaseContract.details.COL_METHOD, "To prepare mango puree, dice the pulp of fresh mango into chunks. Blend it to a smooth puree along with sugar without using any water. Or you can use canned mango puree.\n" +
                "Whip the cream using a hand mixer till soft peaks form. You can use a stand mixer as well for the purpose.\n" +
                "Add mango puree in the whipped cream. Whisk using the hand blender or spatula for 1 – 2 minutes or until well combined. Taste and if required add more sugar accordingly.\n" +
                "Pour the ice cream into a freezer friendly container with a lid. Freeze for 5 hours or until set.\n" +
                "Stand for 5 minutes to soften slightly, then scoop and serve!\n");
        v.put(DatabaseContract.details.COL_TIME, "5 hours and 25 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "icecreamsouffle");
        v.put(DatabaseContract.details.COL_NAME, "Ice cream Souffle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Pineapple (chopped) – 1 cup\n" +
                "Pineapple jelly – 1 packet\n" +
                "Lemon juice as required\n" +
                "Gelatin – 1 tablespoon\n" +
                "Water – 1 cup\n" +
                "Vanilla ice cream – ½ liter\n" +
                "Fresh cream – 200 grams\n" +
                "Cherries for decoration\n");
        v.put(DatabaseContract.details.COL_METHOD, "Dissolve jelly in 1 cup water, set partially.\n" +
                "Dissolve gelatin in half cup pineapple syrup.\n" +
                "Add to jelly, beat ice cream and 100 gm of cream mix with jelly, lemon juice and pineapple.\n" +
                "Remove in a serving bowl.\n" +
                "Set in the freezer.\n" +
                "Decorate with remaining 100 gm fresh cream and cherries.\n");
        v.put(DatabaseContract.details.COL_TIME, "45 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mangokulfi");
        v.put(DatabaseContract.details.COL_NAME, "Mango Kulfi");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Milk – 4 cups\n" +
                "Dried milk powder – 1.5 cups\n" +
                "Chopped nuts – 2 tablespoon\n" +
                "Cardamom powder – ½ teaspoon\n" +
                "Cornstarch dissolved in 3 tablespoons water or milk – 1.5 tablespoon\n" +
                "Mango puree I used fresh – 1 ¾ cups\n");
        v.put(DatabaseContract.details.COL_METHOD, "Add whole milk to a heavy bottom pan on medium heat. Let it come to a simmer and then lower the heat to medium-low. \n" +
                "Then add the milk powder and mix well.\n" +
                "Add the condensed milk and mix. Also add the chopped nuts and mix.\n" +
                "Let the milk simmer on low heat for 20 minutes. It will thicken as it cooks.\n" +
                "After 20 minutes, add the cardamom powder and mix.\n" +
                "Mix cornstarch with water or milk until smooth. Add the cornstarch slurry to the milk and whisk to combine.\n" +
                "Let the milk simmer for 5 more minutes after adding the cornstarch, keep stirring continuously. It will thicken considerably. See the picture above, it should be that thick and coat the back of a spoon.\n" +
                "Remove pan from heat and then let the milk cool completely. Once it has cooled down, add the mango puree.\n" +
                "Mix the mango puree with the milk mixture until well combined.\n" +
                "Transfer kulfi mixture to plastic cups or kulfi molds. I was able to get 15 small kulfis out of this mixture.\n" +
                "Cover each with aluminium foil and place in the freezer. Once kulfi is little set (around 1.5 hours), take them out of the freezer and stick a ice cream stick in each mold. Return kulfi to the freezer and freeze until set, preferably overnight.\n" +
                "Run a knife around the edges of the mango kulfi to demold. You may also dip the molds in warm water for few seconds and then pull gently to de-mold. \n" +
                "Garnish with pistachios or enjoy as such!\n");
        v.put(DatabaseContract.details.COL_TIME, "3 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "chocolatekulfi");
        v.put(DatabaseContract.details.COL_NAME, "Chocolate Kulfi");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Chocolate grated – 1/2 cup\n" +
                "Condensed milk – ½  cup\n" +
                "Mawa (khoya) grated – ¾ cup\n" +
                "Milk – 1 litres\n");
        v.put(DatabaseContract.details.COL_METHOD, "Heat milk in a saucepan and bring it to boil. Let it boil, stirring continuously, till reduced to one-third the original quantity. Add khoya and mix. Then add condensed milk and reduce for five more minutes.\n" +
                "Take it off the heat and add grated chocolate, leaving aside some for the garnish, and mix well.\n" +
                "Transfer the mixture into kulfi moulds. Sprinkle the remaining grated chocolate on top and close the lid of the moulds. Keep the moulds in the deep freezer and allow to set.\n" +
                "When set unmould, slice and serve immediately.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mangojuice");
        v.put(DatabaseContract.details.COL_NAME, "Mango Juice");
        v.put(DatabaseContract.details.COL_INGREDIENT, "1 large Mangoes peeled, cut into big chunks\n" +
                "Sugar – 1 tablespoon \n" +
                "Chilled Water – 1 ½ cups \n" +
                "Few Ice cubes optional\n");
        v.put(DatabaseContract.details.COL_METHOD, "Wash, peel and chop the mango. Take mango and sugar into a blender.\n" +
                "Grind into smooth puree.\n" +
                "Then add water and blend it again.\n" +
                "Strain the juice and discard the fibrous pulp if any. This step is optional though.\n" +
                "Keep refrigerated, chilled till serving.\n");
        v.put(DatabaseContract.details.COL_TIME, "10 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "watermelonjuice");
        v.put(DatabaseContract.details.COL_NAME, "Watermelon Juice");
        v.put(DatabaseContract.details.COL_INGREDIENT, "¼ watermelon\n" +
                "strawberries\n" +
                "Sugar – 1/8 cup\n" +
                "Water – 1/8 cup\n" +
                "Crushed ice – 1 cup\n");
        v.put(DatabaseContract.details.COL_METHOD, "To start off, cut your watermelon into quarters. Spoon one quarter of the watermelon into your blender.\n" +
                "Cut the tops off of 4 strawberries and add to your blender. Mix.\n" +
                "Add remaining ingredients to blender (1/8 cup sugar, ⅛ cup water, and 1 cup ice). Blend well. This makes two very large glasses of juice. A whole watermelon will make about 8-12 servings, but you will have to add and mix these ingredients each time so it can all fit in your blender.\n");
        v.put(DatabaseContract.details.COL_TIME, "10 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "thandai");
        v.put(DatabaseContract.details.COL_NAME, "Thandai");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Almonds – 10-12\n" +
                "Cashew Nuts – 10-12\n" +
                "Black Peppercorns – 25-30\n" +
                "Raisins – 10-12\n" +
                "Cardamom – 10-12\n" +
                "Poppy Seeds – 1 tablespoon\n" +
                "Fennel Seeds – 1 tablespoon\n" +
                "Melon Seeds – 1 tablespoon\n" +
                "Milk – 3 cups\n" +
                "Sugar – ¼ cup\n" +
                "Saffron (Soaked in 1 tbsp milk) – 1 pinch\n" +
                "Rose water – ½ teaspoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Soak almonds, cashew nuts, peppercorns, raisins, cardamom, poppy seeds, fennel seeds and melon seeds in ½ cup water for 5-6 hours.\n" +
                "Strain the water and grind the soaked ingredients in a blender to make a smooth paste.\n" +
                "Add little milk if required.\n" +
                "Add the remaining milk.\n" +
                "Pass the mixture through a soup strainer.\n" +
                "Add sugar, saffron soaked in milk and rose water and mix till sugar is dissolved.\n" +
                "Pour the thandai in serving glasses.\n" +
                "Garnish with rose petals and dry fruit slivers.\n" +
                "Serve chilled.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mangoandpineapplesmoothie");
        v.put(DatabaseContract.details.COL_NAME, "Mango and Pineapple Smoothie");
        v.put(DatabaseContract.details.COL_INGREDIENT, "1/2 a fresh mango cut into cubes or 1/2 cup frozen mango\n" +
                "1/2 cup fresh or frozen pineapple\n" +
                "2 cups coconut water\n" +
                "Garnish: Fresh chunks of mango pineapple, shredded coconut and chia seeds\n");
        v.put(DatabaseContract.details.COL_METHOD, "Add all ingredients to blender in the order of appearance.\n" +
                "Blend thoroughly on high speed for 1 minute until the mixture is completely smooth. If it is too thick or not blending well, you can add more coconut water or water.\n" +
                "Taste and adjust the flavor as needed, by adding sweetener of choice for added sweetness.\n" +
                "Top if off with fresh chunks of mango, pineapple, shredded coconut and chia seeds, if desired.\n" +
                "Serve immediately for best flavor and consistency.\n");
        v.put(DatabaseContract.details.COL_TIME, "10 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "lemonandmintjuice");
        v.put(DatabaseContract.details.COL_NAME, "Lemon and Mint Juice");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Mint leaves(pudina) - 1 cup\n" +
                "Lemon juice - 1/4 cup (juice of one lemon)\n" +
                "Black pepper powder (kalimirch) - 1/4 spoon\n" +
                "Salt - 1/4 spoon\n" +
                "Sugar - 1 cup\n" +
                "Ice cubes - 1 cup\n" +
                "Cold water - 2 glass\n" +
                "Ice cubes - 8\n" +
                "Mint - 2 springs\n" +
                "Lemon - 1\n");
        v.put(DatabaseContract.details.COL_METHOD, "Take the blender jar to add a cup of fresh mint leaves(pudina).\n" +
                "Pour 1/4 cup of lemon juice.\n" +
                "Add 1/4 spoon of black pepper.\n" +
                "Add 1/4 spoon of salt.\n" +
                "Add a cup of sugar. Can add honey instead of sugar.\n" +
                "Add a cup of ice cubes.\n" +
                "Pour 2 glass of cold water.\n" +
                "Blend all the ingredients till it turns smooth juice.\n" +
                "Take the serving glasses to add 8 ice cubes.\n" +
                "Pour the lemon mint juice into serving glasses.\n" +
                "Garnish with the mint springs.\n" +
                "Serve chilled lemon mint juice and enjoy these healthy drink.\n");
        v.put(DatabaseContract.details.COL_TIME, "10 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mangopickle");
        v.put(DatabaseContract.details.COL_NAME, "Mango Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Raw Green Mangoes – 2 ¼ pounds\n" +
                "Sea Salt –  1 cup\n" +
                "Aniseed(or fennel seeds) – 3 tablespoons\n" +
                "Mustard Seeds – 4 ½ teaspoons\n" +
                "Kalonji/Nigella Seeds – 1 tablespoon\n" +
                "Fenugreek Seeds – 1 tablespoon\n" +
                "Red chilli powder –  5 tablespoons\n" +
                "Turmeric powder – 2 teaspoons\n" +
                "Mustard Oil – 3 cups\n");
        v.put(DatabaseContract.details.COL_METHOD, "Gather the ingredients.\n" +
                "Sterilize and thoroughly dry a 1-quart glass pickling jar.\n" +
                "Put the mangoes in the jar and cover with salt. Mix well and cover the jar tightly.\n" +
                "Leave the jar out in the sun for 1 week so that the mangoes soften.\n" +
                "In a small bowl, mix the aniseed or fennel seeds, mustard seeds, kalonji/nigella seeds, fenugreek seeds, chili powder, and turmeric together.\n" +
                "Add this spice mix to the mangoes.\n" +
                "In a small skillet, heat the mustard oil until it smokes and then turn off the heat. Allow the oil to cool fully.\n" +
                "Pour this oil over the mangoes so that all the pieces are submerged. Mix well.\n" +
                "Put the tightly covered jar back in the sun for two weeks. Stir every day to mix well.\n" +
                "Eat with stuffed parathas bread and yogurt and any vegetable dish.\n");
        v.put(DatabaseContract.details.COL_TIME, "96 hour and 15 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "stuffedlemon");
        v.put(DatabaseContract.details.COL_NAME, "Stuffed Lemon");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Lemons – 1 kg\n" +
                "Nutmeg – ½ teaspoon\n" +
                "Cloves – 8\n" +
                "Pepper – 4 teaspoons\n" +
                "Cumin Seeds – 2 teaspoons\n" +
                "Red chili pepper – 3 teaspoons\n" +
                "Coriander powder – 2 teaspoons\n" +
                "Dry Ginger powder – 2 teaspoons\n" +
                "Cinnamon powder – ½ teaspoon\n" +
                "Cardamoms – 2 big\n" +
                "Asafoetida (roasted) – 1 teaspoon\n" +
                "Black Salt – 3 teaspoons\n" +
                "Table Salt – 12 teaspoons\n" +
                "Lemon Juice – 1 cup\n");
        v.put(DatabaseContract.details.COL_METHOD, "Slit the lemons into four without separating them at the base.\n" +
                "Remove all the seeds.\n" +
                "Grind all the dry ingredients to a fine powder.\n" +
                "Stuff the lemons with the ground spices and then put them in a pan and pour in the lemon juice.\n" +
                "Cook on a low fire till the juice boils.\n" +
                "Cool and put the pickle in airtight jar.\n" +
                "Keep in the sun for 4 days shaking it once daily.\n" +
                "Serve after 2 weeks.\n");
        v.put(DatabaseContract.details.COL_TIME, "2 weeks approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "greenchillipickle");
        v.put(DatabaseContract.details.COL_NAME, "Green Chilli Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Long Green Chilli – 250 gram \n" +
                "garlic – 5/6 cloves\n" +
                "Mustard Seeds – 2 tablespoon \n" +
                "Salt – to taste\n" +
                "Mustard Oil – ¼ Cup \n" +
                "Pickles masala – 1 tablespoon \n");
        v.put(DatabaseContract.details.COL_METHOD, "Wash the green chilies. Remove the stem and pat dry with a clean towel. If possible place them in the sunlight for 15 – 20 minutes to completely dry.\n" +
                "Slit the green chilies lengthwise and cut each one into 2 – 3 pieces. Set aside.\n" +
                "Coarsely crush the mustard seeds in a blender. Combine mustard seeds, salt, achaar ka masala, and salt. Mix nicely.\n" +
                "Now in a clean bowl mix green chillies, garlic cloves and the spice mix.\n" +
                "Toss the green chillies nicely in the spice mix. Transfer the pickle to a clean, dry jar.\n" +
                "Now heat mustard oil in a pan till it starts smoking. Turn off the heat.\n" +
                "Allow the mustard oil to cool down a bit. Pour the mustard oil over the pickle in the jar.\n" +
                "Seal the jar with a lid. And shake gently once.\n" +
                "Instant Green Chilli Pickle is ready to serve.\n" +
                "Store it at room temperature for a month or so.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "falsapickle");
        v.put(DatabaseContract.details.COL_NAME, "Falsa Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Falsa – 1 kg\n" +
                "Sugar – 3 tbsp\n" +
                "Salt – 1 tsp\n" +
                "Oil –  ½ cup\n" +
                "Mustard seeds – 1 tbsp heaped\n" +
                "Red pepper – 1 tsp heaped (crushed)\n" +
                "Turmeric –  ½ tsp\n" +
                "Onion seeds –  1 tsp\n" +
                "Fennel seeds – 1 tsp (heaped)\n");
        v.put(DatabaseContract.details.COL_METHOD, "Wash falsa well, In a plastic bowl add falsa, sugar and salt, covered and leave it for overnight in the fridge.\n" +
                "Mix together oil, mustard seeds, red pepper, turmeric, onion seeds and fennel seeds.\n" +
                "Add to the falsa, mix well and pour in sterilized bottles.\n" +
                "Use after 2 days.\n");
        v.put(DatabaseContract.details.COL_TIME, "48 hours approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "carrotpickle");
        v.put(DatabaseContract.details.COL_NAME, "Carrot Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Carrots – ½ kg\n" +
                "Red Chilli Powder – 1 Teaspoon\n" +
                "Salt – 1 Teaspoon\n" +
                "Amchur (Dry Mango Powder) – 1 Teaspoon\n" +
                "Haldi (Turmeric Powder) – ½ Teaspoon\n" +
                "Saunf (Fennel Seeds) – 1 Teaspoon\n" +
                "Mustard Seeds – 1 Teaspoon\n" +
                "Heeng (Asafoetida) – 1 Pinch\n" +
                "Mustard Oil – 3 Tablespoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Wash & peel the carrots and dry them completely. You can use kitchen roll to wipe off any excess water. Cut the carrots into long thick slices, about the size of a finger.\n" +
                "Grind a teaspoon of rai (mustard seeds) in a mortar & pestle. Add it to the mixture.\n" +
                "Add 1/2 teaspoon red chilli powder, 1 teaspoon salt, 1/2 teaspoon Mango powder, 1/3  teaspoon Turmeric powder, 1 teaspoon Fennel seeds and a pinch of heeng.\n" +
                "Then add 3 tablespoons of mustard oil. If you do not have mustard oil you can add any other cooking oil. Mix all the ingredients well. If the mixture seems dry then add more oil. Transfer the mixture to an airtight glass bottle.\n" +
                "Store it at room temperature for 3-4 days. Mix it occasionally, around once a day. The carrots would have absorbed the spices by this time. Refrigerate it after 4 days. Carrot pickle is ready.\n");
        v.put(DatabaseContract.details.COL_TIME, "4 days approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "jackfruitpickle");
        v.put(DatabaseContract.details.COL_NAME, "Jackfruit Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Jackfruit/kathal – 1 kg \n" +
                "Mustard Oil – 350 grams \n" +
                "Mango – 2 Raw\n" +
                "Fennel Seeds – 5 tablespoons \n" +
                "Fenugreek Seeds – 3 tablespoons \n" +
                "Mustard Seeds – 5 tbsp \n" +
                "Red Chilli powder – 3 tbsp \n" +
                "Turmeric Powder – 1 tablespoon \n" +
                "Salt (to taste)\n" +
                "Asafoetida / Hing powder – ½ tsp \n");
        v.put(DatabaseContract.details.COL_METHOD, "How To Peel The jackfruit- apply oil on your hands and the knife and then peel the jackfruit and cut into medium size pieces.\n" +
                "Seperate the jackfruit seeds and peel the skin /covering and slice them into two pieces.\n" +
                "Boil enough water in a pan with 1/2 tsp turmeric and 1 tsp salt.\n" +
                "Add the jackfruit pieces and the seeds and cook till 3/4 done.\n" +
                "Drain in a colender and let all the water drain from the jackfruit.\n" +
                "Spread a cloth in direct sun light and spread the boiled jackfruit over it to remove the excess water for about 5-6 hours.\n" +
                "Dry roast the fennel and fenugreek seeds for 2-3 minutes and then coarsly grind them with mustard seeds.\n" +
                "Heat mustard oil till it start smoking ,remove from the gas and then let it come to medium temperature.\n" +
                "Now add all the spices and the grated raw mango and stir fry for 2 minutes.\n" +
                "Add the jack fruit pieces and mix well.\n" +
                "When it cool down completely then fill in a glass jar and keep covered for a day.\n" +
                "Then daily keep in sunlight for a week and start using after a week.\n" +
                "The pickle should be submerged in oil completely else it get mold easily so add more oil if needed.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 week approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "homemadevegetablepickle");
        v.put(DatabaseContract.details.COL_NAME, "Home-Made Vegetable Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "1/2 cup cauliflower, florets\n" +
                "1/2 cup carrots, cubes\n" +
                "1 cup fresh mango, cubes\n" +
                "2 lemons, cubes\n" +
                "3 tablespoons lemon juice\n" +
                "2 tablespoons green chilies, not so hot variety, cut in 1 inch pieces\n" +
                "1/4 teaspoon turmeric powder\n" +
                "2 tablespoons red chili powder\n" +
                "1 tablespoon vinegar\n" +
                "1/2 teaspoon fenugreek powder\n" +
                "1 tablespoon mustard powder\n" +
                "2 tablespoons oil, for the seasoning\n" +
                "1 tablespoon mustard seeds, for the seasoning\n" +
                "a few curry leaves, for the seasoning\n" +
                "2 dry red chilies, broken, for the seasoning\n" +
                "2 tablespoons salt, or to taste\n");
        v.put(DatabaseContract.details.COL_METHOD, "Keep the chopped vegetables ready. Pat dry them so that there is no moisture. Set aside.\n" +
                "Heat the oil in a pan. Add mustard seeds. Let them crackle. Throw in the broken red chilies and curry leaves. Mix well. Turn off the heat. Set aside.\n" +
                "Add mixed vegetables to a bowl. Add all dry spices, salt, vinegar, and lemon juice. Add the seasoning you have prepared.\n" +
                "Mix it well. Your mixed vegetable pickle is ready!\n" +
                "At this point, the pickle may appear a bit dry.\n" +
                "After 1 or 2 days, the oil starts floating on the top, and the pickle becomes wet. Check for taste.\n" +
                "If needed, add salt or red chili powder. Mix it again.\n" +
                "After 3 days, store it in a refrigerator.\n" +
                "Whenever you want to serve the pickle, take it out from the refrigerator. After use, return it to the fridge.\n" +
                "You can make an instant pickle whenever you want and use it for up to 1 month.\n" +
                "Enjoy eating snacks and meals with instant mixed vegetable pickle!\n");
        v.put(DatabaseContract.details.COL_TIME, "3 weeks approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "sweetlimepickle");
        v.put(DatabaseContract.details.COL_NAME, "Sweet Lime Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Lime – 25(Steam and slice sprinkle salt (I cup)and keep in sun for 3 days shake or toss daily)\n" +
                "Ginger – 4 tablespoons sliced\n" +
                "Garlic – 4 tablespoons slice\n" +
                "Green chili – 4 slit\n" +
                "TO GRIND\n" +
                "Chili powder – 2 tablespoons\n" +
                "Garlic – 2 tbsp\n" +
                "Ginger – 1 \n" +
                "Mustard – 1 tablespoon\n" +
                "Cumin – ½ cup\n" +
                "OTHER INGREDIENTS \n" +
                "Vinegar – 2 cups\n" +
                "Sesame Oil – ½ cup\n" +
                "Sugar – ½ cup\n");
        v.put(DatabaseContract.details.COL_METHOD, "Heat Sesame oil ,fry and remove sliced ingredients\n" +
                "To the remaining oil ,add the ground ingredients\n" +
                "Cook on very low flame till a good smell comes and oil separates About 10 to 15 minutes\n" +
                "Add sugar ,cook for 5 minutes you will see all floating and color changing\n" +
                "Off the flame when half cool toss in the fried ingredients and the lime with the juice.\n" +
                "Leave it in a glass ball over night before bottle.\n");
        v.put(DatabaseContract.details.COL_TIME, "4-5 days approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "garlicpickle");
        v.put(DatabaseContract.details.COL_NAME, "Garlic Pickle");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Oil –  ¼ cup \n" +
                "Garlic –  ½ cup or 25 cloves\n" +
                "Green Chilli – 3 slit\n" +
                "Ginger – 3 inch julienne\n" +
                "Chilli Powder – 1 tablespoon \n" +
                "Turmeric (haldi) – ½ tsp \n" +
                "Pinch of hing\n" +
                "Mustard – 1 tablespoon \n" +
                "Methi / fenugreek seeds – ¼ tablespoon \n" +
                "Fennel / saunf – ½ tsp \n" +
                "Salt – 1 tablespoon\n" +
                "2 whole lemon juice\n");
        v.put(DatabaseContract.details.COL_METHOD, "Firstly, in a pan heat ¼ cup oil. use mustard oil for more flavours.\n" +
                "Further add 25 cloves garlic, 3 green chilli and 3 inch ginger.\n" +
                "Saute on medium flame till the garlic turns slightly golden. do not over roast the garlic as it doesn't taste great for pickle.\n" +
                "Furthermore add 1 tbsp chilli powder, ½ tsp turmeric and pinch of hing.\n" +
                "Saute for 30 seconds on low flame or till spices gets cooked well.\n" +
                "Cool the mixture completely.\n" +
                "Meanwhile, dry roast 1 tsp mustard, ¼ tsp methi and ½ tsp fennel.\n" +
                "Crush and powder them finely.\n" +
                "Furthermore add powdered masala to the prepared garlic mixture.\n" +
                "Also add 1 teaspoon salt and 2 whole lemon juice. mix well.\n" +
                "Finally, serve instant chilli garlic pickle with paratha or curd rice.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "glassnoodlesalad");
        v.put(DatabaseContract.details.COL_NAME, "Glass Noodle Salad");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Dried glass noodles – 150 grams\n" +
                "Oil – 1 tablespoon\n" +
                "Minced pork shrimp or chopped firm tofu – 250 grams\n" +
                "Garlic, peeled and minced – 1 clove\n" +
                "Limes – 2\n" +
                "Soy Sauce – 3 tablespoon\n" +
                "Fish sauce or more soy sauce – 1 tablespoon\n" +
                "Sesame oil – 2 tablespoons\n" +
                "Brown sugar – 2 tablespoons\n" +
                "Fresh Ginger root, grated – 1,5 cm \n" +
                "Small red Thai Chili, minced – 1\n" +
                "Carrot, thinly sliced or julienned – 1\n" +
                "Spring onions, sliced – 4\n" +
                "1/2 bunch cilantro, chopped\n" +
                "Roasted peanuts – 40 grams\n");
        v.put(DatabaseContract.details.COL_METHOD, "Put the glass noodles in a bowl and cover with boiling water. Let them sit for about 10 minutes.\n" +
                "In the meantime bring a pot with 1 l of water to a boil and heat a middle sized pan with 1 tsp of oil. Add the minced pork let fry for about 5 minutes, breaking the pieces apart with a fork as it fries. Add a pinch of salt and let fry for another 3 minutes, then add the garlic and fry for another minute until the garlic looses its raw smell. Put aside.\n" +
                "Take noodles from soaking water and add them to the pot of boiling water.  Let them sit in the water for a minute, then drain and rinse with cold water. Cut them into smaller pieces with your kitchen scissors. \n" +
                "Juice the limes into a small bowl and add the soy sauce, fish sauce, sesame oil, ginger and brown sugar. Stir until the sugar dissolves. If it doesn't, put it in the microwave for a couple of seconds and stir again.\n" +
                "Set some peanuts and cilantro aside for decoration.  Combine all the ingredients including dressing in a bowl and mix well. You want the dressing to coat the noodles properly. Sprinkle with peanuts and cilantro and serve.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "beansaladandvegetablepickle");
        v.put(DatabaseContract.details.COL_NAME, "Bean Salad with Pickled Vegetable");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Onion – 1 Chopped\n" +
                "Capsicum – 1 Chopped\n" +
                "Tomato – 1 Chopped\n" +
                "Green chilies – 2 (Chopped\n" +
                "Garlic cloves – 4\n" +
                "Black Olives – 10\n" +
                "Coriander Leaves –  ½ Bunch (fresh)\n" +
                "Chickpeas – ½ cup (boiled)\n" +
                "Red kidney beans – ½ cup (boiled)\n" +
                "Black chickpeas –  ½ cup (boiled)\n" +
                "Black eye beans –  ½ cup (boiled)\n" +
                "Radish (cut into pieces) – ½ cup\n" +
                "Vinegar –  ½ cup\n" +
                "Lemon juice –  2 tablespoons\n" +
                "Salt –  ½ tablespoon\n" +
                "Black pepper –  ½ tablespoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Heat vinegar in a pan and turn the flame off.\n" +
                "Add chopped capsicum, cloves of garlic, chopped onion and chopped green chilies, soak for 5 minutes.\n" +
                "In a bowl , mix together chopped tomato, black olives, chopped fresh coriander leaves, boiled chickpeas, boiled red beans, boiled black chickpeas, boiled black eye beans, radish pieces, lemon juice, salt and black pepper.\n" +
                "Top with pickled vegetable mixture and serve.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "potatoandsausagesalad");
        v.put(DatabaseContract.details.COL_NAME, "Potato and Sausage Salad");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Olive oil – 4 tablespoon\n" +
                "Red wine vinegar – 1 tablespoon\n" +
                "Tomato ketchup – 1 tablespoon\n" +
                "Smooth mustard – 2 tablespoons\n" +
                "Runny honey – 1 tablespoon\n" +
                "Salt and freshly ground black pepper\n" +
                "Vegetable oil – 1 tablespoon\n" +
                "6 thick pork sausages\n" +
                "Cooked new potatoes, halved or thickly sliced – 175 grams\n" +
                "Cherry tomatoes, halved – 100 grams\n" +
                "6 spring onions, trimmed and sliced\n" +
                "Bag mixed salad leaves – 200 grams\n");
        v.put(DatabaseContract.details.COL_METHOD, "To make the dressing, put the olive oil, vinegar, ketchup, mustard and honey in a small screw-topped jar. Season with salt and freshly ground black pepper, put on the lid and shake until well blended. Set aside.\n" +
                "Heat the vegetable oil in a large deep frying pan and fry the sausages for 10-12mins, turning frequently until browned and cooked through. Remove and drain on kitchen paper.\n" +
                "Add the potatoes to the pan juices and fry over a high heat for 5-6mins, turning once until crisp and golden. Add the cherry tomatoes and spring onions to the pan and fry for 1min. Slice the sausages and add to the pan.\n" +
                "Divide the salad leaves between four serving plates and top with the potato and sausage mixture. Season with a little more freshly ground black pepper and serve with the dressing.\n");
        v.put(DatabaseContract.details.COL_TIME, "45 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "cucumberraita");
        v.put(DatabaseContract.details.COL_NAME, "Cucumber Raita");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Medium sized cucumber, or finely chopped cucumber – 1 cup\n" +
                "Fresh curd (dahi or yogurt) – 1 cup\n" +
                "Red chili powder/lal mirch powder (optional) – ½  teaspoon \n" +
                "Roasted cumin powder/bhuna jeera powder – 1 teaspoon \n" +
                "Chaat masala powder – ½ teaspoon \n" +
                "Salt as required\n" +
                "Chopped coriander leaves – 1 tablespoon \n");
        v.put(DatabaseContract.details.COL_METHOD, "Rinse the cucumber. Then peel the cucumber and finely chop it. You can also grate the cucumber.\n" +
                "In a bowl, beat the curd till smooth.\n" +
                "Add the grated cucumber to the curd.\n" +
                "Add all the dry spice powders, rock salt or black salt and coriander leaves.\n" +
                "Mix well and serve cucumber raita.\n" +
                "You could even garnish the cucumber raita with some coriander leaves or mint leaves.\n");
        v.put(DatabaseContract.details.COL_TIME, "20 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "fruitraita");
        v.put(DatabaseContract.details.COL_NAME, "Fruit Raita");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Chilled yogurt (dahi or curd) – 4 tablespoons\n" +
                "Pomegranate (sliced and the arils removed) – 1 medium\n" +
                "Apple (peeled, cored and chopped) – 1 medium\n" +
                "Banana (peeled and chopped) – 1 medium\n" +
                "Sugar – 1- ½ tablespoon\n" +
                "Roasted cumin powder (bhuna jeera powder) – 1 pinch\n" +
                "Rock salt (sendha namak) or black salt – 1 pinch\n" +
                "Red chili powder or cayenne pepper – 1 pinch\n");
        v.put(DatabaseContract.details.COL_METHOD, "Whisk the yogurt (curd) till smooth.\n" +
                "Add sugar or as required. Mix the sugar well, till it dissolves.\n" +
                "Next add roasted cumin powder, 1 pinch of red chili powder and 1 pinch of rock salt. Stir well.\n" +
                "Lastly add the chopped banana, apple and pomegranate arils. Mix well.\n" +
                "You also garnish the raita with pomegranate arils.\n" +
                "Serve the fruit raita immediately.\n");
        v.put(DatabaseContract.details.COL_TIME, "25 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "vegetableraita");
        v.put(DatabaseContract.details.COL_NAME, "Vegetable Raita");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Thick yogurt (curd or dahi) – 1 cup\n" +
                "Cucumber peeled & finely chopped – ¼ cup\n" +
                "Boiled potato peeled & finely chopped – ¼ cup\n" +
                "Tomato finely chopped (deseeded) – ¼ cup\n" +
                "Carrot peeled & grated – ¼ cup\n" +
                "Green chilli finely chopped – 2 \n" +
                "Coriander leaves finely chopped – 2 tablespoon\n" +
                "Rock salt to taste\n" +
                "Black pepper powder – ½ tablespoon\n" +
                "Roasted cumin powder – ¼ tablespoon\n");
        v.put(DatabaseContract.details.COL_METHOD, "Collect all the required ingredients.\n" +
                "In a mixing bowl,  whisk the yogurt (curd or dahi) till you get a smooth texture.\n" +
                "Add the chopped veggies(cucumber, carrot, tomato, boiled potato).\n" +
                "Stir well to combine them into the yogurt.\n" +
                "Now add green chilies, coriander leaves,  rock salt, black pepper powder, and roasted cumin powder.\n" +
                "Mix all the ingredients thoroughly. Check, the taste and add more of the spice powders or salt if required.\n" +
                "Mix veg raita is ready. Transfer it to a serving bowl.\n" +
                "Garnish this mix vegetable raita with some cumin powder, red chili powder, and green coriander and serve it along with any meal.\n");
        v.put(DatabaseContract.details.COL_TIME, "15 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "mixedvegetablesoup");
        v.put(DatabaseContract.details.COL_NAME, "Mixed Vegetable Soup");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Olive oil – 1 tablespoon\n" +
                "Onion – 1 chopped\n" +
                "Carrots – 2 chopped\n" +
                "Stalk Celery – 1 chopped\n" +
                "Head cauliflower or broccoli – 1 chopped\n" +
                "Potato or sweet potato – 1 (peeled and chopped)\n" +
                "Bay leaf – 1 \n" +
                "Thyme – 1 \n" +
                "Green beans, corn, chopped tomato, or other vegetables – 1 cup \n" +
                "chopped leafy greens such as kale, collards, spinach, watercress or broccoli rabe – 3 cups\n" +
                "Sea salt or kosher salt and freshly ground pepper\n");
        v.put(DatabaseContract.details.COL_METHOD, "Heat the olive oil in a soup pot. Add the onion, carrot, and celery and cook for 5 minutes.\n" +
                "Add the cauliflower, potato, leek, bay leaf, and thyme. Add enough water to cover the vegetables, as well as a generous pinch of salt.\n" +
                "Bring the soup to a boil, then cover and reduce the heat. Simmer the soup for about 20 minutes or until the vegetables are tender.\n" +
                "Puree about half of the soup mixture. \n" +
                "Add the remaining vegetables of your choice: green beans, corn, tomatoes or anything else you've chosen. Cook until the greens are tender.\n" +
                "Season to taste and serve.\n");
        v.put(DatabaseContract.details.COL_TIME, "30 minutes approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "butternutsquashsoup");
        v.put(DatabaseContract.details.COL_NAME, "Butternut Squash Soup");
        v.put(DatabaseContract.details.COL_INGREDIENT, "Large Butternut squash, peeled and cubed (seeds removed) \n" +
                "Potatoes, peeled and chopped – 2 \n" +
                "Extra-virgin olive oil – 3 tablespoons\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Butter – 1 tablespoon\n" +
                "Onion, chopped – 1 \n" +
                "Stalk celery, thinly sliced – 1 \n" +
                "Large Carrot, chopped – 1 \n" +
                "Fresh thyme, plus more for garnish – 1 tablespoon\n" +
                "Low-sodium chicken broth\n");
        v.put(DatabaseContract.details.COL_METHOD, "Preheat oven to 400º. On a large baking sheet, toss butternut squash and potatoes with 2 tablespoons olive oil and season generously with salt and pepper. Roast until tender, 25 minutes.\n" +
                "Meanwhile, in a large pot over medium heat, melt butter and remaining tablespoon olive oil. Add onion, celery, and carrot and cook until softened, 7 to 10 minutes. Season generously with salt, pepper, and thyme.\n" +
                "Add roasted squash and potatoes and pour over chicken broth. Simmer 10 minutes, then using an immersion blender, blend soup until creamy. (Alternately, carefully transfer batches of the hot soup to a blender.)\n" +
                "Serve garnished with thyme.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);


        v.put(DatabaseContract.details.COL_ID, "leekcheeseandpotatosoup");
        v.put(DatabaseContract.details.COL_NAME, "Leek, Cheese and Potato Soup");
        v.put(DatabaseContract.details.COL_INGREDIENT, "leeks, white part only, finely chopped\n" +
                "medium potatoes, peeled and cut into small cubes\n" +
                "Butter – 1 knob\n" +
                "Vegetable stock, or chicken stock (if using cubes use the organic bullion ones) – 750ml\n" +
                "Semi-skimmed milk – 250 ml\n" +
                "Cheddar, half fat, grated – 60 grams\n" +
                "Black pepper to taste\n");
        v.put(DatabaseContract.details.COL_METHOD, "Once the leeks and potato are peeled and cut, pop them into a frying pan with the butter and ask the children to grate the cheese. My smallest likes to help here by eating the cheese as they grate.\n" +
                "Allow the leek and potatoes long enough to tenderise and then transfer to a large saucepan and add in the stock, pepper and cheese. Allow each child to stir for six turns and then wait for it boil before covering and simmering.\n" +
                "Simmer for 45 minutes minutes to 1 hour; just long enough to play a game of Frustration with the kids.\n" +
                "Remove from the heat and ask a child to add the milk and then set about mashing the soup – for those who prefer a smooth consistency like my brood an electric whisk can work wonders whilst also causing hours of delight for the offspring.\n" +
                "The result: A healthy meal which doesn’t taste too much like it was made out of vegetables that all the family can enjoy, serve with croutons, a baguette or a good old fashioned chunk of bread.\n");
        v.put(DatabaseContract.details.COL_TIME, "1 hour approximately");
        db.insert(DatabaseContract.details.TABLE_NAME, null, v);
    }


}