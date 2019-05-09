# LockBackAndHome
Assalamuallaikum wr. wb.<br>
<br>
Di sini saya akan membagikan bagaimana cara mengunci Tombol Back Home And Resume, mungkin saya belum tau cara mengunci dengan kode lebih spesifiknya, tapi ini saya hanya saja mengimplementasikan cara Locknya dengan Lifecycle dan Inten.
<br><br>
```
    @Override
    public void onStart(){
        super.onStart();
        Log.i( "Masuk" ,"onStart");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i( "Masuk" ,"onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this, "bisa", Toast.LENGTH_SHORT).show();
        Log.i( "Masuk" ,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i( "Masuk" ,"onPause");
    }

    @Override
    public void onStop(){
        finish();
        super.onStop();
        Log.i( "Masuk" ,"onStop");
    }

    @Override
    public void onDestroy(){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("belajar.kuncibackandhome.id");
        startActivity(launchIntent);
        super.onDestroy();
        Log.i( "Masuk" ,"onDestroy");
    }
  ```
  <br>
  mungkin kodenya hanya begitu ya, ini saya hanya menjawab pertanyaan dari teman-teman yang merequest cara lock Home, Back, And Resume, semoga kodingan saya ini bermanfaat.
  <br>
Jika ada pertanyaan lagi bisa saja hubungi saya, jika saya bisa nanti saya akan bantu dan share mengenai masalah yang anda alami, Trimakasih.
<br>
Waalaikumsalam wr. wb.
