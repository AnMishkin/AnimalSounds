//для каждого 5го

package download.mishkindeveloper.AnimalSounds

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import download.mishkindeveloper.AnimalSounds.databinding.ActivityLevBinding
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class lev : AppCompatActivity() {
    //закинуть в другие лайаяуты!!!!!!!!!!!!!!!!!!!!!!
    lateinit var binding: ActivityLevBinding
    private var interAd: InterstitialAd? = null

    //воспроизведение звука животного
    val mediaPlayer by lazy { MediaPlayer.create(this, R.raw.lev) }

    override fun onCreate(savedInstanceState: Bundle?) {

        var music = false

        super.onCreate(savedInstanceState)
        binding = ActivityLevBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getSupportActionBar()?.hide();

        //запуск рекламы баннерной!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      initAdMob()


        //замена мультяшного животного на обычного и назад
        fun onClickAnimal() {
            binding.imageAnimal.setOnClickListener(View.OnClickListener {
                binding.imageAnimal.setImageResource(R.mipmap.levs)

                binding.imageAnimal.setOnClickListener {
                    binding.imageAnimal.setImageResource(R.mipmap.lev)
                    onClickAnimal()
                }
            })
        }
        onClickAnimal()

        //проигрываем и останавливаем музыку
        fun playMusic() {
            binding.imageZvyk.setOnClickListener {
                if (music) {
                    mediaPlayer.stop()
                    mediaPlayer.prepare()
                } else {
                    mediaPlayer.start()
                }
                music = !music
            }
        }
        playMusic()

//следующая картинка
        binding.imageNext.setOnClickListener {
            nextImage()
            finish()
            mediaPlayer.stop()

            //запуск рекламы при переходе на след страницу
            showInterAd()

        }
    }

    //передалал переход на следующюю картинку за счет функции
    private fun nextImage(){
        var intent = Intent(this, monkey::class.java)
        startActivity(intent)
    }

    //начиная от сюда поставить во все лайяуты!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    override fun onPause() {
        super.onPause()
        mediaPlayer.stop()
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
            //"ca-app-pub-3971991853344828/7530772944",
            "ca-app-pub-3940256099942544/1033173712", //тестовый айди
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
                        nextImage()
                        interAd = null
                        loadInterAd()
                    }

                    override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                        nextImage()
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





























