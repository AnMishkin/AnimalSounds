package download.mishkindeveloper.AnimalSounds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import download.mishkindeveloper.AnimalSounds.databinding.ActivityFinishBinding


import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class finish : AppCompatActivity() {
    //закинуть в другие лайаяуты!!!!!!!!!!!!!!!!!!!!!!
    lateinit var binding: ActivityFinishBinding
    private var interAd: InterstitialAd? = null



    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getSupportActionBar()?.hide();

        //запуск рекламы баннерной!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        initAdMob()


        //в самое начало программы+реклама
        binding.btnRestart.setOnClickListener {
            var restart = Intent (this, download.mishkindeveloper.AnimalSounds.lev::class.java)
            startActivity(restart)
            //запуск рекламы при переходе на след страницу
            showInterAd()
        }
//выход с приложения
        binding.btnExit.setOnClickListener {
            //запуск рекламы при переходе на след страницу
            //showInterAd()
            finish()

        }





    }



    //начиная от сюда поставить во все лайяуты!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    override fun onPause() {
        super.onPause()

        binding.adView.pause()
    }


    //функция запуска баннерной рекламы,скопировать на каждый 5 лайяут!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private fun initAdMob() {
        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)
    }

    override fun onResume() {
        super.onResume()
        binding.adView.resume()
        loadInterAd()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.adView.destroy()
    }

    //скопировать на каждый 5 лайяут фулскрин реклама - с заменой кода!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private fun loadInterAd() {

        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(this,
            "ca-app-pub-3971991853344828/7241345942",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(p0: LoadAdError) {
                    interAd = null
                }

                override fun onAdLoaded(ad: InterstitialAd) {
                    interAd = ad
                }
            })
    }


    private fun showInterAd() {
        if (interAd != null) {
            interAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {

                        interAd = null
                        loadInterAd()
                    }

                    override fun onAdFailedToShowFullScreenContent(p0: AdError) {

                        interAd = null
                        loadInterAd()
                    }

                    override fun onAdShowedFullScreenContent() {
                        interAd = null
                        loadInterAd()
                    }
                }

            interAd?.show(this)
        }
    }





}