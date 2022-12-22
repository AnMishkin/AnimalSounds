//для каждого

package download.mishkindeveloper.AnimalSounds
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import download.mishkindeveloper.AnimalSounds.databinding.ActivitySnakeBinding
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd


class snake : AppCompatActivity() {
    //закинуть в другие лайаяуты!!!!!!!!!!!!!!!!!!!!!!
    lateinit var binding: ActivitySnakeBinding
    private var interAd: InterstitialAd? = null

    //воспроизведение звука животного
    val mediaPlayer by lazy { MediaPlayer.create(this, R.raw.snake) }

    override fun onCreate(savedInstanceState: Bundle?) {

        var music = false

        super.onCreate(savedInstanceState)
        binding = ActivitySnakeBinding.inflate(layoutInflater)
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
                binding.imageAnimal.setImageResource(R.mipmap.snakes)

                binding.imageAnimal.setOnClickListener {
                    binding.imageAnimal.setImageResource(R.mipmap.snake)
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
        //преведущая картинка
        binding.imageBack.setOnClickListener {
            var intent = Intent(this,grasshopper::class.java)
            startActivity(intent)
            finish()
            mediaPlayer.stop()
        }
    }

    //передалал переход на следующюю картинку за счет функции
    private fun nextImage(){
        var intent = Intent(this, MouseActivity::class.java)
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
        //loadInterAd()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.adView.destroy()
    }

    //скопировать на каждый 5 лайяут фулскрин реклама - с заменой кода!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    private fun loadInterAd() {
//        val adRequest = AdRequest.Builder().build()
//        InterstitialAd.load(this,
//            "ca-app-pub-3940256099942544/1033173712",
//            adRequest,
//            object : InterstitialAdLoadCallback() {
//                override fun onAdFailedToLoad(p0: LoadAdError) {
//                    interAd = null
//                }
//
//                override fun onAdLoaded(ad: InterstitialAd) {
//                    interAd = ad
//                }
//            })
//    }


    private fun showInterAd() {
        if (interAd != null) {
            interAd?.fullScreenContentCallback =
                object : FullScreenContentCallback() {
                    override fun onAdDismissedFullScreenContent() {
                        nextImage()
                        interAd = null
                        // loadInterAd()
                    }

                    override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                        nextImage()
                        interAd = null
                        //loadInterAd()
                    }

                    override fun onAdShowedFullScreenContent() {
                        interAd = null
                        //loadInterAd()
                    }
                }

            interAd?.show(this)
        }
    }





}





























