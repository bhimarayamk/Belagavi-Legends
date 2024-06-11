package com.example.toureasy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper3 extends SQLiteOpenHelper {
    public static final String DBname = "TourEasy2.db";

    public DBHelper3(Context context) {

        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("CREATE TABLE DESTINATION(did INTEGER,dname TEXT,PRIMARY KEY(did))");
        MyDB.execSQL("CREATE TABLE DISTAN(sid INTEGER,did INTEGER,distance INTEGER,mapLink TEXT,uberLink TEXT)");

    }

    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists DESTINATION");
        onCreate(MyDB);
    }

    public void destinationInsert(){
        int i,j,k=0;
        String[] destList = {"Kittur","Sangolli", "Belawadi", "Parasgad Fort", "Amaturu","Savalagi","Kartik"};
        SQLiteDatabase MyDB = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        long result=0;
        for(i=0;i<7;i++){
            contentValues.put("did", i+1);
            contentValues.put("dname", destList[i]);
            result = MyDB.insert("destination", null, contentValues);
        }
        MyDB.close();
    }

    public int checkDestinationId(String destina){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select did from destination where dname  = ?", new String[]{destina});
        if(cursor.getCount()>0){
            String id = null;
            while(cursor.moveToNext()){
                id = cursor.getString(0);
            }
            cursor.close();
            MyDB.close();
            return Integer.parseInt(id);
        }
        cursor.close();
        MyDB.close();
        return 00;
    }

    public Boolean insertDistance(){
        int i,j,k=0,l=0,u=0;
        double[] distances = {55,58,68.2,97.7,52.8,175,6,14.1,13,4,14.3,3.5,30,5.1,14,16,12,11,17,11.2,14};
        String[] mapArray = {"https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Kittur+Fort,+Kittur+Fort+Road,+Kittur,+Karnataka/@15.7188396,74.4599934,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bbf37f263d6ada3:0x60ea22ed0cef7424!2m2!1d74.7914123!2d15.6012363?entry=ttu",
                            "https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Sangolli+Rayanna+Kalyana+Mantapa,+Sangolli,+Karnataka/@15.7621045,74.4808015,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bbf4ed498c4ec1f:0xcb114f56777dd562!2m2!1d74.8327404!2d15.716072?entry=ttu",
                            "https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Belawadi,+Belgaum+Division,+Karnataka/@15.7786909,74.5225704,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bbf4b81020128f3:0x7a528dcc457d2e22!2m2!1d74.9164928!2d15.7161377?entry=ttu",
                            "https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Savadatti+fort,+Saundatti,+Karnataka/@15.7619186,74.4566758,10z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bb8b0e351893c63:0xbb8e5c9195f35aa1!2m2!1d75.1131606!2d15.7680109?entry=ttu",
                            "https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Amatur+Balappa+Circle,+Karnataka/@15.8056842,74.4882566,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bbf51df6e74226f:0xc51149637c944864!2m2!1d74.8469456!2d15.8079588?entry=ttu",
                            "https://www.google.com/maps/dir/VTU+main+Campus,+VTU+campuss,+Visvesvaraya+Technological+University,+Machhe,+Belagavi,+Karnataka/Savalagi,+Karnataka/@16.2212831,74.5730323,10z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bbf6f163528e725:0x7503677564477dd2!2m2!1d74.463913!2d15.7781532!1m5!1m1!1s0x3bc71f54f6dad703:0x7126fdc3b5bbbc86!2m2!1d75.3426754!2d16.6690649?entry=ttu",
                            "https://www.google.com/maps/dir/KSRTC+Karnataka+state+road+transport+corporation,+C%2FO+Bhagavathi+General+Store,+Near+Kalakunja+Road,+Kodialbail,+Lalbagh,+Mangaluru,+Karnataka+575003/Sulthan+Bathery,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.9064999,74.8107995,14z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35a3a4b4afbc1:0x9da0b6f50d073157!2m2!1d74.8417348!2d12.8854757!1m5!1m1!1s0x3ba35a92a4df8ab9:0xdc0b7b4637988f4a!2m2!1d74.8150715!2d12.8860023",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Panambur+Beach,+National+Highway+66,+New+Mangalore,+Indian+Oil+Tank+Farm,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.9015765,74.8000052,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35047685a26f9:0x4a85aeb7baf923ff!2m2!1d74.8046043!2d12.9369411",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Tannirbhavi+Beach,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.8954311,74.79821,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35a91911885a9:0x6a42103fb75e4e93!2m2!1d74.8138741!2d12.8913022",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Kadri+Shree+Manjunatha+Temple,+Kadri+Temple+Road,+Vasanth+Vihar,+Kadri,+Mangaluru,+Karnataka/@12.8745408,74.8310062,14z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35a3e64773ad1:0xe35d05aed8ff9308!2m2!1d74.8554198!2d12.8857411",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Pilikula+Nisarga+Dhama,+Vamanjoor,+Karnataka/@12.897642,74.8358086,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35741f51c2055:0x1d89b4cba236ad62!2m2!1d74.8958481!2d12.9299317",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Mahathobhara+Sri+Mangaladevi+Temple,+Mangaladevi+Temple+Road,+Bolar,+Mangaluru,+Karnataka/@12.8560032,74.8361492,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35bbbd8b5408b:0x8ac51fa0a23cf4ec!2m2!1d74.845444!2d12.8491851",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Sri+Durgaaparameshwari+Temple+Kateelu,+Temple+Road,+Ullanje,+Karnataka/@12.9537494,74.7158653,11z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35381eaaaaaab:0xd0bac50d47d003cd!2m2!1d74.8700804!2d13.043881",
                            "https://www.google.com/maps/dir/Mangalore+Central+Railway+Station,+Attavar,+Mangaluru,+Karnataka/Sulthan+Bathery,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.8954311,74.79821,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba35bb399771a07:0xeb2856bb79d6e5ff!2m2!1d74.843251!2d12.8633417!1m5!1m1!1s0x3ba35a92a4df8ab9:0xdc0b7b4637988f4a!2m2!1d74.8150715!2d12.8860023",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Panambur+Beach,+National+Highway+66,+New+Mangalore,+Indian+Oil+Tank+Farm,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.9526436,74.8119722,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35047685a26f9:0x4a85aeb7baf923ff!2m2!1d74.8046043!2d12.9369411",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Tannirbhavi+Beach,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.9365016,74.781083,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35a91911885a9:0x6a42103fb75e4e93!2m2!1d74.8138741!2d12.8913022",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Kadri+Shree+Manjunatha+Temple,+Kadri+Temple+Road,+Vasanth+Vihar,+Kadri,+Mangaluru,+Karnataka/@12.9187147,74.8225445,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35a3e64773ad1:0xe35d05aed8ff9308!2m2!1d74.8554198!2d12.8857411",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Pilikula+Nisarga+Dhama,+Vamanjoor,+Karnataka/@12.9540419,74.8622903,13z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35741f51c2055:0x1d89b4cba236ad62!2m2!1d74.8958481!2d12.9299317",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Mahathobhara+Sri+Mangaladevi+Temple,+Mangaladevi+Temple+Road,+Bolar,+Mangaluru,+Karnataka/@12.9014144,74.7953814,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35bbbd8b5408b:0x8ac51fa0a23cf4ec!2m2!1d74.845444!2d12.8491851",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Sri+Durgaaparameshwari+Temple+Kateelu,+Temple+Road,+Ullanje,+Karnataka/@12.9989378,74.8099708,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35381eaaaaaab:0xd0bac50d47d003cd!2m2!1d74.8700804!2d13.043881",
                            "https://www.google.com/maps/dir/Mangalore+Airport,+Mangaluru,+Karnataka/Sulthan+Bathery,+Kasba+Bengre,+Mangaluru,+Karnataka/@12.933908,74.781083,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3ba350d3616d95e9:0x46d57322d8165a30!2m2!1d74.8854022!2d12.9536624!1m5!1m1!1s0x3ba35a92a4df8ab9:0xdc0b7b4637988f4a!2m2!1d74.8150715!2d12.8860023"};

        String[] uberArray = {"https://www.youtube.com/watch?v=oaFfYLTNKrQ",
                             "https://www.youtube.com/watch?v=gJcH-SP7l6E",
                             "https://www.youtube.com/watch?v=N7piF7iEzh8",
                             "https://www.youtube.com/watch?v=llhSuKJFgb8",
                             "https://www.youtube.com/watch?v=-SoYOxDuxEs",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A16.6690649%2C%22longitude%22%3A75.34267539999999%2C%22addressLine1%22%3A%22Savalagi%22%2C%22addressLine2%22%3A%22Karnataka%22%2C%22id%22%3A%22ChIJA9fa9lQfxzsRhry7tcP9JnE%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A15.8496953%2C%22longitude%22%3A74.4976741%2C%22addressLine1%22%3A%22Belagavi%22%2C%22addressLine2%22%3A%22Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJLzaVUJ9mvzsRX_ve3B6zNH4%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8860023%2C%22longitude%22%3A74.8150715%2C%22addressLine1%22%3A%22Sulthan%20Bathery%22%2C%22addressLine2%22%3A%22Kasba%20Bengre%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJuYrfpJJaozsRSo-YN0Z7C9w%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22id%22%3A%22ChIJVVVVVZleozsRXeb3uzecTGQ%22%2C%22provider%22%3A%22google_places%22%2C%22addressLine1%22%3A%22KSRTC%20Ticket%20Booking%20Centre%22%2C%22addressLine2%22%3A%22S%2F%20O%20Narayana%20Gatty%2C%20House%20No.%204%20-%20129%20D%2C%20Shivaprasad%20Nilaya%2C%20Kotepura%20Post%2C%20Beeri%2C%20Mangaluru%2C%20Karnataka%22%2C%22latitude%22%3A12.7945687%2C%22longitude%22%3A74.8799518%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.9530213%2C%22longitude%22%3A74.8011783%2C%22addressLine1%22%3A%22Panambur%20Beach%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%22%2C%22id%22%3A%22ChIJGX8kHstRozsRreQ_npNssow%22%2C%22provider%22%3A%22google_places%22%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8913022%2C%22longitude%22%3A74.81387409999999%2C%22addressLine1%22%3A%22Tannirbhavi%20Beach%22%2C%22addressLine2%22%3A%22Kasba%20Bengre%2C%20Mangaluru%2C%20Karnataka%22%2C%22id%22%3A%22ChIJqYUYkZFaozsRk05etz8QQmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8857411%2C%22longitude%22%3A74.85541979999999%2C%22addressLine1%22%3A%22Kadri%20Shree%20Manjunatha%20Temple%22%2C%22addressLine2%22%3A%22Kadri%20Temple%20Road%2C%20Vasanth%20Vihar%2C%20Kadri%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ0Tp3ZD5aozsRCJP_2K4FXeM%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.9299317%2C%22longitude%22%3A74.8958481%2C%22addressLine1%22%3A%22Pilikula%20Nisarga%20Dhama%22%2C%22addressLine2%22%3A%22Vamanjoor%2C%20Karnataka%22%2C%22id%22%3A%22ChIJVSAc9UFXozsRYq02osu0iR0%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8491851%2C%22longitude%22%3A74.845444%2C%22addressLine1%22%3A%22Mahathobhara%20Sri%20Mangaladevi%20Temple%22%2C%22addressLine2%22%3A%22Mangaladevi%20Temple%20Road%2C%20Bolar%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJi0C12LtbozsR7PQ8oqAfxYo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A13.0444388%2C%22longitude%22%3A74.86956289999999%2C%22addressLine1%22%3A%22Kateel%22%2C%22addressLine2%22%3A%22Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJkUGZVn9TozsR4tZriYHEAwI%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8860023%2C%22longitude%22%3A74.8150715%2C%22addressLine1%22%3A%22Sulthan%20Bathery%22%2C%22addressLine2%22%3A%22Kasba%20Bengre%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJuYrfpJJaozsRSo-YN0Z7C9w%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.8634466%2C%22longitude%22%3A74.84286399999999%2C%22addressLine1%22%3A%22Railway%20Station%20Parking%22%2C%22addressLine2%22%3A%22Attavar%2C%20Mangalore%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJAZ6OFrNbozsRa3qkzAqLzmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.9530213%2C%22longitude%22%3A74.8011783%2C%22addressLine1%22%3A%22Panambur%20Beach%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%22%2C%22id%22%3A%22ChIJGX8kHstRozsRreQ_npNssow%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8913022%2C%22longitude%22%3A74.81387409999999%2C%22addressLine1%22%3A%22Tannirbhavi%20Beach%22%2C%22addressLine2%22%3A%22Kasba%20Bengre%2C%20Mangaluru%2C%20Karnataka%22%2C%22id%22%3A%22ChIJqYUYkZFaozsRk05etz8QQmo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8857411%2C%22longitude%22%3A74.85541979999999%2C%22addressLine1%22%3A%22Kadri%20Shree%20Manjunatha%20Temple%22%2C%22addressLine2%22%3A%22Kadri%20Temple%20Road%2C%20Vasanth%20Vihar%2C%20Kadri%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ0Tp3ZD5aozsRCJP_2K4FXeM%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.9299317%2C%22longitude%22%3A74.8958481%2C%22addressLine1%22%3A%22Pilikula%20Nisarga%20Dhama%22%2C%22addressLine2%22%3A%22Vamanjoor%2C%20Karnataka%22%2C%22id%22%3A%22ChIJVSAc9UFXozsRYq02osu0iR0%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8491851%2C%22longitude%22%3A74.845444%2C%22addressLine1%22%3A%22Mahathobhara%20Sri%20Mangaladevi%20Temple%22%2C%22addressLine2%22%3A%22Mangaladevi%20Temple%20Road%2C%20Bolar%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJi0C12LtbozsR7PQ8oqAfxYo%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A13.043881%2C%22longitude%22%3A74.87008039999999%2C%22addressLine1%22%3A%22Sri%20Durgaaparameshwari%20Temple%20Kateelu%22%2C%22addressLine2%22%3A%22Temple%20Road%2C%20Ullanje%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJq6qq6oFTozsRzQPQRw3FutA%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217",
                             "https://m.uber.com/looking?drop%5B0%5D=%7B%22latitude%22%3A12.8860023%2C%22longitude%22%3A74.8150715%2C%22addressLine1%22%3A%22Sulthan%20Bathery%22%2C%22addressLine2%22%3A%22Kasba%20Bengre%2C%20Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJuYrfpJJaozsRSo-YN0Z7C9w%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&pickup=%7B%22latitude%22%3A12.9536624%2C%22longitude%22%3A74.8854022%2C%22addressLine1%22%3A%22Mangalore%20Airport%22%2C%22addressLine2%22%3A%22Mangaluru%2C%20Karnataka%2C%20India%22%2C%22id%22%3A%22ChIJ6ZVtYdNQozsRMFoW2CJz1UY%22%2C%22provider%22%3A%22google_places%22%2C%22index%22%3A0%7D&vehicle=9217"};
        long result =0;
        SQLiteDatabase myDB = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        for(i=0;i<3;i++){
            for(j=0;j<7;j++) {
                contentValues.put("sid", i+1);
                contentValues.put("did",j+1);
                contentValues.put("mapLink",mapArray[l]);
                contentValues.put("distance",distances[k]);
                contentValues.put("uberLink",uberArray[u]);
                k++;
                l++;
                u++;
                result = myDB.insert("distan", null, contentValues);
            }
        }
        myDB.close();
        if(result==-1) return false;
        else return true;
    }

    public float getDistan(int sidd,int did){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        String sid = Integer.toString(sidd);
        String didd = Integer.toString(did);
        Cursor cursor = MyDB.rawQuery("Select distance from distan where sid = ? and did=?",new String[]{sid,didd});
        if(cursor.getCount()>0){
            String id = null;
            int count = 0;
            while(cursor.moveToNext()){
                id = cursor.getString(0);
                count++;
            }
            cursor.close();
            MyDB.close();

            return Float.parseFloat(id);

        }
        cursor.close();
        MyDB.close();
        return 00;
    }

    public String getMapLink(int sidd,int did){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        String sid = Integer.toString(sidd);
        String didd = Integer.toString(did);
        Cursor cursor = MyDB.rawQuery("Select mapLink from distan where sid = ? and did=?",new String[]{sid,didd});
        if(cursor.getCount()>0){
            String id = null;
            while(cursor.moveToNext()){
                id = cursor.getString(0);
            }
            cursor.close();
            MyDB.close();

            return id;

        }
        cursor.close();
        MyDB.close();
        return null;
    }

    public String getUberLink(int sidd,int did){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        String sid = Integer.toString(sidd);
        String didd = Integer.toString(did);
        Cursor cursor = MyDB.rawQuery("Select uberLink from distan where sid = ? and did=?",new String[]{sid,didd});
        if(cursor.getCount()>0){
            String id = null;
            while(cursor.moveToNext()){
                id = cursor.getString(0);
            }
            cursor.close();
            MyDB.close();

            return id;
        }
        cursor.close();
        MyDB.close();
        return null;
    }
}
